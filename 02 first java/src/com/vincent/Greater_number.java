package com.vincent;

import java.util.Scanner;

public class Greater_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the 1st number");
        int a = in.nextInt();

        System.out.println("Enter the 2nd number");
        int b = in.nextInt();

        if (a>b){
            System.out.println("Number " + a +" is greater than " + b);
        }

        else
        {
            System.out.println("Number " + b + " is greater than " + a);
        }


    }
}
