package com.nayana;

import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
      int [] a = {3,5,2,1,4};
      cyclicSort(a);
        System.out.println(Arrays.toString(a));

    }
    static void cyclicSort(int[]arr){
        int i =0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }

     static void swap(int[] arr, int i, int correct) {
        int temp = arr[correct];
        arr[correct] = arr[i];
        arr[i] = temp;


    }
}
