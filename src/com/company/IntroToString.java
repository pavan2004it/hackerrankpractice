package com.company;

import java.util.Scanner;
import java.util.function.Function;

public class IntroToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length() + B.length());
        if(B.compareToIgnoreCase(A) > 0){
            System.out.println("No");
        }else if(B.compareToIgnoreCase(A) <0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1,A.length()) + " " + B.substring(0,1).toUpperCase() + B.substring(1,B.length()));

    }
}
