package com.prateek;

public class StringBuilderDemo {
    public static void main(String[] args) {
        //Strings are immutable in java

        StringBuilder sb = new StringBuilder("Hello");
        sb.ensureCapacity(5);
        System.out.println(sb.capacity());
        System.out.println(sb);
        System.out.println(sb.length());

        //do modification in the object ifself
        sb.append(' ');
        sb.append("World");
        sb.insert(2,'x');
        System.out.println(sb.capacity());
        System.out.println(sb);


        //Object
        String output = sb.toString();
        System.out.println(output);


    }
}
