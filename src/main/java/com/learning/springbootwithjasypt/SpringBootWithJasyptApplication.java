package com.learning.springbootwithjasypt;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class SpringBootWithJasyptApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWithJasyptApplication.class, args);
    }

}
