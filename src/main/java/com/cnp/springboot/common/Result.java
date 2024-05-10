package com.cnp.springboot.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private int code;
    private String msg;
    private Object data;

    public static Result success() {
        return new Result(200, "OK", null);
    }

    public static Result success(Object data) {
        return new Result(200, "OK", data);
    }

    public static Result BAD_REQUEST() {
        return new Result(400, "Bad Request", null);
    }

    public static Result BAD_REQUEST(Object data) {
        return new Result(400, "Bad Request", data);
    }

    public static Result UNAUTHORIZED() {
        return new Result(401, "Unauthorized", null);
    }

    public static Result UNAUTHORIZED(Object data) {
        return new Result(401, "Unauthorized", data);
    }

    public static Result FORBIDDEN() {
        return new Result(403, "forbidden", null);
    }

    public static Result FORBIDDEN(Object data) {
        return new Result(403, "forbidden", data);
    }

    public static Result NOT_FOUND() {
        return new Result(404, "Not Found", null);
    }

    public static Result NOT_FOUND(Object data) {
        return new Result(404, "Not Found", data);
    }

    public static Result METHOD_NOT_ALLOWED() {
        return new Result(405, "Method Not Allowed", null);
    }

    public static Result METHOD_NOT_ALLOWED(Object data) {
        return new Result(405, "Method Not Allowed", data);
    }

    public static Result error(int code, String msg) {
        return new Result(code, msg, null);
    }

    public static Result error() {
        return new Result(500, "Internal Server Error", null);
    }

}
