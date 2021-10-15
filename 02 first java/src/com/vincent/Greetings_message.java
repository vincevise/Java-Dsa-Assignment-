package com.vincent;

import java.util.Scanner;

public class Greetings_message {

    public static void main(String[] args) {
        System.out.println("Please enter name");
        Scanner input = new Scanner(System.in);
        String name  = input.next();
        System.out.println("Have great day " + name);
    }




}
