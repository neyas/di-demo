package com.neyas.didemo.controllers;

import com.neyas.didemo.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    String sayHello() {
        return getGreetingService().sayGreeting();
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }
}
