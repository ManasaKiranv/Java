package com.example.SpringPractice;

public class EmailApp{
    public static void main(String[] args) {
        EmailClient email= new EmailClient(new BasicSpellChecker());
        email.sendemail("hello , there");
        email.sendemail("second mail sent");

    }
}
