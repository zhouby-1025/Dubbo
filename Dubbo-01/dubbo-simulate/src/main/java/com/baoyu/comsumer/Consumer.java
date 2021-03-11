package com.baoyu.comsumer;

import com.baoyu.framework.ProxyFactory;
import com.baoyu.provider.api.HelloService;

public class Consumer {

    public static void main(String[] args) {

        HelloService helloService = ProxyFactory.getProxy(HelloService.class);
        String result = helloService.sayHello("xx22x");
        System.out.println(result);


    }
}
