package com.microservices.microservices.controller;

import com.microservices.microservices.config.Configuration;
import com.microservices.microservices.dto.LimitRequest;
import com.microservices.microservices.service.LimitService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/limits")
@RequiredArgsConstructor
public class LimitsController {

    private final Configuration configuration;
    private final LimitService limitService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createLimits(@RequestBody LimitRequest limitRequest){

         limitService.createLimit(limitRequest);

    }

    @GetMapping
    public int getBesta()
    {
        return configuration.getBesta();
    }
}
