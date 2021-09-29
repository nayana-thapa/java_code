package com.nayana;

import java.util.Scanner;

public class DigitsBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("\nEnter a base: ");
        int b = sc.nextInt();

        int ans = (int)(Math.log(n) / Math.log(b)) +1 ;

        System.out.print(ans);
    }
}
