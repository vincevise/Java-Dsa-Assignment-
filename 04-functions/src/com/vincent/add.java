package com.vincent;

import java.util.Scanner;

public class add {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first no.");
        int a = in.nextInt();
        System.out.println("Enter the second no.");
        int b = in.nextInt();

        int ans = add(a,b);
        System.out.println(a + " + " + b +" = "+ ans);


    }

    static int add(int a,int b) {

         int sum = a + b;
         return sum;
    }
}
