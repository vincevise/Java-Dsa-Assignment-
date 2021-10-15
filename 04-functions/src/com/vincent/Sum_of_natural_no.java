package com.vincent;

import java.util.Scanner;

public class Sum_of_natural_no {
    public static void main(String[] args) {
        //[Write a function that returns the sum of first n natural numbers.]
       int ans = add();
       System.out.println(ans);
    }
    static int add(){
        Scanner in = new Scanner(System.in);
        int n ;
        int sum = 0;
        while (true){
            System.out.println("enter the number");
            n = in.nextInt();
            if (n!=0){
                sum = sum + n;
            }
            else if (n == 0){
                break;
            }
        }
        return sum;
    }
}
