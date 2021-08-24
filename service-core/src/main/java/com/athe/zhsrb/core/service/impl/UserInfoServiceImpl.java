package com.athe.zhsrb.core.service.impl;

import com.athe.zhsrb.core.entity.UserInfo;
import com.athe.zhsrb.core.mapper.UserInfoMapper;
import com.athe.zhsrb.core.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息 服务实现类
 * </p>
 *
 * @author zh
 * @since 2021-06-04
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
