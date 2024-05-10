package com.cnp.springboot.service;

import com.cnp.springboot.entity.SysUserEntity;

import java.util.List;

public interface SysUserService {

    List<SysUserEntity> getByName(String uname);

    List<SysUserEntity> getList();
}
