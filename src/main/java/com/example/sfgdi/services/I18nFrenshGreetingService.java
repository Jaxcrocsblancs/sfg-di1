package com.example.sfgdi.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"FR", "default"})
@Service("i18nService")
public class I18nFrenshGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {

        return "Bonjour monde - FR";
    }
}
