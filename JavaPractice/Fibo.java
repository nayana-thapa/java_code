package com.nayana;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+ " ");
        System.out.print(b+ " ");
        for(int i = 2; i<n; i++){
            int c =  a + b;
            a = b;
            b = c;
            System.out.print(c+ " ");
        }

    }

}
