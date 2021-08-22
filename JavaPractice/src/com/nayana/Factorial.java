package com.company;

import java.util.Scanner;

public class Factorial {
    static int isFact(int n){
        if(n == 0){
            return 1;
        }
        int ans = n * isFact(n-1);
                return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for factorial: ");
        int num  = sc.nextInt();
        System.out.println(isFact(num));

    }
}
