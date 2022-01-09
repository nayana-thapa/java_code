package com.nayana;

public class DuplicateArray {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,3};
        int[] ans = removeDuplicate(arr);
        System.out.println(ans);

    }
    static int[] removeDuplicate(int[] arr){
        int ans = 1;
        for(int i = 1; i< arr.length; i++){
            if(arr[i] != arr[ans-1]){
                arr[ans] = arr[i];
                ans++;
            }

        }
        return arr;
    }
}
