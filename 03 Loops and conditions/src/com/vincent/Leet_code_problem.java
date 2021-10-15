package com.vincent;

public class Leet_code_problem {
    public static void main(String[] args) {
        // Subtract the Product and Sum of Digits of an Integer

        int n = 1234;

        int ans = 0;
        int m = 1;

        while(n > 0){
            int rem = n % 10;
            n /= 10;
            ans = ans + rem;
            m = m * rem ;
        }

        System.out.println(m - ans);



    }
}
