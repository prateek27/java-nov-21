package com.prateek;

import java.util.Scanner;

public class BranchingTest {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); //Keyboard Input
        int a = myScanner.nextInt();
        int b = myScanner.nextInt();

        System.out.println("You entered " + a + " " + b);

        if(a > 80){
            System.out.println("Let's Party");
        }
        else if( a > 70){
            System.out.println("good going");
            System.out.println("sum of numbers is " + (a+b));
        }
        else{
            System.out.println("Work Hard");
        }


    }

}
