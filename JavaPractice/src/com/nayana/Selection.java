package com.nayana;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] a= {2,1,5,3,8,4};
        selection(a);
        System.out.println(Arrays.toString(a));
    }

    static void selection(int[] a){
        for(int i = 0; i<a.length; i++){
            int last = a.length -i-1;
            int maxIndex = Maxmium(a, 0 , last);
            int temp = a[maxIndex];
            a[maxIndex] = a[last];
            a[last] = temp;
            //swap(a,maxIndex, last);

        }
    }
   /* static void swap(int[]a, int max, int last){
        int temp = a[max];
        a[max] = a[last];
        a[last] = temp;


    }*/
    static int Maxmium(int[] a, int start, int end){
        int max = start;
        for(int i = start; i<=end; i++){
            if(a[max]< a[i]){
                max = i;
            }
        }
        return max;

    }
}
