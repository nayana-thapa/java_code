package com.nayana;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to enter in an array ? ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the element in an array: ");
        for(int i = 0;  i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("The array elements are: "+ Arrays.toString(arr));
        System.out.print("Enter which element you want to search in array: ");
        int ele = sc.nextInt();
        int result = binSearch(arr,ele);
        System.out.println(result);
    }
    static int binSearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid =low+(high-low)/2;

            if (a[mid] > key) {
                high = mid + 1;
            }
            else if (a[mid] < key) {
                low = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;

    }

}
