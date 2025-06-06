package com.example.springboot42.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.example.springboot42.proxies")
public class ProjectConfig {
}
