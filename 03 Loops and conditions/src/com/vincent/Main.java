package com.vincent;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");



        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 1;



        for (int num = 1; num < n; num++) {


            int temp = b;
            b = b + a;
            a = temp;
            count++;

            System.out.println(b);

        }
    }
}
