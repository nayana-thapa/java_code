package com.nayana;

public class RecursionInBinary {
    public static void main(String[] args) {
        int[] arr= {2,3,6,8,9,10};
        int target = 9;
        System.out.println(binary(arr,target,0, arr.length-1));


    }
    static int binary(int[] arr, int key, int start, int end) {

        while (start <=end){
            int mid = start + (end - start) / 2;
            if (key == arr[mid]) {
                return mid;
            }
           if(key > arr[mid]){
               return binary(arr, key, mid+1, end);
           }
           else{
               return  binary(arr,key,start, mid-1);
           }

        }
        return -1;
    }
}
