package com.vincent;

import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first no.");
        int r = in.nextInt();
        double cir = circumference(r);
        System.out.println(cir);

    }

    static double circumference(int r) {
        double circle = (2 *r)*3.14;
        return circle;
    }

}
