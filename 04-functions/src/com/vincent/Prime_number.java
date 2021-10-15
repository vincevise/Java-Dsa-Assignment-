package com.vincent;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int n = in.nextInt();
         num(n);
    }

    static void num(int n){
        int c =2 ;
        if (n<=0){
            System.out.println("it is not prime no.");
        }
        for (c = 2; c*c < n; c++) {
            if (n%c==0){
                System.out.println(n+" is a prime no.");
            }
        }
         if (n%c!=0) System.out.println(n + " is not a prime no.");
    }















//    static void num(int n){
//        int c = 2;
//        if (n<=0){
//            System.out.println("not a prime no.");
//        }
//        for ( c = 2; c * c <= n ; c++) {
//            if (n%c==0){
//                System.out.println(n + " is not a prime no.");
//                break;
//            }
//        }
//        if (n%c!=0){
//            System.out.println(n + " is a prime no.");
//        }
//    }
}
