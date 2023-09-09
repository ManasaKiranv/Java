package com.example.SpringPractice;

import org.springframework.stereotype.Component;

@Component
public class BasicSpellChecker implements SpellChecker{
    public void checkespelling(String email){
        //code for checking speellings
        System.out.println(" basic spell checking is done ");    }
}
