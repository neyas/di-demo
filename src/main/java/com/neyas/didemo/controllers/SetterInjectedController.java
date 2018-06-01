package com.neyas.didemo.controllers;

import com.neyas.didemo.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    String sayGreeting(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
