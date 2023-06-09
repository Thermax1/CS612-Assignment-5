package com.example.munozpage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(AppConfig.class)
public class MunozPageApplication {

    public static void main(String[] args) {
        SpringApplication.run(MunozPageApplication.class, args);
    }

}