package com.cnp.springboot.resource;

/**
 * 后台响应编码
 */
public enum HttpCode {

    /** 1 请求成功 */
    OK(200),
    /** 402请求参数为空 */
    REQUEST_PARAM_NULL(402),
    /** 409频繁请求 */
    FREQUENT_REQUEST(409),
    /** 500服务器出错 */
    INTERNAL_SERVER_ERROR(500),
    /** 511数据库添加数据失败 */
    SQL_SAVE_ERROR(511),
    /** 512数据库修改数据失败 */
    SQL_UPDATE_ERROR(512),
    /** 513数据库删除数据失败 */
    SQL_DELETE_ERROR(513),
    /** 514查询结果为空 */
    SQL_QUERY_ISNULL(514),
    /** 数据已存在 */
    DATA_EXISTS(564),
    /** 数据不存在 */
    DATA_NOT_EXISTS(565);

    private final Integer value;

    private HttpCode(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return this.value;
    }

    public String msg() {
        return Resources.getMessage("HTTPCODE_" + this.value);
    }

}
