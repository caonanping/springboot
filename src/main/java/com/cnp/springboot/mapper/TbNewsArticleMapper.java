package com.cnp.springboot.mapper;

import com.cnp.springboot.entity.TbNewsArticle;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 文章信息表 Mapper 接口
 * </p>
 *
 * @author cnp
 * @since 2024-05-10
 */
@Mapper
public interface TbNewsArticleMapper extends BaseMapper<TbNewsArticle> {

}
