package com.company;

import java.util.Scanner;


public class StaticInitializationBlock {
    private static boolean flag = true;
    private static Scanner sc = new Scanner(System.in);
    private static int B = sc.nextInt();
    private static int H = sc.nextInt();

    static {
        try{
            if(B<=0 || H<=0){
                flag= false;
                throw new Exception();

            }
        }catch (Exception e){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args) {


        if(flag){
            int area=B*H;
            System.out.print(area);
        }
        sc.close();
    }
}
