package com.prateek;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PrimeFunctionDemo {


    static boolean isPrime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                //prime or not prime?
                return false;
            }
        }
        //must be prime
        return true;
    }

    static void printInRange(int a,int b){
        for(int i=a; i<=b; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        printInRange(a,b);

//        System.out.println(isPrime(n));
//        String output = isPrime(n) ? "Yes" : "No";
//        System.out.println(output);


    }

}
