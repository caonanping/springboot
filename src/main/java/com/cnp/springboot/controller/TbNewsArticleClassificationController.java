package com.cnp.springboot.controller;

import com.cnp.springboot.common.Result;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.cnp.springboot.service.ITbNewsArticleClassificationService;
import com.cnp.springboot.entity.TbNewsArticleClassification;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 文章分类信息表 前端控制器
 * </p>
 *
 * @author cnp
 * @since 2024-05-10
 */
@RestController
@RequestMapping("/tb-news-article-classification")
public class TbNewsArticleClassificationController {

    @Resource
    private ITbNewsArticleClassificationService tbNewsArticleClassificationService;

    // 查询所有数据
    @GetMapping
    public Result findAll() {
        return Result.success(tbNewsArticleClassificationService.list());
    }

    // 新增或者更新
    @PostMapping
    public Result save(@RequestBody TbNewsArticleClassification tbNewsArticleClassification) {
        tbNewsArticleClassificationService.saveOrUpdate(tbNewsArticleClassification);
        return Result.success();
    }

    //根据id进行删除
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        tbNewsArticleClassificationService.removeById(id);
        return Result.success();
    }

    //根据list ids批量删除方法
    @PostMapping("/del/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        tbNewsArticleClassificationService.removeByIds(ids);
        return Result.success();
    }

    //根据id查询一条数据
    @GetMapping("/{id}")
    public Result findOne(@PathVariable Integer id) {
        return Result.success(tbNewsArticleClassificationService.getById(id));
    }

    //分页查询
    @GetMapping("/page")
    public Result findPage(@RequestParam Integer pageNum,
                           @RequestParam Integer pageSize) {
        QueryWrapper<TbNewsArticleClassification> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        return Result.success(tbNewsArticleClassificationService.page(new Page<>(pageNum, pageSize), queryWrapper));
    }

}

