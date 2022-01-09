package com.nayana;

public class StringSearch {
    public static void main(String[] args) {
        String name = "Nayana";
        char key= 'y';
        int ans = meSearch(name, key);
        System.out.println(ans) ;

    }
    static int meSearch(String naam, char target){
        if(naam.length()==0){
            return -1;
        }
        for(int i = 0; i< naam.length(); i++){
            if(target == naam.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}
