package com.company;

public class SearchIntRange {
    public static void main(String[] args) {
        int a[] = {1, 12, 23, 45, 67, 89, 90};
        int target = 67;
        int ans = meSearch(a, target,2,5);
        System.out.println(ans);
    }
    static int meSearch(int[] arr, int key, int x, int y){
        if(arr.length == 0){
            return -1;
        }
        for(int i = x; i<=y; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
