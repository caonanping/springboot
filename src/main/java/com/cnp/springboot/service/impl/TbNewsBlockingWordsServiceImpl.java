package com.cnp.springboot.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cnp.springboot.common.service.impl.BaseServiceImpl;
import com.cnp.springboot.entity.TbNewsBlockingWords;
import com.cnp.springboot.mapper.TbNewsBlockingWordsMapper;
import com.cnp.springboot.resource.HttpCode;
import com.cnp.springboot.response.RespBodyObj;
import com.cnp.springboot.service.ITbNewsBlockingWordsService;
import org.springframework.expression.spel.ast.NullLiteral;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 屏蔽词信息表 服务实现类
 * </p>
 *
 * @author cnp
 * @since 2024-05-10
 */
@Service
public class TbNewsBlockingWordsServiceImpl extends BaseServiceImpl<TbNewsBlockingWordsMapper, TbNewsBlockingWords> implements ITbNewsBlockingWordsService {

    @Override
    public RespBodyObj<Page<TbNewsBlockingWords>> queryList(Page<TbNewsBlockingWords> page, Map<String, Object> params) {
        List<TbNewsBlockingWords> list = baseMapper.queryList(page, params);
        page.setRecords(list);
        return RespBodyObj.ok(page);
    }

    public RespBodyObj<TbNewsBlockingWords> add(TbNewsBlockingWords tbNewsBlockingWords) {
        TbNewsBlockingWords name = baseMapper.selectName(tbNewsBlockingWords.getShieName());
        if (name != null && !name.equals("")) {
            return RespBodyObj.error(HttpCode.SQL_SAVE_ERROR);
        }
        if (baseMapper.add(tbNewsBlockingWords) > 0) {
            return RespBodyObj.ok();
        }
        return RespBodyObj.error(HttpCode.SQL_SAVE_ERROR);
    }

    public RespBodyObj<TbNewsBlockingWords> update(TbNewsBlockingWords tbNewsBlockingWords) {
        TbNewsBlockingWords name = baseMapper.selectName(tbNewsBlockingWords.getShieName());
        if (name != null && !name.equals("")) {
            return RespBodyObj.error(HttpCode.SQL_UPDATE_ERROR);
        }
        if (baseMapper.update(tbNewsBlockingWords) > 0) {
            return RespBodyObj.ok();
        }
        return RespBodyObj.error(HttpCode.SQL_UPDATE_ERROR);
    }

    public RespBodyObj<?> delete(TbNewsBlockingWords tbNewsBlockingWords) {
        if (baseMapper.delete(tbNewsBlockingWords.getPkShieId()) > 0) {
            return RespBodyObj.ok();
        }
        return RespBodyObj.error(HttpCode.SQL_DELETE_ERROR);
    }

    public RespBodyObj<TbNewsBlockingWords> view(TbNewsBlockingWords tbNewsBlockingWords) {
        TbNewsBlockingWords result = baseMapper.view(tbNewsBlockingWords.getPkShieId());
        if (result != null) {
            return RespBodyObj.ok(result);
        } else {
            return RespBodyObj.error(HttpCode.SQL_QUERY_ISNULL);
        }
    }

}
