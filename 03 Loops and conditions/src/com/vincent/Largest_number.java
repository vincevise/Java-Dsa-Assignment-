package com.vincent;

import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the largest number from
        //all.
        Scanner in = new Scanner(System.in);

        int max = 0;
        int n ;

        while(true){
            System.out.println("Enter the number");
            n = in.nextInt();

            if (n > max){
                max = n;

            }
            else if (n == 0){
                break;
            }

        }
        System.out.println(max);

    }
}
