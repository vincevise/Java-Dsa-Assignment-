package com.vincent;

import java.util.Scanner;

public class Sum_of_digits_of_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        while(n>0){
            int rem = n%10;
            n /=10;
            sum = sum + rem ;
        }
        System.out.println(sum);
    }
}
