package com.prateek;

public class ArraySearching {

    static int binarySearch(int[] arr,int key){
        //find index if it is present
        int s = 0;
        int e = arr.length - 1;

        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
               e = mid -1;
            }
            else{
                s = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,19,20,25};
        int key = 21;

        System.out.println(binarySearch(arr,key));

    }



}
