package com.vincent;

import java.util.Scanner;

public class n_max_min {
    public static void main(String[] args) {
        max( );

    }
    static void max( ){


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while(true){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number");
            int n = in.nextInt();
            if (n > max){
                max = n;
            }

            if (n < min){
                min = n;
            }
            else if (n == 0){
                break;
            }
        }
        System.out.println(max + " " + min);
    }
}
