package com.vincent;

import java.util.Scanner;

public class Average_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int num;
        int count = 0;
        while(true){
            System.out.println("enter the number");
            num = in.nextInt();
            if (num != 0){
                sum = (sum + num);
                count++;
                System.out.println(count);
                avg = sum/count;
            }
            else if (num == 0){
                break;
            }
        }
        System.out.println(avg);
    }
}
