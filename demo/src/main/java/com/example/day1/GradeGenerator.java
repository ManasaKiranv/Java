package com.example.day1;
import java.util.*;
public class GradeGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is the score of the student: ");
        int score = sc.nextInt();
        if((score >=1) && (score <=4))
            System.out.println("C Grade");
        else if((score>=5)&&(score<=7))
            System.out.println("B grade");
        else if(score >=8)
            System.out.println("A grade");
            sc.close();

    }
    
}
