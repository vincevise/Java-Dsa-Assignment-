package com.vincent;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");

        int n = in.nextInt();

        int product = factorial(n);

        System.out.println(n+"! = "+product);
    }

    static int factorial(int n){
        int multiply = 1;
        for (int i = 1; i <= n; i++) {

            multiply = multiply*i;
        }
        return multiply;
    }

}
