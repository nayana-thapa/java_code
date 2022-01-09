package com.nayana;

import java.util.Scanner;

public class BitwiseEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if((n&1) == 1){
            System.out.println(""+n+" is an Odd Number ");
        }
        else {
            System.out.println(""+n+" is an Even Number");
        }
    }
}
