package com.company;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatterHack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat nf;

        nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nf.format(payment);

        Locale indian = new Locale("en","IN");
        nf = NumberFormat.getCurrencyInstance(indian);
        String india = nf.format(payment);

        nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nf.format(payment);

        nf = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nf.format(payment);

        // Write your code here.

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
