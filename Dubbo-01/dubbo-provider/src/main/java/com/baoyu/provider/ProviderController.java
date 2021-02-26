package com.baoyu.provider;

import com.baoyu.bo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("provider")
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @RequestMapping("service")
    public User test(){
        return providerService.getUser();
    }

}
