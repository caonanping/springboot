package com.cnp.springboot.service;

import com.cnp.springboot.entity.SysUserEntity;
import com.cnp.springboot.entity.TbNewsBlockingWords;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 屏蔽词信息表 服务类
 * </p>
 *
 * @author cnp
 * @since 2024-05-10
 */
public interface ITbNewsBlockingWordsService extends IService<TbNewsBlockingWords> {

    List<TbNewsBlockingWords> list(TbNewsBlockingWords tbNewsBlockingWords);


}
