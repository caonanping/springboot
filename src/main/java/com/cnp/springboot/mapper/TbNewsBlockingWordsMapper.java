package com.cnp.springboot.mapper;

import com.cnp.springboot.entity.TbNewsBlockingWords;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

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

    List<TbNewsBlockingWords> list(TbNewsBlockingWords tbNewsBlockingWords);

}
