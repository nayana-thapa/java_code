package com.nayana;

public class OrderAgnosticBs {
    public static void main(String[] args) {
        int [] a = {1,4,6,8,10,12,13};
        int target = 9;
        System.out.println(orderAgnostic(a,target));

    }
    static int orderAgnostic(int[]a, int key){
        int start = 0;
        int end = a.length-1;
        boolean isAgno = a[start] < a[end];
        while(start <= end){
            int mid = start+(end-start)/2;
            if(a[mid]==key){
                return mid;
            }
             if(isAgno){
                if(key > a[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(key < a[mid]){
                    start = mid+1;
                }
                else{
                     end = mid-1;
                }

            }
        }
        return -1;
    }
}
