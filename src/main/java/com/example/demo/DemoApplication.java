package com.example.demo;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        String str = "hrlo";
        System.out.println(str);
        SpringApplication.run(DemoApplication.class, args);
    }
}
