package com.moduo.runner;

import com.moduo.common.annotation.MyStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Map;
import java.util.Set;

/**
 * 当一个类实现了这个接口（ApplicationContextAware）之后，
 * 这个类就可以方便获得ApplicationContext中的所有bean。
 * 换句话说，就是这个类可以直接获取spring配置文件中，所有引用到的bean对象。
 * ApplicationContext：是spring继BeanFactory之外的另一个核心接口或容器，允许容器通过应用程序上下文环境创建、获取、管理bean
 * ApplicationRunner：容器启动的时候执行一些内容，执行时机为容器启动完成的时候
 * @author Wu Zicong
 * @create 2022-01-07 16:14
 */
@Component
@Slf4j
public class MyStrategyRunner implements ApplicationContextAware, ApplicationRunner {
    private ApplicationContext applicationContext;

    /**
     * 容器启动初始化策略集，获取ApplicationContext中所有策略集
     * @param args
     * @throws Exception
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Map<String, Object> myStrategy = applicationContext.getBeansWithAnnotation(MyStrategy.class);
        com.moduo.strategy.MyStrategy.initStrategyMap(myStrategy);
        log.info("策略key：{}",myStrategy.keySet());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
