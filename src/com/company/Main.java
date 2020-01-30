package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new UserNameValidator().regularExpression));
        }

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int N = scan.nextInt();
//        scan.close();
//        if(N%2==1){
//            System.out.println("Weird");
//        }else if(N%2==0 && (N==2 || N<5)){
//            System.out.println("Not Weird");
//        }else if(N%2==0 && (N==6 || N<=20)){
//            System.out.println("Weird");
//        }else if(N>20){
//            System.out.println("Not Weird");
//        }
        }
}
