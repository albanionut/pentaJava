package com.self.tema1;

import java.util.Scanner;
import java.util.Vector;

public class ConcatArrays {
    public static void main(String[] args) {
        Vector<Integer> vector1 = new Vector<Integer> ();
        Vector<Integer> vector2 = new Vector<Integer> ();
        Vector<Integer> vector3 = new Vector<Integer> ();
        Scanner sc = new Scanner(System.in);

        System.out.println("How many elements the vector1 has?");
        int n = sc.nextInt();
        for (int i = 0; i < n; ++i) {
            vector1.add (new Integer (sc.nextInt()));
        }

        System.out.println("How many elements the vector2 has?");
        int m = sc.nextInt();
        for (int i = 0; i < m; ++i) {
            vector2.add (new Integer (sc.nextInt()));
        }

        vector3.addAll (vector1);
        vector3.addAll (vector2);

        for (Integer i : vector3)
            System.out.print (i + " ");
        System.out.println ();
    }
}
