package com.prateek;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String operation = sc.next();
        int b = sc.nextInt();

        switch(operation){
            case "+" :
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            default:
                //no match (Optional to have default)
                System.out.println("Enter +,- or *");

        }
        System.out.println("Thanks for using!");
    }
}
