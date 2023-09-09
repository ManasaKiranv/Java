package com.example.SpringPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmailApp{
   private static  ApplicationContext contex;
    public static void main(String[] args) {
      contex = new AnnotationConfigApplicationContext(AppConfig.class);
     // contex = new ClassPathXmlApplicationContext("bean.xml");
       EmailClient email = contex.getBean("emailClient",EmailClient.class);
       
       
       // EmailClient email= new EmailClient(new BasicSpellChecker());
       email.sendemail("hello , there");
       email.sendemail("second mail sent");
       //contex.close();
      // ((ClassPathXmlApplicationContext) context).close();
    }
}
