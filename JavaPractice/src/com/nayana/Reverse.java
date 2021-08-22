package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    static void reverse(int[] a) {
        int start = 0;
        int end = a.length -1;
        if (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;

        }
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
            reverse(arr);
            System.out.println("The reverse elements are: " + Arrays.toString(arr));



        }
}
