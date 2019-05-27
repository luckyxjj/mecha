package com.lucky.mecha.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})//排除类和方法
@Retention(RetentionPolicy.RUNTIME)
public @interface IgnoreResponseAdvice {
}
