package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Searching {
   public static int Search(int[]a, int key){
       if(a.length == 0){
           return -1;
       }
        for(int i = 0; i<a.length; i++){
            if(a[i] == key)
            {
                return i;
            }
        }
        return-1;

   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to enter in an array ? ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the element in an array: ");
        for(int i = 0;  i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("The array elements are: "+Arrays.toString(arr));
        System.out.print("Enter which element you want to search in array: ");
        int ele = sc.nextInt();
        int ans = Search(arr,ele);
        System.out.print(ans);
    }
}
