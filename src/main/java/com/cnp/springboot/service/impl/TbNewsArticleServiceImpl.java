package com.cnp.springboot.service.impl;

import com.cnp.springboot.entity.TbNewsArticle;
import com.cnp.springboot.mapper.TbNewsArticleMapper;
import com.cnp.springboot.service.ITbNewsArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章信息表 服务实现类
 * </p>
 *
 * @author cnp
 * @since 2024-05-10
 */
@Service
public class TbNewsArticleServiceImpl extends ServiceImpl<TbNewsArticleMapper, TbNewsArticle> implements ITbNewsArticleService {

}
