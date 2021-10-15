package com.vincent;

import java.util.Scanner;

public class Max_min {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = in.nextInt();
        System.out.println("Enter the second number");
        int b = in.nextInt();
        System.out.println("Enter the third number");
        int c = in.nextInt();

        int large = max(a,b,c);
        System.out.println(large);

        int small = min(a,b,c);
        System.out.println(small);
    }

    static int max (int a, int b, int c){


        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        else {
            max = a;
        }
        return max;
    }

    static int min (int a, int b, int c){

        int min = a;

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        else {
            min = a;
        }
        return min;
    }


}
