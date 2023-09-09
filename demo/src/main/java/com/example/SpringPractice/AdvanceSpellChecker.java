package com.example.SpringPractice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AdvanceSpellChecker implements SpellChecker{
   public void checkespelling(String email){
        //code for checking speellings
        //checking length
        //checking language
        System.out.println(" advanced spell checking is done "); 
    }
}
