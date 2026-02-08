package com.example.springboot3demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @date: 2026/2/8 15:34
 * @author: dd
 */
@Configuration
public class TestConfiguration {
    /**
     * nacos配置中心取
     */
    @Value("${test}")
    private String test;
}
