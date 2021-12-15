package com.prateek;

public class TwoDArrays {

    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4}, {4,5,6,1,3}, {7,9,10}};
        /*System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr);*/

        //Print the array
        //System.out.println(arr[0][2]);
        //System.out.println(arr[1][3]);
        display(arr);

    }

    static void display(int[][] arr){

        //Rows
        for(int i=0; i < arr.length; i++){
            //Over each column for ith row
            for(int j=0; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            //new line after every row
            System.out.println();
        }
    }
}
