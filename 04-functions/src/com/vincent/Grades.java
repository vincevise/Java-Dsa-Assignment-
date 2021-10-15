package com.vincent;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        System.out.println("Enter your marks");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        grades(n);



    }

    static void grades(int n){
        String grade = null;
        if (100<n || n<0) {
            System.out.println("Enter the correct no.");
            return;
        }


        switch (n/10){
            case 9:
            case 10:
                grade = "AA";
                break;

            case 8:
                grade = "AB";
                break;

            case 7:
                grade = "BB";
                break;

            case 6:
                grade = "BC";
                break;

            case 5:
                grade = "CC";
                break;

            case 4:
                grade = "CD";
                break;

            case 3:
            case 2:
            case 1:
            case 0:
                grade = "DD";
                break;




        }
        System.out.println("Your grades are "+ grade);



    }
}
