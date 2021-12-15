package com.prateek;

public class PassByValueDemo {
    //Pass by Value
    static void applyTax(int income){
        income = income - (int)(0.15*income);
        System.out.println(income); //85
    }

    public static void main(String[] args) {
        int income = 100;
        applyTax(income);
        System.out.println(income); //100

    }

}
