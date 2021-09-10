package com.nayana;


import java.util.Arrays;

public class maxValue {
    public static void main(String[] args) {
        int a[] = {23, 45, 67, 89, 50};
        int answer =  maximum(a);
        System.out.println("The maximum number in an array is: " +answer);

    }
    static int maximum(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max =  arr[i];
            }
        }
        return max;
    }
}
