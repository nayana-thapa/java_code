package com.nayana;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5};
        Bubble(a);
        System.out.println(Arrays.toString(a));
    }

static void Bubble(int[] arr){
        for(int i = 0; i<arr.length; i++){
            boolean swap = false;
            for(int j = 1; j<arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
            }
            if(swap == false){
                break;
            }
        }

    }
}
