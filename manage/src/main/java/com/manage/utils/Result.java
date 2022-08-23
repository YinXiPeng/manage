package com.manage.utils;

import java.io.Serializable;

public class Result<T> implements Serializable {

    private Integer code;//
    private String message;
    private T data;


    public Result() {
        this.code=0;
        this.message ="执行成功";
    }

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static Result error(String message){
        return new Result(500, message);
    }

    public static <T> Result success(T data){
        return new Result(200, "成功", data);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
