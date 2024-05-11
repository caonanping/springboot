package com.cnp.springboot.service.impl;

import com.cnp.springboot.common.Result;
import com.cnp.springboot.entity.TbNewsBlockingWords;
import com.cnp.springboot.mapper.TbNewsBlockingWordsMapper;
import com.cnp.springboot.service.ITbNewsBlockingWordsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 屏蔽词信息表 服务实现类
 * </p>
 *
 * @author cnp
 * @since 2024-05-10
 */
@Service
public class TbNewsBlockingWordsServiceImpl extends ServiceImpl<TbNewsBlockingWordsMapper, TbNewsBlockingWords> implements ITbNewsBlockingWordsService {

    @Autowired
    public TbNewsBlockingWordsMapper tbNewsBlockingWordsMapper;

    public List<TbNewsBlockingWords> list(TbNewsBlockingWords tbNewsBlockingWords) {
        return tbNewsBlockingWordsMapper.list(tbNewsBlockingWords);
    }

    public TbNewsBlockingWords add(TbNewsBlockingWords tbNewsBlockingWords){
        return tbNewsBlockingWordsMapper.add(tbNewsBlockingWords);
    }

    public TbNewsBlockingWords update(TbNewsBlockingWords tbNewsBlockingWords){
        return tbNewsBlockingWordsMapper.update(tbNewsBlockingWords);
    }

}
