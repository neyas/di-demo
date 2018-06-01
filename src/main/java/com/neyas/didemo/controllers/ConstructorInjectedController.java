package com.neyas.didemo.controllers;

import com.neyas.didemo.services.GreetingService;

public class ConstructorInjectedController {
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayGreeting(){
        return greetingService.sayGreeting();
    }
}
