package com.vincent;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt(),a = 0,b = 1, c;

        System.out.print(a + " " + b);



        for (int i = 1; i < count; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b ;
            b = c;
        }


    }
}
