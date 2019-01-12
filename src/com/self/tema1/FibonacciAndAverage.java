package com.self.tema1;

import java.util.Scanner;

public class FibonacciAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Fibonacci terms?");
        int n = sc.nextInt();
        int firstTerm=1;
        int secondTerm=0;
        int sum=0;
        for (int i = 0; i <n ; i++) {
            System.out.print(firstTerm+" ");
            int aux = firstTerm;
            firstTerm=firstTerm+secondTerm;
            secondTerm=aux;
            sum=sum+secondTerm;

        }
        System.out.println();
        System.out.println("Average= "+ sum/n);
    }
}
