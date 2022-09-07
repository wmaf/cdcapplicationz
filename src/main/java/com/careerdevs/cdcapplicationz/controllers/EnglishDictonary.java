package com.careerdevs.cdcapplicationz.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EnglishDictonary {
    @GetMapping("/english")
    public Object englishDefinition(RestTemplate restTemplate){
        //create var for "word"
        Object requestEnglishDefinition = restTemplate.getForObject("https://api.dictionaryapi.dev/api/v2/entries/en/test", Object.class);
        return requestEnglishDefinition;
    }






}
