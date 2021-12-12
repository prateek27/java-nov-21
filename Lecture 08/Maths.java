package com.prateek;

public class Maths1 {

    static int sumOfDivisors(int N){
        int sum = 0;
        for(int i=1; i*i<=N; i++){
            if(N%i==0) {
                //got a divisor
                if (i * i == N) {
                    System.out.println(i);
                    sum = sum + i;
                } else {
                    System.out.println(i);
                    System.out.println(N/i);
                    sum = sum + i + (N / i);
                }
            }
        }
        return sum;
    }

    // Prime Factorisation
    static void printPrimeFactors(int N){

        for(int i=2; i<=N; i++){

            if(N%i==0){
                while(N%i==0){
                    System.out.print(i + ",");
                    N = N/i;
                }
            }
        }
        return;
    }
    // Prime Factorisation
    static void printPrimeFactorsEfficient(int N){
        for(int i=2; i*i<=N; i++){
            if(N%i==0){
                while(N%i==0){
                    System.out.print(i + ",");
                    N = N/i;
                }
            }
        }
        if(N!=1){
            System.out.println(N);
        }
        return;
    }

    public static void main(String[] args) {
        int N = 44;
       // System.out.println(sumOfDivisors(N));
        printPrimeFactorsEfficient(N);
    }

}
