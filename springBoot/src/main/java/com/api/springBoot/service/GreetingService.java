package com.api.springBoot.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String saluda(String nom) {
        return "Hola " + nom + "!";
    }
}
