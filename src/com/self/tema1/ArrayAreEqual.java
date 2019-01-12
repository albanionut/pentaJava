package com.self.tema1;

import java.util.Scanner;

public class ArrayAreEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length?");
        int n = sc.nextInt();
        int firstArray[] = new int[n];
        System.out.println("First array :");
        for (int i = 0; i < n; i++) {
            firstArray[i] = sc.nextInt();
        }
        System.out.println("Length?");
        int m = sc.nextInt();
        int secondArray[] = new int[n];
        System.out.println("Second array :");
        for (int i = 0; i < m; i++) {
            secondArray[i] = sc.nextInt();
        }
        int count = 0;
        if (n == m) {
            for (int i = 0; i < n; i++) {
                if (firstArray[i] == secondArray[i]) {
                    count++;
                }
            }
            if (count == n) {
                System.out.println("The vector elements are equal");
            } else
                System.out.println("The vector elements are not equal");
        } else
            System.out.println("The vectors must have the same number of elements.");
    }
}
