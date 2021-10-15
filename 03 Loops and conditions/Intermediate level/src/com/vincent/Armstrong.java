package com.vincent;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter the 1st number");
        Scanner in = new Scanner(System.in);
        int a  = in.nextInt();
        System.out.println("Enter the second number");
        int b = in.nextInt();
//        boolean ans = isArmstrong(n);
//        System.out.println(ans);
        for (int i = a; i < b ; i++) {
            if (isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isArmstrong(int n){
        int rem,result = 0;
        int exp = digits(n);
        int temp = n;
        while ( n != 0 )
        {
            rem  = n % 10;
            n /= 10;
            result += Math.pow(rem ,  exp);
        }
        return result == temp;
    }
    static int digits(int n){
        int i =1;
        while(i<n){
            n/=10;
            i++;
        }
        return i;
    }
}


