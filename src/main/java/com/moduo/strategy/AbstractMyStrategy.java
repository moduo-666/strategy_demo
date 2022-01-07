package com.moduo.strategy;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 自定义策略方法抽象实现类
 * @author Wu Zicong
 * @create 2022-01-07 15:28
 */
@Component
@Slf4j
@Data
public abstract class AbstractMyStrategy implements MyStrategy {
    /**
     * 策略通用方法，这里可以写策略的通用逻辑代码
     * @param str
     * @return
     */
    @Override
    public String doStrategy(String str) {
        //完成通用逻辑后，再到各个策略自己的逻辑
        return demoStrategy(str);
    }

    /**
     * 策略独有方法，这里可以写各个策略自己的逻辑代码
     * @param str
     * @return
     */
    public abstract String demoStrategy(String str);
}
