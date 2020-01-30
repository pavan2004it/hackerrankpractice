package com.company;

import java.util.Scanner;

public class loops2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int t = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<t;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int n = sc.nextInt();
                int j= 1;
                int sum =0;
                int grandtotal = 0;
                int result = a;
                for(int k=1;k<=n;k++){
                    sum = b*j;
                    grandtotal = sum + result;
                    Integer res = grandtotal;
                    String strres = res.toString();
                    sb.append(strres + " ");
                    j += j;
                    result = grandtotal;
                }


            }
            System.out.println(sb);

//            for(int i=0;i<t;i++){
//                int a = sc.nextInt();
//                int b = sc.nextInt();
//                int n = sc.nextInt();
//                for(int j=0;j<n;j++){
//
//                }
//
//            }
        }
    }
}
