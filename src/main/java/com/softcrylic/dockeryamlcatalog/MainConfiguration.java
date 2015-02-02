package com.softcrylic.dockeryamlcatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.softcrylic.dockeryamlcatalog"})
public class MainConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(MainConfiguration.class, args);
    }

} 
