package com.company;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class DateAndTime {


    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int month = sc.nextInt();
//        int day = sc.nextInt();
//        int year = sc.nextInt();
//        LocalDate ld = LocalDate.of(year,month,day);
//        String dayOfWeek = String.valueOf(ld.getDayOfWeek());
//        System.out.println(dayOfWeek);
    }

    public static String findDay(int month, int day, int year) {

        LocalDate ld = LocalDate.of(year,month,day);
        String dayOfWeek = String.valueOf(ld.getDayOfWeek());

        return dayOfWeek;

    }
}
