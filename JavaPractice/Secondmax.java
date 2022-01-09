package com.nayana;

import java.util.Arrays;

public class Secondmax {
    public static void main(String[] args) {
        int [] a = {5,6,1,2,10,9};
        int ans = secondLargest(a);
        System.out.println(ans);
    }
    static int secondLargest(int[] a){
        int largest=0;
        int res=-1;

        for(int i=1;i<a.length;i++)
        {
            if(a[i]>a[largest])
            {
                res=largest;
                largest=i;
            }
            else if(a[i]!=a[largest])
            {
                if(res==-1||a[i]>a[res])
                    res=i;
            }


        }
        return a[res];

    }

}
