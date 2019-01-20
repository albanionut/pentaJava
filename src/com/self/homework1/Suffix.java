package com.self.homework1;

import java.util.Scanner;

public class Suffix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 2 strings and we will tell you if the first one contains the second one as a suffix:");
        String first = new String(sc.nextLine());
        String second = new String(sc.nextLine());
        if (first.endsWith(second)) {
            System.out.println("TRUE");
        }else
            System.out.println("False");
    }
}
