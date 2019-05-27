package com.lucky.mecha.advice;

import com.lucky.mecha.annotation.IgnoreResponseAdvice;
import com.lucky.mecha.vo.CommonResponse;
import com.lucky.mecha.vo.Pager;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@RestControllerAdvice
public class CommonResponseDataAdvice implements ResponseBodyAdvice<Object> {
    @Override
    @SuppressWarnings("all")
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        //如果IgnoreResponseAdvice中有定义忽略类，则排除
        if (methodParameter.getDeclaringClass().isAnnotationPresent(
                IgnoreResponseAdvice.class
        )){
            return false;
        }
        //如果IgnoreResponseAdvice中有定义忽略方法，则排除
        if (methodParameter.getMethod().isAnnotationPresent(
                IgnoreResponseAdvice.class
        )){
            return false;
        }
        return true;
    }

    @Override
    @SuppressWarnings("all")
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType,
                                  Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest,
                                  ServerHttpResponse serverHttpResponse) {
        CommonResponse<Object> response = new CommonResponse<>(0, "");
        if (null==o){//null 返回response实例
            return response;
        }else if (o instanceof CommonResponse){//已经是CommonResponse类型，强转
            response = (CommonResponse<Object>) o;
        }else if (o instanceof Pager){//专为后台Pager格式
            return o;
        }else {//其他类型，放到data中
            response.setData(o);
        }

        return response;
    }
}
