package com.ammarnaji.nbaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class NbaapiApplication {


    public static void main(String[] args) {
        SpringApplication.run(NbaapiApplication.class, args);
    }


}
