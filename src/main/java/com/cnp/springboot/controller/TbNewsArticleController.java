package com.cnp.springboot.controller;

import com.cnp.springboot.common.Result;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import jakarta.annotation.Resource;

import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.cnp.springboot.service.ITbNewsArticleService;
import com.cnp.springboot.entity.TbNewsArticle;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 文章信息表 前端控制器
 * </p>
 *
 * @author cnp
 * @since 2024-05-10
 */
@RestController
@RequestMapping("/tb-news-article")
public class TbNewsArticleController {

    @Resource
    private ITbNewsArticleService tbNewsArticleService;

    // 查询所有数据
    @GetMapping
    public Result findAll() {
        return Result.success(tbNewsArticleService.list());
    }

    // 新增或者更新
    @PostMapping
    public Result save(@RequestBody TbNewsArticle tbNewsArticle) {
        tbNewsArticleService.saveOrUpdate(tbNewsArticle);
        return Result.success();
    }

    //根据id进行删除
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        tbNewsArticleService.removeById(id);
        return Result.success();
    }

    //根据list ids批量删除方法
    @PostMapping("/del/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        tbNewsArticleService.removeByIds(ids);
        return Result.success();
    }

    //根据id查询一条数据
    @GetMapping("/{id}")
    public Result findOne(@PathVariable Integer id) {
        return Result.success(tbNewsArticleService.getById(id));
    }

    //分页查询
    @GetMapping("/page")
    public Result findPage(@RequestParam Integer pageNum,
                           @RequestParam Integer pageSize) {
        QueryWrapper<TbNewsArticle> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        return Result.success(tbNewsArticleService.page(new Page<>(pageNum, pageSize), queryWrapper));
    }

}

