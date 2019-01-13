package com.self.tema1;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Length vector=");
        int n =sc.nextInt();
        int vector[]=new int[n];
        int odd=0;
        int even=0;
        for (int i = 0; i <n ; i++) {
            vector[i]=sc.nextInt();
            if (vector[i] % 2==0)
                even++;
            else
                odd++;

        }
        System.out.println("Even:"+even);
        System.out.println("Odd:"+odd);
    }
}
