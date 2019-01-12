package com.self.tema1;

import java.util.Scanner;

public class FirstEqualLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements does the vector have?");
        int n = sc.nextInt();
        int array[] =new int[n];
        for (int i = 0; i <n ; i++) {
            array[i]=sc.nextInt();
        }
        if (n>=2) {
            if (array[0] == array[n-1])
                System.out.println("True");
            else
                System.out.println("False");
        }else{
            System.out.println("The vector must have minimum 2 elements");
        }
    }
}
