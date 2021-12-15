package com.prateek;

//Notes: https://www.cs.virginia.edu/~jh2jf/courses/cs2110/java-pass-by-value.html

public class PassByValueArrays {

    static void applyTax(int[] incomes){
        for(int i=0;i<incomes.length;i++){
            incomes[i] = incomes[i] - (int)(0.15*incomes[i]);
        }
        System.out.println("In Apply Tax " + incomes[0]);
        System.out.println(incomes);
    }

    //Pass by Value in case of Objects
    public static void main(String[] args) {
        int[] friend_incomes = {100,150,70};
        System.out.println("In Main " + friend_incomes[0]);
        System.out.println("In Main " + friend_incomes[1]);
        System.out.println("In Main " + friend_incomes[2]);
        applyTax(friend_incomes);
        System.out.println("Tax applied");
        System.out.println("In Main " + friend_incomes[0]);
        System.out.println("In Main " + friend_incomes[1]);
        System.out.println("In Main " + friend_incomes[2]);

        System.out.println(friend_incomes);
    }


}
