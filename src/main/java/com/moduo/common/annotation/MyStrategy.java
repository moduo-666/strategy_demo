package com.moduo.common.annotation;

import com.moduo.common.constants.MyConstants;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义策略切换注解
 * @author Wu Zicong
 * @create 2022-01-07 15:38
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
@Component
public @interface MyStrategy {
    String value();
}
