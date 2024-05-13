package com.cnp.springboot.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cnp.springboot.common.controller.BaseController;
import com.cnp.springboot.response.RespBodyObj;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import com.cnp.springboot.service.ITbNewsBlockingWordsService;
import com.cnp.springboot.entity.TbNewsBlockingWords;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 屏蔽词信息表 前端控制器
 * </p>
 *
 * @author cnp
 * @since 2024-05-10
 */
@RestController
@RequestMapping("/tb-news-blocking-words")
public class TbNewsBlockingWordsController extends BaseController {

    @Resource
    private ITbNewsBlockingWordsService tbNewsBlockingWordsService;

    //分页查询
    @PostMapping("page")
    public RespBodyObj<Page<TbNewsBlockingWords>> list(@RequestBody Map<String, Object> params) {
        Page<TbNewsBlockingWords> page = this.buildPage(params);
        return tbNewsBlockingWordsService.queryList(page, params);
    }

    // 新增
    @PostMapping("/save")
    public RespBodyObj<TbNewsBlockingWords> save(@RequestBody TbNewsBlockingWords tbNewsBlockingWords) {
        return tbNewsBlockingWordsService.add(tbNewsBlockingWords);
    }

    // 更新
    @PostMapping("/update")
    public RespBodyObj<TbNewsBlockingWords> update(@RequestBody TbNewsBlockingWords tbNewsBlockingWords) {
        return tbNewsBlockingWordsService.update(tbNewsBlockingWords);
    }

    //根据id进行删除
    @PostMapping("/delete")
    public RespBodyObj<?> delete(@RequestBody TbNewsBlockingWords tbNewsBlockingWords) {
        return tbNewsBlockingWordsService.delete(tbNewsBlockingWords);
    }

    //根据id查询一条数据
    @PostMapping("/view")
    public RespBodyObj<TbNewsBlockingWords> view(@RequestBody TbNewsBlockingWords tbNewsBlockingWords) {
        return tbNewsBlockingWordsService.view(tbNewsBlockingWords);
    }


}

