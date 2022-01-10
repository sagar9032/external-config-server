package com.capgemini.externalconfigserver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @Slf4j
public class HealthCheckControllerImplementation {

    @Value("${spring.application.name}") private String appName;
    @Autowired private Environment env;

    @GetMapping("/health")
    public String healthCheck() {
        log.info("{} can able to login to the {}.", env.getProperty("spring.security.user.name"), appName);
        return "Hello from 'EXTERNAL-CONFIG-SERVER'!";
    }

}