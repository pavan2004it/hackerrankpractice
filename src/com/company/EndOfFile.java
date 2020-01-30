package com.company;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        int lineNum = 1;
        try(Scanner sc= new Scanner(System.in)){
            while(sc.hasNext()){
                String newLine = sc.nextLine();
                System.out.println(lineNum + " " + newLine);
                lineNum++;
            }
        }
    }
}
