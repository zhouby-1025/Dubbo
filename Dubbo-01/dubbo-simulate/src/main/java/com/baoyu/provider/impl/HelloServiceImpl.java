package com.baoyu.provider.impl;

import com.baoyu.provider.api.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String userName) {
        return "ni hao "+userName+"!~";
    }
}
