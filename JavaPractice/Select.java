package com.nayana;

import java.util.Arrays;

public class Select {
    public static void main(String[] args) {
        int[] a= {8,9,1,5,7};
        select(a);
        System.out.println(Arrays.toString(a));

    }
    static void select(int[]arr){
        for(int i= 0; i< arr.length; i++){
            int last = arr.length -i-1;
            int max = 0;

            for(int j = 0; j <=last; j++){

                if(arr[max] < arr[j]){
                    max =j;
                }
                int temp = arr[max];
                arr[max] = arr[last];
                arr[last] = temp;
            }

        }
    }
}
