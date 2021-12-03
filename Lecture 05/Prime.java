package com.prateek;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int div = 2;
        while(div <= n-1){
            //System.out.println("Checking div " + div);
            if(n%div == 0){
                System.out.println("Not Prime");
                break;
            }
            div = div + 1;
        }
        if(div==n){
            System.out.println("Prime");
        }

        //For Loop (Same Logic)
        for(div = 2; div <= n-1; div = div + 1){
            if(n%div == 0){
                System.out.println("Not Prime (For)");
                break;
            }
        }
        if(div==n){
            System.out.println("Prime (For)");
        }

    }

}
