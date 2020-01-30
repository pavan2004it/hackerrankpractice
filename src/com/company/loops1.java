package com.company;

import java.util.Scanner;
import java.util.function.Function;

public class loops1 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int N = sc.nextInt();
            for(int i=1;i<=10;i++){
                int result = N*i;
                System.out.println(N + " X " + i + " = " + result);
            }
        }
    }
}
