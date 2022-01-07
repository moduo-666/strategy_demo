package com.moduo.strategy;

import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略模式接口
 * @author Wu Zicong
 * @create 2022-01-07 15:07
 */
public interface MyStrategy {
    /**
     * 创建策略集
     */
    Map<String,MyStrategy> saveMyStrategyMap = new HashMap<String,MyStrategy>();

    /**
     * 初始化策略集方法
     * @param springSaveMyStrategyMap
     */
    static void initStrategyMap(Map springSaveMyStrategyMap){
        if(!CollectionUtils.isEmpty(springSaveMyStrategyMap)){
            saveMyStrategyMap.putAll(springSaveMyStrategyMap);
        }
    }

    /**
     * 根据策略key获取策略
     * @param strategyKey
     * @return
     */
    static MyStrategy getMyStrategy(String strategyKey){
        Assert.hasText(strategyKey,"stearefyKey must not be empty");
        return saveMyStrategyMap.get(strategyKey);
    }

    /**
     * 自定义策略方法
     * @param str
     * @return
     */
    String doStrategy(String str);
}
