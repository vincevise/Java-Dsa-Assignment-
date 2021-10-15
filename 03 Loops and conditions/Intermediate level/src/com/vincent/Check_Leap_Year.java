package com.vincent;

import java.util.Scanner;

public class Check_Leap_Year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year");
        int n =in.nextInt();



        if ( n%4 == 0){
            System.out.println("This is a leap year");
        }
        else{
            System.out.println("not a leap year");
        }

    }
}
