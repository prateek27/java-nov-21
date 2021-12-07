package com.prateek;

public class IncDec {

    static void inc(int n){
        if(n==0){
            return;
        }

        inc(n-1); //assumption
        System.out.println(n);
        return;
    }

    static void dec(int n){
        if(n==0){
            return; // not-optional
        }
        System.out.println(n);
        dec(n-1);
        return; //optional with void  because function is complete and you dont want to return a value
    }

    static int power(int a,int n){
        //base case
        if(n==0){
            return 1;
        }
        //rec case
        int ans = a * power(a,n-1);
        return ans;
    }



    public static void main(String[] args) {
        inc(5);
        dec(5);
        System.out.println(power(5,4));

    }
}
