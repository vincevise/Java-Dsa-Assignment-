package com.vincent;

import java.util.Scanner;

public class Simple_Intrest {
    public static void main(String[] args) {
//        Simple Interest Formula A = P(1 + (r*t))
//        P = Principal Amount
//        A = Final Amount
//        r = interest rate
//        t = time (in years)
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Principle Amount");
        int p = input.nextInt();
        System.out.println("Enter the Interest rate");
        int r = input.nextInt();
        System.out.println("Enter the time");
        int T = input.nextInt();


        int A = p + p*( r * T )  ;

        System.out.println(A);



    }
}
