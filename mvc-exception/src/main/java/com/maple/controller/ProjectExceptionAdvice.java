package com.maple.controller;

import com.maple.exception.BusinessException;
import com.maple.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice  //声明异常处理，rest风格
public class ProjectExceptionAdvice {

    @ExceptionHandler(SystemException.class) //声明异常处理器，传递需要处理的异常
    public Result doSystemException(SystemException ex){
        //记录日志
        //发送消息给运维
        //发送邮件给开发
        return new Result(ex.getCode(), null, ex.getMessage());
    }
    @ExceptionHandler(BusinessException.class) //声明异常处理器，传递需要处理的异常
    public Result doBusinessException(BusinessException ex){
        //记录日志
        //发送消息给运维
        //发送邮件给开发
        return new Result(ex.getCode(), null, ex.getMessage());
    }
    @ExceptionHandler(Exception.class) //声明异常处理器，传递需要处理的异常
    public Result doException(Exception ex){
        System.out.println("其他异常");
        return new Result(Code.SYSTEM_UNKNOW_ERR,null,"系统繁忙，请稍后...");
    }
}
