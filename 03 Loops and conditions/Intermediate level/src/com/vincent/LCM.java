package com.vincent;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int product = 1;
        System.out.println("Enter the 1st number");
        int a = in.nextInt();
        System.out.println("Enter the 2nd number");
        int b = in.nextInt();
        for (int i = 1; i < a && i < b; i++) {
            if (a%i==0 && b%i==0){
//                product = product * i;
                System.out.println(i);
            }
        }
    }
}
