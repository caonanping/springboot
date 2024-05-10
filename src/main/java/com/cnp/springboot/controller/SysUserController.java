package com.cnp.springboot.controller;

import com.cnp.springboot.entity.SysUserEntity;
import com.cnp.springboot.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @PostMapping("/user/SysUser")
    public List<SysUserEntity> searchUsername(@RequestParam String name) {
        return sysUserService.getByName(name);
    }

    @PostMapping("/user/getList")
    public List<SysUserEntity> getList() {
        return sysUserService.getList();
    }

}
