package com.company;

public class SearchMe {


    public static void main(String[] args) {
        int[]  arr ={1, 2, 4, 7, 11, 99, 23};
        int target = 99;
        int ans = keySearch(arr,target);
        System.out.print(ans);
    }
    static int keySearch(int[] a, int key){
        if(a.length == 0){
            return -1;

        }
        for(int i = 0; i<a.length; i++){
            int element = a[i];
            if(a[i] == key){
                return i;
            }
        }
        return -1;
    }
}
