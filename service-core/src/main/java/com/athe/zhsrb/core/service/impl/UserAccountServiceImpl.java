package com.athe.zhsrb.core.service.impl;

import com.athe.zhsrb.core.entity.UserAccount;
import com.athe.zhsrb.core.mapper.UserAccountMapper;
import com.athe.zhsrb.core.service.UserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author zh
 * @since 2021-06-04
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
