package com.company;



import java.util.Scanner;

public class LexiSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        sc.close();
        java.util.List<String> strings = new java.util.ArrayList<>();

        System.out.println(s.length());

        for(int i=0;i<s.length();i++){
            if(k<=s.length()){
                strings.add(s.substring(i,k));
            }
            k++;

        }

        java.util.Collections.sort(strings);
        String smallest = strings.get(0);
        String largest = strings.get(strings.size()-1);
        System.out.println(smallest + "\n" + largest);


    }
}
