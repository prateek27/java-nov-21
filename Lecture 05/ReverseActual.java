package com.prateek;

import java.util.Scanner;

public class ReverseActual {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        for(;n!=0; n=n/10){
            int last_digit = n%10;
            ans = ans * 10 + last_digit;
            // System.out.println(ans);
        }
        System.out.println(ans);
    }


}
