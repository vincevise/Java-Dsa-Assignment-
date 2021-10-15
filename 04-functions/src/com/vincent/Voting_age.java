package com.vincent;

import java.util.Scanner;

public class Voting_age {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age");
        int n = in.nextInt();
        vote(n);

    }

    static void vote(int n){



        if (n < 18){
            System.out.println(  " you are not allowed to vote");
        }

        if (n > 18){
            System.out.println("you are allowed to vote");
        }



    }

}
