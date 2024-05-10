package com.cnp.springboot.service.impl;

import com.cnp.springboot.entity.User;
import com.cnp.springboot.mapper.UserMapper;
import com.cnp.springboot.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author cnp
 * @since 2024-05-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
