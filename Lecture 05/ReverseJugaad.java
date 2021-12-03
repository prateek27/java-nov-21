package com.prateek;

import java.util.Scanner;

public class ReverseJugaad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for( ;n!=0; n=n/10){
            //need a hack
            System.out.println(n%10);
        }

        /*
        while(n!=0){
            int last_digit = n%10;
            System.out.print(last_digit);
            n = n / 10;
        }*/
        System.out.println();
    }
}
