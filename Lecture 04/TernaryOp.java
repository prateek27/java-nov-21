package com.prateek;

public class TernaryOp {
    public static void main(String[] args) {
        int hall_size = 50;
        int friends = hall_size > 10 ? 30 : 5;
        System.out.println("Friends coming to party " + friends );

        String numberType = hall_size % 2 == 0 ? "Even" : "Odd";
        System.out.println("Number Type" + numberType);

    }
}
