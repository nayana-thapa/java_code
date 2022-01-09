package com.nayana;
//XOR of all numbers between a and b:
public class BetweenXoR {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        int ans = xorNum(b) ^ xorNum(a-1);
        System.out.print(ans);

    }
    static int xorNum(int n){
        if(n % 4 == 0){
            return n;
        }
        if(n % 4 == 1){
            return 1;
        }
        if(n % 4 == 2){
            return n+1;
        }

            return 0;
        }
}
