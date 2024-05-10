package com.cnp.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

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
    private Long shieId;

    //屏蔽词名称
    private String shieName;

    //商户ID
    private Integer channelId;

    //是否启用（0 未启用  1 启用）
    private Boolean enablingStatus;

    //删除状态（0 未删除  1 已删除）
    private Boolean isDeleted;

    //创建人
    private String createUser;

    //创建时间
    private LocalDateTime createTime;

    //修改人
    private String updateUser;

    //修改时间
    private LocalDateTime updateTime;


}