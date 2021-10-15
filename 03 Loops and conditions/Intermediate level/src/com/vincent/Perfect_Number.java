package com.vincent;

import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int i = 1;


        while (n%i == 0){
            sum = sum + i;
            i++;
        }

        System.out.println(sum);

        if (sum == n){
            System.out.println("perfect number");
        }

        else {
            System.out.println("not");
        }

    }
}
