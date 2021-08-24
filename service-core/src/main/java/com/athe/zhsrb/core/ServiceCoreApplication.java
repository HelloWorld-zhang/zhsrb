package com.athe.zhsrb.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.athe.zhsrb","com.athe.zhsrb.common"})
public class ServiceCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceCoreApplication.class,args);
    }
}
