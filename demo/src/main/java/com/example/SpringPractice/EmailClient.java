package com.example.SpringPractice;

public class EmailClient{
    private SpellChecker spellChecker;
    
    EmailClient(SpellChecker spellChecker){
        this.spellChecker = spellChecker; 

    }
    void sendemail(String email)
    {
        spellChecker.checkespelling(email);
        System.out.println("sending email  " + email);
    }
}
