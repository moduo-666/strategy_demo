package com.moduo.service.impl;

import com.moduo.common.constants.MyConstants;
import com.moduo.service.DemoService;
import com.moduo.strategy.MyStrategy;
import org.springframework.stereotype.Service;

/**
 * @author Wu Zicong
 * @create 2022-01-07 15:53
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String firstDemoStrategy(String str) {
        //实用策略模式返回
        return MyStrategy.getMyStrategy(MyConstants.MY_FIRST_STRATEGY_KEY).doStrategy(str);
    }
    @Override
    public String secondDemoStrategy(String str) {
        //实用策略模式返回
        return MyStrategy.getMyStrategy(MyConstants.MY_SECOND_STRATEGY_KEY).doStrategy(str);
    }
    @Override
    public String thirdDemoStrategy(String str) {
        //实用策略模式返回
        return MyStrategy.getMyStrategy(MyConstants.MY_THIRD_STRATEGY_KEY).doStrategy(str);
    }
}
