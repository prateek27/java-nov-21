package com.prateek;

import org.w3c.dom.ls.LSOutput;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>(5);
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            String fruit = sc.next();
            fruits.add(fruit);
        }
        fruits.remove("banana");

        //print
        System.out.println(fruits);
        //loop
        for(int i=0; i<fruits.size();i++){
            System.out.println(fruits.get(i));
        }

        //second way
        for(String fruit:fruits){
            System.out.println(fruit);
        }

        //third way
        fruits.forEach((fruit)-> System.out.println(fruit));
    }

    static void playWithArrayList(){
        ArrayList<Integer> list = new ArrayList<>(10);
        //list.ensureCapacity(5);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(1,2);


        System.out.println(list);

        list.remove(4);
        Integer val = 5;
        list.remove(val);
        System.out.println(list.contains(5));

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //System.out.println(list.size());
        playWithInts();
    }

    static void playWithInts(){
        //Integer is a object
        Integer x = 5;
        String s = x.toString();

        //BigInteger
        BigInteger b = new BigInteger("54111119932992392392399329292932939239329993292");
        BigInteger b2 = new BigInteger("20");

        System.out.println(b);
        System.out.println(b.add(b2));
        System.out.println(b.gcd(b2));
    }

}
