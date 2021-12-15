package com.prateek;

import java.util.Scanner;

public class TwoDArraysInput {

    static int[][] createArray(int rows,int cols){

        int[][] array =new int[rows][cols];
        for(int i=0; i< array.length; i++){
            for(int j=0; j<array[i].length; j++){
                array[i][j]  = 5;
            }
        }
        return array;

    }

    //Take Input
    static int[][] takeInput2DArray(){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                array[i][j] = sc.nextInt();
            }
        }
        return array;
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
    //Create an array with variable no of columns and take it input
    static int[][] takeInputJaggedArray(){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int[][] arr = new int[rows][];

        for(int i=0; i<rows; i++){

            int cols = sc.nextInt();
            arr[i] = new int[cols];

            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }


    static void displayWave(int[][] arr){

        int n = arr.length;
        int m = arr[0].length;

        for(int i=0; i < m; i++){
            //0th col
            if(i%2==0){
                //top to bottom
                for(int row=0; row<n;row++){
                    System.out.print(arr[row][i] + " ");
                }

            }
            else{
                //bottom to top
                for(int row=n-1; row>=0; row--){
                    System.out.print(arr[row][i] + " ");
                }
            }
        }

    }


    public static void main(String[] args) {
        //int[][] arr = createArray(3,5);
        int[][] arr = takeInput2DArray(); //takeInputJaggedArray();//
        displayWave(arr);
        //display(arr);
    }


}
