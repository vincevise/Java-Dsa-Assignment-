package com.vincent;

import java.util.Scanner;

public class Print_all_the_Armstrong_number {
    public static void main(String[] args) {
//        System.out.println("Enter the number");
//        Scanner in = new Scanner(System.in);
//        int n  ;
//        System.out.println(exp);
        for (int  n = 100; n < 1000 ;n++) {
            if (isArmstrong(n)){
                System.out.print(n + " ");
            }
        }
    }

    static boolean isArmstrong(int n){
        int temp = n;
        int result = 0;
        while( n > 0 )
        {
            int rem  = n % 10;
            n /= 10;
            result += Math.pow(rem ,3);
        }

        return result == temp;
    }

    static int digits(int n){
        int i = 1;
        while(i<n){
            n/=10;
            i++;
        }
        return i;
    }
}
