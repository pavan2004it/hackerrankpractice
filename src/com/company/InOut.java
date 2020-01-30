package com.company;

import java.util.Scanner;

public class InOut {

    public static void main(String[] args) {

        int j =0;
        double i =0.0;
        String s = "";

        Scanner scan  = new Scanner(System.in);
        if(scan.hasNextInt()){
            j = scan.nextInt();
        }
        if(scan.hasNext("\\d*\\.\\d*")){
            i = scan.nextDouble();
            scan.nextLine();
        }
        if(scan.hasNext("\\w*")){
           s = scan.nextLine();

        }
        scan.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + i);
        System.out.println("Int: " + j);




    }
}
