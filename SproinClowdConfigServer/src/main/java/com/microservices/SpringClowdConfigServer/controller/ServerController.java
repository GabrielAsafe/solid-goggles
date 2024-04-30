package com.microservices.SpringClowdConfigServer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/server")
@RequiredArgsConstructor
public class ServerController {

    @GetMapping("/hello")
    public String sayhello(){
        return "pyta";
    }
}
