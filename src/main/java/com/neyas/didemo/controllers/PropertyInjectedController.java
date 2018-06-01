package com.neyas.didemo.controllers;

import com.neyas.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    // @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayGreeting() {
        return greetingServiceImpl.sayGreeting();
    }
}
