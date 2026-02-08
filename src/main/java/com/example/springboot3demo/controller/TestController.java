package com.example.springboot3demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @date: 2026/2/9 0:55
 * @author: dd
 */
@Tag(name = "测试")
@RestController
@RequestMapping("/api/test")
public class TestController {
    @GetMapping("/getTest")
    @Operation(summary = "测试接口")
    public String getTest() {
        return "ok";
    }
}
