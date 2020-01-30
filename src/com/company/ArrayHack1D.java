package com.company;

import java.util.Scanner;

public class ArrayHack1D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int j=0;j<=n-1;j++){
            a[j] = scan.nextInt();
        }
        scan.close();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
