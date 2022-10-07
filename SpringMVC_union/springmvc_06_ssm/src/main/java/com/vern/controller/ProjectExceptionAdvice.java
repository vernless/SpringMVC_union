package com.vern.controller;

import com.vern.exception.BusinessException;
import com.vern.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author 滨
 * @Date 2022/8/23 9:57
 * @Description: TODO
 * @Version 1.0
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException e){
        //记录日志
        //发送消息给运维人员
        //发送邮件给开发人员
        return new Result(e.getCode(),null,e.getMessage());
    }


    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException e){
        //记录日志
        //发送消息给运维人员
        //发送邮件给开发人员
        return new Result(e.getCode(),null,e.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public Result doException(Exception e){
        //记录日志
        //发送消息给运维人员
        //发送邮件给开发人员
        return new Result(Code.SYSTEM_UNKNOWN_ERR,null,"系统繁忙，请稍后再试");
    }
}
