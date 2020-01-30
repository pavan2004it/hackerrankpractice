package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternCheckHack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0 && in.hasNextLine()){
            String pattern = in.nextLine();
            try{
                Pattern patt = Pattern.compile(pattern);
                System.out.println("Valid");
            }catch (PatternSyntaxException pe){
                System.out.println("Invalid");
            }
        }


    }
}
