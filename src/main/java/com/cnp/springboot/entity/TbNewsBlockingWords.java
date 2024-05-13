package com.cnp.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 屏蔽词信息表
 * </p>
 *
 * @author cnp
 * @since 2024-05-10
 */
@Getter
@Setter
@TableName("tb_news_blocking_words")
public class TbNewsBlockingWords implements Serializable {

    private static final long serialVersionUID = 1L;

    //屏蔽词ID
    private Long pkShieId;

    //屏蔽词名称
    private String shieName;

    //商户ID
    private String channelId;

    //是否启用（0 未启用  1 启用）
    private int enablingStatus;

    //删除状态（0 未删除  1 已删除）
    private int isDeleted;

    //创建人
    private String createUser;

    //创建时间
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    //修改人
    private String updateUser;

    //修改时间
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

}