package com.self.tema1;

import java.util.Scanner;

public class PosXinVector {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Length vector=");
        int n =sc.nextInt();
        System.out.println("Target=");
        int x =sc.nextInt();
        int vector[]=new int[n];
        for (int i = 0; i <n ; i++) {
            vector[i]=sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            if(vector[i]==x){
                System.out.println("Target position= "+i );
            }
        }
    }
}
