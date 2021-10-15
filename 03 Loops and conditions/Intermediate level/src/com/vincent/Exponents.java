package com.vincent;

import java.util.Scanner;

public class Exponents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        System.out.println("Enter the Exponential power");
        int exp = in.nextInt();
        int power = 1;

        for (int i = 0; i < exp; i++) {
            power = power*n;
        }
        System.out.println(power);

    }
}
