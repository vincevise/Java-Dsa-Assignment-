package com.vincent;

import java.util.Scanner;

public class prime_no_btw_two_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the number a");
        int a = in.nextInt();

        System.out.println("enter the number n");
        int b = in.nextInt();

        num(a,b);


    }

     static void num(int a, int b){


        for (int i = a;  i < b; i++) {

            for (int c = 2; c*c <=i ; c++) {
                if (i%c==0){
                    System.out.println(i+" is a prime no.");
                }

            }
        }
         if (b%a!=0) System.out.println(b + " is not a prime no.");
    }

}

