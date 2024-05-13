package com.cnp.springboot.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cnp.springboot.common.service.BaseService;
import com.cnp.springboot.entity.TbNewsBlockingWords;
import com.cnp.springboot.response.RespBodyObj;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 屏蔽词信息表 服务类
 * </p>
 *
 * @author cnp
 * @since 2024-05-10
 */
public interface ITbNewsBlockingWordsService extends BaseService<TbNewsBlockingWords> {

    RespBodyObj<Page<TbNewsBlockingWords>>  queryList(Page<TbNewsBlockingWords> page, Map<String, Object> params);

    RespBodyObj<TbNewsBlockingWords> add(TbNewsBlockingWords tbNewsBlockingWords);

    RespBodyObj<TbNewsBlockingWords> update(TbNewsBlockingWords tbNewsBlockingWords);

    RespBodyObj<?> delete(TbNewsBlockingWords tbNewsBlockingWords);

    RespBodyObj<TbNewsBlockingWords> view(Long id);
}
