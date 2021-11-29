package com.prateek;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int units = myScanner.nextInt();
        int bill;

        if(units <=100){
            bill = 0;
        }
        else if(units<=200){
            bill =  (units-100)*5;
        }
        else if(units<=300){
            bill = 0 + 100*5 + (units - 200)*10;
        }
        else{
            bill = 0 + 100*5 + 100*10 + (units - 300)*12;
        }
        System.out.println("final bill " + bill);
    }



}
