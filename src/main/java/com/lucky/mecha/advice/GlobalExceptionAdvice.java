package com.lucky.mecha.advice;

import com.lucky.mecha.exception.MechaException;
import com.lucky.mecha.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = MechaException.class)//MechaException
    public CommonResponse<String> handlerAdException(HttpServletRequest request, MechaException exception){
        CommonResponse<String> response = new CommonResponse<>(-1, exception.getMessage());
//        response.setData(exception.getMsg());
        return response;
    }

    @ExceptionHandler(value = Exception.class)//Exception
    public CommonResponse<String> handlerException(Exception e){
        CommonResponse<String> response = new CommonResponse<>(500, "服务器异常");
        response.setData(e.getMessage());
        return response;
    }
}
