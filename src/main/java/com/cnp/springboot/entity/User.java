package com.cnp.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 *
 * </p>
 *
 * @author cnp
 * @since 2024-05-10
 */
@Getter
@Setter
@TableName("sys_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    //主键ID
    private Long id;

    //姓名
    private String name;

    //性别
    private Integer sex;

    //年龄
    private Integer age;

    //身份证号码
    private String idNo;

    //身份证号码
    private String phoneNumber;

    //邮箱
    private String email;


}