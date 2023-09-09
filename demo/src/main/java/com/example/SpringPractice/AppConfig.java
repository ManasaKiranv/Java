package com.example.SpringPractice;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages = "com.example.SpringPractice")
public class AppConfig {
    // @Bean(name = "basicSpellChecker")
    // public BasicSpellChecker createBasic()
    // {
    //     return new BasicSpellChecker();
    // }
    // @Bean(name = "advancedSpellChecker")
    // public AdvanceSpellChecker createAdvanced()
    // {
    //     return new AdvanceSpellChecker();
    // }
    // @Bean(name = "emailClient")
    // public EmailClient creatEmailClient()
    // {
    //     //return new EmailClient(createAdvanced());
    //     EmailClient emailClient = new EmailClient();
    //     emailClient.setSpellChecker(createBasic());
    //     return emailClient;
  //  }
}
