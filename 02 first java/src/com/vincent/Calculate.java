package com.vincent;


import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number a");
        int a = in.nextInt();
        System.out.println("Enter the number b");
        int b = in.nextInt();

        System.out.println("Enter the operation");
        char c = in.next().charAt(0);

        int add = a+b ;
        int sub = a-b;
        int multiply = a*b;
        int Divide = a/b;

        if (c =='+'){
            System.out.println(add);
        }
        if (c =='-'){
            System.out.println(sub);
        }
        if (c=='*'){
            System.out.println(multiply);
        }
        if (c=='/'){
            System.out.println(Divide);
        }

    }
}
