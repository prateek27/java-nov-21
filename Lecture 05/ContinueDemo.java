package com.prateek;

public class ContinueDemo {

    public static void main(String[] args) {

        int calories = 0;
        while(calories<=10){
            System.out.println("Calories " + calories);
            if(calories==6){
                calories = calories + 1;
                continue;
            }
            calories = calories + 2;
        }
    }

}
