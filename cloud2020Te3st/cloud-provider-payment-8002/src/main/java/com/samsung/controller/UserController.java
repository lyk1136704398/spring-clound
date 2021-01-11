package com.samsung.controller;

import com.samsung.entities.CommonResult;
import com.samsung.entities.User;
import com.samsung.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/user/create")
    public CommonResult create(User user){
        int result = userService.create(user);
        if(result>0){
            return new CommonResult(200,"插入数据成功,serverPort:"+serverPort,result);
        }else{
            return new CommonResult(401,"插入数据库失败",0);
        }
    }

    @GetMapping(value = "/user/get/{id}")
    public CommonResult getUserById(@PathVariable("id") Long id){
        User result = userService.getUserById(id);
        if(result != null){
            return new CommonResult(200,"查询成功,serverPort:"+serverPort,result);
        }else{
            return new CommonResult(401,"查询失败",0);
        }
    }
}
