package com.cnp.springboot.mapper;

import com.cnp.springboot.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author cnp
 * @since 2024-05-10
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
