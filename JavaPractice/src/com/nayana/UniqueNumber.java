package com.nayana;

public class UniqueNumber {
    public static void main(String[] args) {
        int arr[] = {2,3,4,3,2,4,5,6,5};
        int unique = 0;
        for(int i = 0; i < arr.length; i++){
            unique^=arr[i];
        }
        System.out.println(unique);
    }
}
