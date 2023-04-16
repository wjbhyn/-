package com.stdu.zhpb.schedule;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.stdu")
@ComponentScan(basePackages = "com.stdu.zhpb")
public class ServiceScheduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceScheduleApplication.class, args);
    }
}
