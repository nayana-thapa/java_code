package com.company;

public class Floor {
    public static void main(String[] args) {
        int [] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 9;
        int answer = floorNumber(arr,target);
        System.out.print(answer);

    }
    static int floorNumber(int[]x, int key){
        if(key < x[0]){
            return -1;
        }
        int start = 0;
        int end = x.length-1;
        while(start<=end){
            int mid =  start + (end-start)/2;
            if(key > x[mid]){
                start = mid + 1; ;
            }
            else if(key < x[mid]){
                end=  mid-1;
            }
            else{
                return mid;
            }
        }
        return x[end];
    }
}
