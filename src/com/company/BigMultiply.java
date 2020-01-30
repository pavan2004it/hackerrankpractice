package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class BigMultiply {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b  = in.nextLine();

        BigInteger big1 = new BigInteger(a);
        BigInteger big2 = new BigInteger(b);
        System.out.println(big1.add(big2));
        System.out.println(big1.multiply(big2));
    }
}
