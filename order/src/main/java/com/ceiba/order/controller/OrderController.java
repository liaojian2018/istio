package com.ceiba.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @GetMapping(value = "/getOrder")
    public String getOrder(String userId) {
        return userId + " 's order is 201911292208001";
    }
}