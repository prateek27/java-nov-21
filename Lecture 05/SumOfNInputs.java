package com.prateek;

import java.util.Scanner;

public class SumOfNInputs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String myInput = sc.nextLine();
        // System.out.println(myInput);
        int N = sc.nextInt();
        int S = 0;

        //N Times
        int times = 0;
        while(times<N){
            int current_no = sc.nextInt();
            S = S + current_no;
            times = times + 1;
        }
        System.out.println("Sum is " + S);

        S = 0;
        for(times=0; times<N; times++){
            int current_no = sc.nextInt();
            S = S + current_no;
        }
        System.out.println("For Sum is " + S);
    }
}
