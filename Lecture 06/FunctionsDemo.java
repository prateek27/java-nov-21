package com.prateek;

public class FunctionsDemo {

    static void sayHi(String name){
        System.out.println("Hi " + name);
    }

    static int areaOfSquare(int side){
        //System.out.println(side*side);
        return side*side;
    }

    public static void main(String[] args) {
        sayHi("Prateek");
        sayHi("Scaler");
        sayHi("everyone");
        System.out.println(areaOfSquare(5));
        int myArea = areaOfSquare(10);
        System.out.println(myArea);
    }

}
