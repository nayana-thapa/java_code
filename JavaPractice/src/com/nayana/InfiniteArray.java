package com.nayana;

public class InfiniteArray {
    public static void main(String[] args) {
        int [] x = {12,14,16,18,20,22,34,67,90};
        int find = 90;
        int output = result(x,find);
        System.out.println(output);

    }
    static int result(int []a, int target){

        int start = 0;
        int end =1;
        while(target > a[end]){
            int temp = end +1;
            start =  temp;
            end = start + 1;
            if(end > a.length-1){
                return start;
            }

        }
        return binarySearch(a, target, start, end);
    }
    static int binarySearch(int[] arr, int key, int low, int high){
     while(low<=high){
         int mid = high+(high - low)/2;
         if(key > arr[mid]){
             low = mid +1;
         }
         else if(key < arr[mid]){
             high =  mid -1;
         }
         else{
             return mid;
         }
     }
        return -1;

    }
}
