package com.cnp.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 文章信息表
 * </p>
 *
 * @author cnp
 * @since 2024-05-10
 */
@Getter
@Setter
@TableName("tb_news_article")
public class TbNewsArticle implements Serializable {

    private static final long serialVersionUID = 1L;

    //文章ID
    private Long articleId;

    //文章标题
    private String articleTitle;

    //文章副标题
    private String articleSubtitle;

    //文章分类名称
    private String assortName;

    //排序
    private Long sort;

    //图片地址
    private String articleUrl;

    //TEXT文本数据类型(适用于超长文本信息存储)
    private String content;

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