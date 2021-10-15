package com.vincent;

import java.util.Scanner;

public class Perfect_no {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        System.out.println("Enter the number");
//        int n = in.nextInt();
        System.out.println("enter the 1st number ");
        int a = in.nextInt();
        System.out.println("Enter the last number");
        int b = in.nextInt();
        for (int i = a; i <= b ; i++) {
            if (perfect(i)){
                System.out.println(i + " ");
            }
        }
    }

    static boolean perfect(int n){

        int sum = 0;

        for (int i = 1; i <n; i++) {
            if (n%i==0){
                sum = sum + i;
            }

        }
        if (sum == n){
            return true;
        }
        return false;
    }


}
