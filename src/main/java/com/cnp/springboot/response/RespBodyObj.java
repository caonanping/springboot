package com.cnp.springboot.response;

import com.cnp.springboot.resource.HttpCode;

import java.io.Serializable;

/**
 * 后台响应
 *
 * @param <T>
 */
public class RespBodyObj<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer status;
    private String msg;
    private T data;

    public RespBodyObj() {

    }

    public RespBodyObj(HttpCode status) {
        this.status = status.value();
        this.msg = status.msg();
    }

    public RespBodyObj(HttpCode status, T data) {
        this.status = status.value();
        this.msg = status.msg();
        this.data = data;
    }

    public RespBodyObj(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public RespBodyObj(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static <T> RespBodyObj<T> error() {
        return error(HttpCode.INTERNAL_SERVER_ERROR);
    }

    public static <T> RespBodyObj<T> error(HttpCode status) {
        return new RespBodyObj<T>(status);
    }

    public static <T> RespBodyObj<T> error(int status, String msg) {
        return new RespBodyObj<T>(status, msg);
    }

    public static <T> RespBodyObj<T> ok() {
        return new RespBodyObj<T>(HttpCode.OK);
    }

    public static <T> RespBodyObj<T> ok(T data) {
        RespBodyObj<T> respBody = new RespBodyObj<T>(HttpCode.OK, data);
        return respBody;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 判断是否执行成功
     *
     * @return
     */
    public boolean result() {
        if (this.status.equals(HttpCode.OK.value())) {
            return true;
        }
        return false;
    }

    /**
     * 重写toString
     *
     * @return
     */
    @Override
    public String toString() {
        return "响应状态：status=" + this.status + ";响应提示：msg=" + this.msg + ";响应数据：" + this.data;
    }

}
