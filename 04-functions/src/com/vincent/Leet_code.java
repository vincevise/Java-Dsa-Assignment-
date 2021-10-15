package com.vincent;

import java.util.Scanner;

public class Leet_code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sub = product(n)- add(n);
        System.out.println(product(n) + " - " + add(n) + " = " + sub);
    }
    static int add(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n/=10;
            sum = sum + rem;
        }
        return sum;
    }

    static int product(int n){
        int into = 1;
        while(n>0){
            int rem = n%10;
            n/=10;
            into = into * rem;
        }
        return into;
    }
}
