package com.example.sfgdi.services;

import org.springframework.stereotype.Service;


public class SetterinjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter ";
    }
}
