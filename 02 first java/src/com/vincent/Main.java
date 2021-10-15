package com.vincent;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int c = 2;
        if ( a % c == 0){
            System.out.println( a + " is even number");
        }
        else   {
            System.out.println( a + " is not an even number" );

        }
    }
}
