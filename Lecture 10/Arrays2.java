package com.prateek;

import java.util.Scanner;

public class Arrays2 {

    static Scanner sc = new Scanner(System.in);

    // 1 D Array
    public static void main(String[] args) {
        // arrayHardcode();
        //Method Call to Input
        int[] myInputArr = takeInput();
        printArray(myInputArr);

        //read a no x and find its position inside array
        int x = sc.nextInt();
        /*int pos = linearSearch(myInputArr,x);
        if(pos==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("X found at index " + pos);
        }*/

        int[] positions = linearSearchAll(myInputArr,x);
        int j=0;
        while(positions[j]!=-1){
            System.out.println("position " + positions[j]);
            j++;
        }

    }
    //position -> where it is present
    static int linearSearch(int[] arr,int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x) {
                return i;
            }
        }
        //not found
        return -1;
    }
    //LIVE Assignment
    // Need to find all occurence of x inside an array and return a new array of indices
    static int[] linearSearchAll(int[] arr,int x){

        int[] output = new int[arr.length + 1];
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                output[j] = i;
                j++;
            }
        }
        //end of the array
        output[j] = -1;

        return output;
    }



    //Take Input the Size of the array and create array of that size
    // returns the arrays
    public static int[] takeInput(){

        int n = sc.nextInt();
        int[] arr = new int[n];
        int x = 10;
        //Read Inputs from the user and store in inside array

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void printArray(int[] arr){
        for(int val : arr){
            System.out.println(val);
        }
    }





}
