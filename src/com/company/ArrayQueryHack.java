package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayQueryHack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String []> tokenArray = new ArrayList<>();

        int count = sc.nextInt();
        int index = 0;
        for(int i=0;i<count;i++){
            int num = sc.nextInt();
            if(sc.hasNextLine()){
                String str = sc.nextLine().trim();
                tokenArray.add(index,str.split(" "));
            }
            index++;
        }

        int queryNum = sc.nextInt();
        for(int k=0;k<queryNum;k++){
            int queryIndex = sc.nextInt();
            int queryElement = sc.nextInt();
            try{
                System.out.println(tokenArray.get(queryIndex-1)[queryElement-1]);
            }catch (IndexOutOfBoundsException | NullPointerException iob){
                System.out.println("ERROR!");
            }
        }

        sc.close();


    }
}
