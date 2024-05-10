package com.cnp.springboot.service.impl;

import com.cnp.springboot.entity.SysUserEntity;
import com.cnp.springboot.mapper.SysUserMapper;
import com.cnp.springboot.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    public List<SysUserEntity> getByName(String cname) {
        return sysUserMapper.getByName(cname);
    }

    public List<SysUserEntity> getList(){
        return sysUserMapper.getList();
    }
}
