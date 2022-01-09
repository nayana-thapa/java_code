package com.nayana;

public class CountRotation {
    public static void main(String[] args) {
        int[] x = {15, 18, 2, 3, 6, 12};
        int ans = findPivot(x);
        System.out.println("Array is rotated: "+ans);

    }
    static int findPivot(int[] a){
        int pivot = countRotation(a);
        return pivot+1;
    }
    static int countRotation(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            else if(arr[mid] <= arr[start]){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
