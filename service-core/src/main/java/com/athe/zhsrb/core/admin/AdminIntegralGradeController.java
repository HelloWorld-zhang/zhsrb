package com.athe.zhsrb.core.admin;

import com.athe.zhsrb.common.exception.Assert;
import com.athe.zhsrb.common.exception.BusinessException;
import com.athe.zhsrb.common.result.ResponseEnum;
import com.athe.zhsrb.core.entity.IntegralGrade;
import com.athe.zhsrb.core.service.IntegralGradeService;
import com.athe.zhsrb.common.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 积分等级表 前端控制器
 * </p>
 *
 * @author zh
 * @since 2021-06-04
 */
@CrossOrigin
@RestController
@RequestMapping("/admin/core/integralGrade")
@Api(tags = "积分等级管理")
public class AdminIntegralGradeController {

    @Resource
    private IntegralGradeService integralGradeService;
    //查询所有数据
    @ApiOperation("积分等级列表")
    @GetMapping("/list")
    public R listAll(){
        List<IntegralGrade> integralGradeList = integralGradeService.list();
        return R.ok().data("integralGradeList",integralGradeList);
    }
    //逻辑删除
    @ApiOperation(value = "根据id删除积分等级",notes = "逻辑删除")
    @DeleteMapping("/remove/{id}")
    public R removeById(@PathVariable @ApiParam(value = "数据id", required = true, example = "1") Long id){
        boolean result = integralGradeService.removeById(id);
        if (result){
            return R.ok().data("result",result);
        }else{
            return R.error().message("删除失败") ;
        }
    }

    @ApiOperation(value = "新增积分等级")
    @PostMapping("/save")
    public R save(@ApiParam(value = "积分等级对象",required = true)
            @RequestBody IntegralGrade integralGrade) throws BusinessException {
       /* if (integralGrade.getBorrowAmount() == null){
            throw new BusinessException(ResponseEnum.BORROW_AMOUNT_NULL_ERROR);
        }*/
        Assert.notNull(integralGrade.getBorrowAmount(),ResponseEnum.BORROW_AMOUNT_NULL_ERROR);
        boolean save = integralGradeService.save(integralGrade);
        if (save){
            return R.ok().message("添加成功");
        }else {
            return R.error().message("添加失败");
        }
    }
    @ApiOperation("根据id查询")
    @GetMapping("/get/{id}")
    public R getById(@ApiParam(value = "根据id进行查询",required = true)
                     @PathVariable Long id ){
        IntegralGrade integralGrade = integralGradeService.getById(id);
        if (integralGrade !=null){
            return R.ok().data("integralGrade",integralGrade);
        }else {
            return R.error().message("数据不存在");
        }
    }
    @ApiOperation("更新等级积分数据")
    @PutMapping("/update")
    public R updateById(
            @ApiParam(value = "被修改积分对象",required = true)
            @RequestBody IntegralGrade integralGrade
    ){
        boolean updateById = integralGradeService.updateById(integralGrade);
        if (updateById){
            return R.ok().message("修改成功");
        }else {
            return R.error().message("修改失败");
        }
    }

}
