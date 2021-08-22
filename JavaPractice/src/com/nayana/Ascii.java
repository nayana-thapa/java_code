package com.nayana;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        int c = ch;
        System.out.println(c);
    }
}
