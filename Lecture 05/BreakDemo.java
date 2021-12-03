package com.prateek;

public class BreakDemo {
    public static void main(String[] args) {

        int calories = 0;
        //boolean mum_calls_up = true;

        while(calories<100){
            System.out.println("Burning Calories..." + calories);

            if(calories==75){
                //return;
                break;
            }
            calories = calories + 5;
        }

        System.out.println("Going to home " + calories);

    }
}
