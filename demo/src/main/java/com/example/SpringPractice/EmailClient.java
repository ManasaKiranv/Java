package com.example.SpringPractice;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmailClient{
    @Autowired
  //  @Qualifier("new AdvancedSpellchecker()")
    private SpellChecker spellChecker;
    
    // EmailClient(SpellChecker spellChecker){
    //     this.spellChecker = spellChecker; 

    // }
    // public SpellChecker getSpellChecker(){
    //     return spellChecker;
    // }
     @Autowired
    public void setSpellChecker(SpellChecker spellChecker){
       this.spellChecker = spellChecker;
}

    void sendemail(String email)
    {
        spellChecker.checkespelling(email);
        System.out.println("sending email  " + email);
    }
}
