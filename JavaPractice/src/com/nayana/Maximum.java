package com.nayana;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum {
    static int Max(int[] a){
        int maxVal = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i]> maxVal){
                maxVal = a[i];
            }
        }
        return maxVal;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements you want to enter in an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i< n; i++){
            System.out.print("Enter an element in an array: ");
            arr[i] =  sc.nextInt();
        }
        System.out.println("The elements are: " + Arrays.toString(arr));
        System.out.println("The max value in an array is: " +Max(arr));
    }
}
