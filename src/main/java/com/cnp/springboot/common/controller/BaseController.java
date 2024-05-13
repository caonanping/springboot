package com.cnp.springboot.common.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cnp.springboot.utils.StrUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * 请求控制器的公共类
 */
public class BaseController {

    /**
     * 封装分页查询参数
     * @param params
     * @param <T>
     * @return
     */
    protected <T> Page<T> buildPage(Map<String, Object> params) {
        String ct = StrUtil.valueOf(params.get("current"));
        Integer currentStr = null;
        if(!StringUtils.isEmpty(ct)){
            currentStr = Integer.valueOf(ct);
        }

        String sz = StrUtil.valueOf(params.get("pageSize"));
        Integer sizeStr = null;
        if(!StringUtils.isEmpty(sz)){
            sizeStr = Integer.valueOf(sz);
        }else{
            sz = StrUtil.valueOf(params.get("size"));
            if(!StringUtils.isEmpty(sz)){
                sizeStr = Integer.valueOf(sz);
            }
        }

        int current = 1;
        int size = 10;
        if (currentStr != null) {
            current = currentStr.intValue();
        }
        if (sizeStr != null) {
            size = sizeStr.intValue();
        }
        Page<T> page = new Page<T>(current, size);
        return page;
    }

    /**
     * 驼峰法转下划线
     * @param line
     * @return
     */
    private static String camelToUnderline(String line) {
        if (line == null || "".equals(line)) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        String underline = "_";
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append(underline);
            }
            sb.append(Character.toLowerCase(c));
        }
        return sb.toString();
    }


}
