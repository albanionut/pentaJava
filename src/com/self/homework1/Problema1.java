package com.self.homework1;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Suma si aria de la :");
        int first = sc.nextInt();
        System.out.println("La:");
        int last = sc.nextInt();
        int suma = 0;
        double count = 0;
        double medieAritmetica = 1;
        for (int i = first; i <= last; i++) {
            suma = suma + i;
            count++;
        }
        medieAritmetica = suma / count;
        System.out.println("Suma este: " + suma);
        System.out.println("Aria este: " + medieAritmetica);

    }
}
