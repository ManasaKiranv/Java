package com.example.day1;

import java.util.Scanner;
// code for booking the no of cabsaccording to no of people if 6cab can have only 3 people.
public class BookCab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many people are there : ");
        int noOfPeople = sc.nextInt();
        System.out.println(" only 3 people are enough for one cab so, ");
        if((noOfPeople%3)== 0){
            System.out.println("please book "+ noOfPeople/3+" cabs");
         }else
            System.out.println("please book "+ (noOfPeople/3+1)+" cabs");
            sc.close();
    }
   
    
    
}
