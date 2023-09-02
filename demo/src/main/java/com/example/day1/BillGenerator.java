package com.example.day1;

import java.util.Scanner;

public class BillGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of cloths you want to buy");
        double finalBill;
        double discountBill;
        double netAmount = 0;
        int noOfcloths = sc.nextInt();
        netAmount = 500* noOfcloths;
        System.out.println("netAmount : " + netAmount);
        if(netAmount >=10000){
            System.out.println("you will be getting 30 % discount");
            discountBill = (netAmount*30)/100;
            System.out.println("discount amount : "+ discountBill);
            finalBill = netAmount - discountBill;
            System.out.println("final amount : "+ finalBill);
            }
            else
            finalBill = netAmount;

     System.out.println("please pay rs "+ finalBill + " only");
     sc.close();
    }
    
}
