package com.prateek;

public class StringBuilderExample {

    static void pattern(){

        String s = "";
        for(int i=0; i<100000;i++){
            s = s + (char)('A' + i); //inefficient
            //System.out.println(s);
        }

    }

    static void patternEfficient(){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<100000;i++){
            sb.append((char)('A' + i)); //efficient
            //System.out.println(sb);
        }
       // return sb.toString();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        pattern();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
