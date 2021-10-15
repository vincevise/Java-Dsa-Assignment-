package com.vincent;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {

        int power = exponents();
        System.out.println(power);

    }

    static int exponents (){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        System.out.println("Enter the power");
        int exp = in.nextInt();
        int multiply = 1;
        for (int i = 0; i < exp ; i++) {
            multiply = multiply*num;
        }
        return multiply;


    }
}
