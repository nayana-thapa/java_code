package com.nayana;

public class Recursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        while(n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }

}