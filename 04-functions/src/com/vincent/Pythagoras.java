package com.vincent;

import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {
        //[Write a function to check if a given triplet is a Pythagorean triplet or not.]
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of side 1");
        int s1 = in.nextInt();
        System.out.println("Enter the length of side 2");
        int s2 = in.nextInt();
        System.out.println("Enter the length of hypotenuse");
        int h = in.nextInt();

        boolean ans = pythagoras(s1,s2,h);
        System.out.println(ans);
    }

    static boolean pythagoras(int a,int b,int c){
        return a * a + b * b == c * c;
    }

}
