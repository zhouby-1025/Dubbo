package com.baoyu.provider;

import com.baoyu.api.ProviderServiceInterface;
import com.baoyu.bo.User;
import org.apache.dubbo.config.annotation.Service;

@Service
public class ProviderService implements ProviderServiceInterface {
    @Override
    public User getUser() {
        System.out.println("hello client , i am server");
        return new User("baoyu",18, "male");
    }
}
