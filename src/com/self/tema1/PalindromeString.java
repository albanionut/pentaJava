package com.self.tema1;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce the string :");
        String palindrome =new String(sc.nextLine());
        String emordnilap="";
        for (int i = palindrome.length()-1; i>=0 ; i--) { // first try was with length and i>0 who was incorrect.. 
            emordnilap =emordnilap + palindrome.charAt(i);
        }
        if (palindrome.equals(emordnilap))
            System.out.println("Is palindrom");
        else
            System.out.println("Isn't palindrom");
    }
}
