package com.cqd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
@RestController
@EnableCircuitBreaker
@EnableHystrix
public class TestRibbo1 {
    public static void main(String[] args) {
        SpringApplication.run(TestRibbo1.class);
    }

    @RequestMapping("test1")
    public String test1(){
        System.out.println("---test1 ok--");
        return "test1 健康";
    }
}
