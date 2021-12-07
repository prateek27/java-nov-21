package com.prateek;

public class FactorialRecursion {

    static int factorial(int n){
        //base case
        if(n==0){
            return 1;
        }
        // rec case
        int ans = factorial(n-1)*n;
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }


}
