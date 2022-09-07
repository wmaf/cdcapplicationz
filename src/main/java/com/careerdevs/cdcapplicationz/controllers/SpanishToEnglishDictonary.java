package com.careerdevs.cdcapplicationz.controllers;

import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SpanishToEnglishDictonary {
    @GetMapping("/spanish")
    public Object spanishDefinition(RestTemplate restTemplate ){
        Object requestSpanishDefinition = restTemplate.getForObject();
        return requestSpanishDefinition;
    }
}
