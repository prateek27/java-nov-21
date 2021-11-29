package com.prateek;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int S = 0;

        for(int i=1,j=1; i<=N; i++,j+=2){
            S = S + i;
            System.out.println("J is " + j);
        }
        System.out.println("Sum is " + S);
    }

}
