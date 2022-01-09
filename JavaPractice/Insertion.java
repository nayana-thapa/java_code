package com.nayana;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int [] a = {2,3,9,4,1,6};
        insert(a);
        System.out.println(Arrays.toString(a));

    }
    static void insert(int[] arr){
        for(int i = 0; i< arr.length-1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else{
                    break;
                }
            }
        }

    }


}
