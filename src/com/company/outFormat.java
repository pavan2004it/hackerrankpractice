package com.company;

import java.util.Scanner;

public class outFormat {
    public static void main(String[] args) {
        System.out.println("================================");
        try(Scanner scan = new Scanner(System.in)){
            for(int i=0;i<3;i++){
                String text = scan.next();
                int numb = scan.nextInt();
//                    scan.nextLine();
                String newText = String.format("%-15s",text);
                String newNum = String.format("%03d",numb);
                System.out.println(newText + newNum);
            }
        }
        System.out.println("================================");
    }
}
