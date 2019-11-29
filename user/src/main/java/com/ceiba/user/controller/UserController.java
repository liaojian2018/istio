package com.ceiba.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${order-service.api.url}")
    private String remoteURL;

    @GetMapping(value="/getUser")
    public String getUser() {
        String result = "congratulation！";
        String postfix = "/getOrder?userId=liaojian";
        try {
            result += restTemplate.getForEntity(remoteURL + postfix, String.class).getBody();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
