package com.prateek;

import java.util.Scanner;

public class PrimePrimesRange {

    public static void main(String[] args) {

        //Print Primes in the Range (A,B)
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        for(int n=A; n<=B; n++){

            int div = 2;
            while(div<=n-1){
                if(n%div==0){
                    break;
                }
                div = div + 1;
            }
            if(div == n){
                System.out.print(n + " ");
            }
        }
    }


}
