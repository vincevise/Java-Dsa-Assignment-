package com.vincent;

import java.util.Scanner;

public class Sum_of_all_inputs {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the sum of all numbersTake integer inputs till the user enters 0 and print the sum of all numbers
        int sum = 0;
        int num;
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("Enter the number");
            num = in.nextInt();

            if (num != 0){
                sum = sum + num;
            }
            else if (num == 0){
                break;
            }
        }
        System.out.println("The sum is = " + sum);
    }
}
