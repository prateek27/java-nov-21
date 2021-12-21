package com.prateek;

import java.util.Scanner;

public class StringsDemo {

    /* Create Strings,
        Storage at Memory Level,
        String Pool,
        String Comparison,
        Inputs using Scanner,
        String Immutability,
        String Builder,
        1-2 Problems on Strings
     */

    public static void main(String[] args) {
        /*
        String a = "Hello";
        String b = a;
        String c = "Hello";
        String d = new String("Hello");
        System.out.println(a);
        System.out.println(b);

        System.out.println(" Ref Equals " + (a==b) +" Value Equals " + a.equals(b));
        System.out.println(" Ref Equals " +(a==c) + " Value Equals " + a.equals(c));
        System.out.println(" Ref Equals " + (a==d) + " Value Equals " + a.equals(d));
        // Compare the  value of two strings
        // .equals()
        a.equals(b);

        // int arr[] = new int[10];
        // System.out.println(arr);
        String x = "Hello";
        String y = "Hello";
        y = "World"; //changing y, will not update the value of x

        String mentor = "Prateek";
        String name = "Prateek";
        System.out.println(name);
        name = "Prateek Instructor";
        System.out.println(name);

        */
        //Concatenation (String Objects can't be updated ===> Immutable)
        String book = "Java";
        book = book.concat("Programming"); //updating the object reference
        System.out.println(book);

        //Inputs
        String s;
        Scanner sc = new Scanner(System.in);
        //s = sc.next();
        s = sc.nextLine();
        System.out.println(s);

        //LIVE Assignment : To Check if image ends with .jpg or .png
        if(s.endsWith(".jpg") || s.endsWith(".png")){
            System.out.println("Its a image file");
        }
        else{
            System.out.println("Not an image");
        }

        //Play with lot of string functions
        String paragraph = "i love eating apples, an apple apple a day keep the doctor away";
        findAllOcc(paragraph,"apple");
        //int idx = paragraph.indexOf("dog"); //returns -1 if element is not found
        //System.out.println(idx);




    }
    //LIVE assignment / 10.40
    static void findAllOcc(String para, String word){

        int idx = para.indexOf(word);
        while(idx!=-1){
            System.out.println(idx);
            idx = para.indexOf(word,idx+1);
        }
    }



}
