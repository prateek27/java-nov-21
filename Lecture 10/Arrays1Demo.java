package com.prateek;

import java.util.Scanner;

public class Arrays1Demo {

    static void playWithArray(){
        //Hardcode
        int[] arr = {10,20,30,40,30};

        System.out.println(arr.length);
        //Print
        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        //Enhanced for-loop
        for(int x : arr){
            System.out.print(x + ",");
        }
    }

    static void printArray(int[] myArr){
        for(int val : myArr){
            System.out.println(val);
        }
    }
    static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //create an array of n size
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    // Search for an element inside a array
    static int linearSearch(int[] arr,int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    //write a function that returns an array of all occurences of that key in given array

    //LIVE Assignment
    static int[] linearSearchAll(int [] arr,int x){
        //output
        int[] output = new int[arr.length + 1];
        int j = 0;

        //iterate over the input
        for(int i=0; i < arr.length; i++){
            if(arr[i]==x) {
                output[j] = i;
                j = j + 1;
            }
        }
        //end of the loop
        output[j] = -1;
        return output;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println(arr);
        printArray(arr);
        //System.out.println(linearSearch(arr,18));
        int[] occ = linearSearchAll(arr,18);
        for(int j=0; occ[j]!=-1;j++){
            System.out.println("Position of 18 is " + occ[j]);
        }

    }
}
