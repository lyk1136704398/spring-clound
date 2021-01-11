package com.samsung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaMain {
	//分支冲突测试，冲突测试
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain.class,args);
    }
}
