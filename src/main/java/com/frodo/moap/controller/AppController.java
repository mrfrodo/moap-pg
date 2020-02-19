package com.frodo.moap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping(path = "ping")
    public String pong() {
        System.out.println("ping pong");
        return "pong";
    }
}
