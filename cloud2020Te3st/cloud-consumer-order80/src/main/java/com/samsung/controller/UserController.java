package com.samsung.controller;

import com.samsung.entities.CommonResult;
import com.samsung.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class UserController {
    public static final String USER_URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/user/create")
    public CommonResult<User> create(User user) {
        return restTemplate.postForObject(USER_URL+"",user,CommonResult.class);
    }

    @GetMapping("/consumer/user/get/{id}")
    public CommonResult<User> getRestTemplate(@PathVariable("id") Long id) {
        return restTemplate.getForObject(USER_URL+"/user/get/"+id,CommonResult.class);
    }
}
