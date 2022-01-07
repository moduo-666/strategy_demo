package com.moduo.controller;

import com.moduo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wu Zicong
 * @create 2022-01-07 16:21
 */
@RequestMapping("/demo")
@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;
    @GetMapping("/first")
    public String firstDemo(){
        return demoService.firstDemoStrategy("first");
    }
    @GetMapping("/second")
    public String secondDemo(){
        return demoService.secondDemoStrategy("second");
    }
    @GetMapping("/third")
    public String thirdDemo(){
        return demoService.thirdDemoStrategy("third");
    }
}
