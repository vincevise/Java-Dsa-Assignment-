package com.vincent;

import java.util.Scanner;

public class Even_days_in_a_month {
    public static void main(String[] args) {
        // 26. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program
        // to count the number of days he can go out in the month of August.
        System.out.println("Enter the Number");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count =0;

        for (int i = 1; i <= n; i++) {
            if (n>=2*i){
                System.out.println(2*i);
                count++;
                System.out.println(count + "th days");
            }

        }

    }
}
