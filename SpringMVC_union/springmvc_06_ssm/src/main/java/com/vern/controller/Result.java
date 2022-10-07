package com.vern.controller;

/**
 * @Author 滨
 * @Date 2022/8/23 9:08
 * @Description: TODO
 * @Version 1.0
 */
public class Result {
    private Object data;
    private Integer code;
    private String message;

    public Result() {
    }

    public Result(Integer code, Object data ) {
        this.data = data;
        this.code = code;
    }

    public Result(Integer code, Object data, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    /**
     * 获取
     * @return data
     */
    public Object getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 获取
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 设置
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * 获取
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return "Result{data = " + data + ", code = " + code + ", message = " + message + "}";
    }
}
