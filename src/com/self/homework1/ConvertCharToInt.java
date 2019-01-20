package com.self.homework1;

import java.util.Scanner;

public class ConvertCharToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce the string : ");
        String text = sc.nextLine();

        char[] chars = text.toCharArray();
        for (char c : chars) {// for every character of my string
            int number= (int)c - 96; // when you convert with cast you receive ascii a in ascii is 97
            System.out.print(number+".");
        }
    }
}
