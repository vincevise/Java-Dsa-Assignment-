package com.vincent;

import java.util.Scanner;

public class Leap_year {
    //Check Leap Year Or Not
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the year");
//        int n = in.nextInt();
        System.out.println("Enter the first number");
        int a = in.nextInt();
        System.out.println("Enter the last number");
        int b = in.nextInt();

        for (int i = a; i < b; i++) {
            if (leap(i)){
                System.out.println(i + " ");
            }

        }
//        boolean ans = leap(n);
//        System.out.println(ans);

    }

    static boolean leap(int n){
        if (n%4==0){
            return true;
        }
        return false;
    }


}
