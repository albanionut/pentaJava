package com.self.tema1;

import java.util.Scanner;

public class CharAppears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First string:");
        String phrase = new String(sc.nextLine());
        System.out.println("Char:");
        char targetChar =sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == targetChar) {
                count++;
            }
        }
        System.out.println("Appears:"+count);
    }
}
