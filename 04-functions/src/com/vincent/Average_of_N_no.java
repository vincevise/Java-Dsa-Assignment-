package com.vincent;

import java.util.Scanner;

public class Average_of_N_no {
    public static void main(String[] args) {
        int ans = average();
        System.out.println(ans);



    }

    static int average( ){
        int avg = 0 ;
            while (true){
                Scanner in = new Scanner(System.in);
                System.out.println("Enter the number n");
                int n = in.nextInt();
                int sum = 0;
                int count = 0;
                if (n>0){
                    sum = (sum + n);
                    count++;

                    avg = sum/count;
                }
                if (n==0){
                    break;
                }
            }
            return avg;
    }

}
