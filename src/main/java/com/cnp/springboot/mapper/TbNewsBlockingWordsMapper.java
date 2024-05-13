package com.cnp.springboot.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cnp.springboot.entity.TbNewsBlockingWords;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 屏蔽词信息表 Mapper 接口
 * </p>
 *
 * @author cnp
 * @since 2024-05-10
 */
@Mapper
public interface TbNewsBlockingWordsMapper extends BaseMapper<TbNewsBlockingWords> {

    List<TbNewsBlockingWords> queryList(Page<TbNewsBlockingWords> page, Map<String, Object> params);

    int add(TbNewsBlockingWords tbNewsBlockingWords);

    int update(TbNewsBlockingWords tbNewsBlockingWords);

    int delete(@Param("pkShieId") long pkShieId);

    TbNewsBlockingWords view(@Param("pkShieId") long pkShieId);

    TbNewsBlockingWords selectName(@Param("shieName") String  shieName);

}
