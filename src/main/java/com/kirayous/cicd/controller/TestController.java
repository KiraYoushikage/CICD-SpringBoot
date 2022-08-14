package com.kirayous.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author KiraYous
 * @version V1.0
 * @Package com.kirayous.cicd.controller
 * @date 2022/8/14 15:35
 */

@RestController
@RequestMapping("/cicd")
public class TestController {
    @GetMapping("/test")
    public String testCICD(){
        return "cicd success!";
    }
}
