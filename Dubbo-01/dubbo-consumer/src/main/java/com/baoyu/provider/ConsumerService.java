package com.baoyu.provider;

import com.alibaba.fastjson.JSONObject;
import com.baoyu.api.ProviderServiceInterface;
import com.baoyu.bo.User;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @Reference
    private ProviderServiceInterface providerService;

    public String test(){
        //use remote http call to a simple demo
        String result = HttpClient.get("http://localhost:8080/provider/service");
        User user = JSONObject.parseObject(result, User.class);
        return user.getName();
    }

}
