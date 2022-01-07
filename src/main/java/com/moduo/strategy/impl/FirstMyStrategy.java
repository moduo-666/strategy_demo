package com.moduo.strategy.impl;

import com.moduo.common.annotation.MyStrategy;
import com.moduo.common.constants.MyConstants;
import com.moduo.strategy.AbstractMyStrategy;

/**
 * 自定义策略bean
 * @author Wu Zicong
 * @create 2022-01-07 15:36
 */
@MyStrategy(MyConstants.MY_FIRST_STRATEGY_KEY)
public class FirstMyStrategy extends AbstractMyStrategy {
    @Override
    public String demoStrategy(String str) {
        System.out.println(str);
        return "i am firstStrategy";
    }
}
