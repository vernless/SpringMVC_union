package com.vern.exception;

/**
 * @Author 滨
 * @Date 2022/8/23 10:09
 * @Description: TODO
 * @Version 1.0
 */
public class SystemException extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public SystemException(Integer code, String message ) {
        super(message);
        this.code = code;
    }

    public SystemException( Integer code,String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
