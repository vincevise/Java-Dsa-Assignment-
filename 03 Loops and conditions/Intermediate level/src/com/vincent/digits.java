package com.vincent;

import java.util.Scanner;

public class digits {
    public static void main(String[] args) {
        int count = 0;
        Scanner in = new Scanner(System.in);
                int n = in.nextInt();
        while (n != 0){
            n = n / 10;
            count++;
        }

        System.out.println(count);

    }
}
