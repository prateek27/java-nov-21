package com.prateek;

public class ForExample {

    public static void main(String[] args) {
        // Calories - Loop Scope
        for(int calories=0; calories<100; calories = calories + 1){
            System.out.println("Running a step " + (calories+1));
        }
        //Loop is complete
        System.out.println("Workout Complete");

        //Access a variable outside the loop (Steps - Function Scope)
        int steps = 0;
        for(  ;steps<5; steps++){
            System.out.println("Running a step " + (steps+1));
        }

        System.out.println("Steps Done" + steps);

        // For <==> While

        int stock_price = 10;
        while(stock_price < 15){
            System.out.println("Keep buying");
            stock_price++;
        }

        stock_price = 10;
        for( ; stock_price < 15; ){
            System.out.println("Keep purchasing");
            stock_price++;
        }




    }


}
