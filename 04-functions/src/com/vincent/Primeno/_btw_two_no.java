package com.vincent.Primeno;

import java.util.Scanner;

public class _btw_two_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the 1st number");
        int a = in.nextInt();
        System.out.println("Enter the second no.");
        int b = in.nextInt();

        for (int i = a; i < b ; i++) {
            if (num(i)){
                System.out.print(i+ " ");
            }

        }
    }

    static boolean num(int n){
        int c = 2 ;

        if (n<=0){
            return false;
        }
        for (c = 2; c*c <= n; c++) {
            if (n%c==0){
                return false;
            }
        }
        return true;

    }

}
