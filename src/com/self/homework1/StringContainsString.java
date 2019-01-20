package com.self.homework1;

import java.util.Scanner;

public class StringContainsString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 2 strings and we will tell you if the first one contains the second one:");
        String first = new String(sc.nextLine());
        String second = new String(sc.nextLine());
        if (first.contains(second)) {
            System.out.println("TRUE");
        }else
            System.out.println("False");
    }
}
