package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    static void swap(int[] a, int x, int y ){
        int temp =  a[x];
        a[x] = a[y];
        a[y] = temp;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of an array: ");
        int n = sc.nextInt();
        int[] arr=  new int[n];
        System.out.println("Enter a element in an array:  ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements are: " +Arrays.toString(arr));
        swap(arr, 2, 4);
        System.out.println("After swapping the  elements are: " +Arrays.toString(arr));


    }
}

