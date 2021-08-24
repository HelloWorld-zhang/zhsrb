package com.athe.zhsrb.core.controller;


import com.athe.zhsrb.core.entity.IntegralGrade;
import com.athe.zhsrb.core.service.IntegralGradeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/integralGrade")
public class IntegralGradeController {

    @Resource
    private IntegralGradeService integralGradeService;

    @GetMapping("/list")
    public List<IntegralGrade> List(){
        List<IntegralGrade> list = integralGradeService.list();
        return list;
    }

}

