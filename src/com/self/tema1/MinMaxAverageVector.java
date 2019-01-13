package com.self.tema1;

import java.util.Scanner;

public class MinMaxAverageVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements the vector has?");
        int n = sc.nextInt();
        int vector[] = new int[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            vector[i] = sc.nextInt();
            sum=sum+vector[i];
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (vector[i] < min) {
                min = vector[i];
            }
        }
        System.out.println("Min is :" + min);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (vector[i] > max) {
                max = vector[i];
            }
        }
        System.out.println("Max is :" + max);
        System.out.println("Average is: "+sum/n);
    }
}
