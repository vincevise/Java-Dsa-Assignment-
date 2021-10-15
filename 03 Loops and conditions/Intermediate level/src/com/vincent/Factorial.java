package com.vincent;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int fac = 1;

        for (int i = 1; i <= n; i++) {
             fac = fac*i;

        }
        System.out.println(fac);

    }
}
