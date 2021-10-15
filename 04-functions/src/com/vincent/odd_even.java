package com.vincent;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        odd_even(n);



    }

    static void odd_even(int n){
        int c =2;
        if (n%c==0){
            System.out.println(n + " is an even no.");
        }
        else{
            System.out.println(n + " is an odd no.");
        }
    }
}
