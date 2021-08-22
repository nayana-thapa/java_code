package com.company;

public class Minimu {
    public static void main(String[] args) {
        int a[] = {23, 45, 67, 89, 50};
        int answer =  minValue(a);
        System.out.println("The minimum number in an array is: " +answer);

    }
    static int minValue(int[] arr){

        int min = Integer.MAX_VALUE;
        for( int i = 0; i<arr.length; i++){
            if(arr[i] < min){
                min =  arr[i];
            }
        }
        return min;
    }
}
