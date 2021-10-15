package com.vincent;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        int rem,result = 0;
        int exp = digits(n);
        System.out.println(exp);
        int temp = n;

        while ( n != 0 )
        {
            rem  = n % 10;
            n /= 10;
            result += Math.pow(rem ,  exp);
        }

        if (result == temp){
            System.out.println(temp + " is an armstrong number");
        }

        else{
            System.out.println(temp + " is not an armstrong number");
        }

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
