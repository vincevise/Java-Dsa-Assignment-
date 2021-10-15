package com.vincent;

import java.util.Scanner;

public class Sum_digits {
    public static void main(String[] args) {
        //Sum Of A Digits Of Number

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = addition(n);
        System.out.println(ans);


    }


    static int addition(int n) {

        int sum = 0;
        while(n>0){
            int rem = n%10;
            n/=10;
            sum= sum + rem;

        }


        return sum;



    }
}



