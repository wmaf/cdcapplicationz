package com.careerdevs.cdcapplicationz.controllers;

import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SpanishToEnglishDictonary {
    @GetMapping("/spanish")
    public Object spanishDefinition(RestTemplate restTemplate ){
        //add API env
        Object requestSpanishDefinition = restTemplate.getForObject("https://www.dictionaryapi.com/api/v3/references/spanish/json/language?key=your-api-key", Object.class);
        return requestSpanishDefinition;
    }
}
