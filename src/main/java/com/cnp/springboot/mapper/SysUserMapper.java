package com.cnp.springboot.mapper;

import com.cnp.springboot.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysUserMapper {

    List<SysUserEntity> getByName(@Param("name") String name);

    List<SysUserEntity> getList();

}
