package com.scb.ratelimit;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class RatelimitDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RatelimitDemoApplication.class, args);
    }
}
