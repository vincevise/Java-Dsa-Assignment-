package com.vincent;

import java.util.Scanner;

public class Rupee_to_Dollar {
    public static void main(String[] args) {
//        Convert Rupee to US Dollar
//        1 Rupee = 0.013 Dollars
        double b = 0.013;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Rupee amount to convert");

        int a = in.nextInt();


        double dollar = a*b;

        System.out.println(a + " Rupees is " + dollar + " Dollars");

    }
}
