package com.prateek;

import java.sql.SQLOutput;

public class MathsTwo {

    int trailingZeroes(int n){
        int ans = 0;
        int p = 5;
        while( (n/p) > 0 ){
            ans = ans + n/p;
            p = p*5;
        }
        return ans;
    }

    static int binaryToDecimal(int n){

        int ans = 0;
        int p = 1;

        while(n!= 0){
            int last_digit = n%10;
            ans = ans + last_digit*p;
            //update power & number
            p = p*2 ;
            n = n/10;
        }
        return ans;
    }

    static int decimalToBinary(int n){

        int p = 1;
        int ans = 0;

        while(n!=0){
            int rem = n%2;
            ans = ans + rem*p;
            p = p*10;
            n = n/2;
        }
        return ans;
    }

    static int magicNo(int n){

        int p = 5;
        int ans = 0;
        while(n>0){
            int last_bit = n%2;
            ans = ans + last_bit*p;
            p = p*5;
            n = n/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int  n = 1000;
        // find trailing in 100!
       // System.out.println(trailingZeroes(n));
        System.out.println(decimalToBinary(5));
        System.out.println(binaryToDecimal(1101));
        System.out.println(magicNo(5 ));

    }

}
