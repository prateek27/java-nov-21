package com.prateek;

public class WhileDemo {

    public static void main(String[] args) {

        int calories = 0;

        while(calories < 100){
            System.out.println("Run a Step " + (calories + 1));
            calories = calories + 1;
        }
        System.out.println("Workout Complete");
    }

}
