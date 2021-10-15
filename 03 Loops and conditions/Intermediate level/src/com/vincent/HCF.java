package com.vincent;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        int hcf = 0,temp;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = in.nextInt();
        System.out.println("enter the second number");
        int b = in.nextInt();

//        for (int i = 1; i <= a || i <= b ; i++) {
//            if (a%i==0 && b%i==0)
//                hcf = i;
//        }

        while (b > 0)
        {
            temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("hcf="+a);
    }

}

