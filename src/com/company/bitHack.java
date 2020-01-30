package com.company;

import java.util.BitSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bitHack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int bits = scanner.nextInt();
        int patterns = scanner.nextInt();
        BitSet b1 = new BitSet(bits);
        BitSet b2 = new BitSet(bits);
        scanner.nextLine();
        while(scanner.findInLine("(?=\\S)") != null){
            if(scanner.hasNextLine()){
                String op = scanner.nextLine();
                StringTokenizer st = new StringTokenizer(op);
                String op1 = st.nextToken();
                int op2 = Integer.parseInt(st.nextToken());
                int op3 = Integer.parseInt(st.nextToken());

                if(op1.equalsIgnoreCase("AND")){
                    if(op2 == 1){
                        b1.and(b2);
                        System.out.println(b1.cardinality() + " " + b2.cardinality());
                    }else if(op2 == 2){
                        b2.and(b1);
                        System.out.println(b1.cardinality() + " " + b2.cardinality());
                    }
                }else if(op1.equalsIgnoreCase("SET")){
                    if(op2 == 1){
                        System.out.println(op2);
                        b1.set(op3);
                        System.out.println(b1.cardinality() + " " + b2.cardinality());
                    }else if(op2 == 2){
                        b2.set(op3);
                        System.out.println(b1.cardinality() + " " + b2.cardinality());
                    }
                }else if(op1.equalsIgnoreCase("FLIP")){
                    if(op2 == 1){
                        b1.flip(op3);
                        System.out.println(b1.cardinality() + " " + b2.cardinality());
                    }else if(op2 ==2){
                        b2.flip(op3);
                        System.out.println(b1.cardinality() + " " + b2.cardinality());
                    }
                }else if(op1.equalsIgnoreCase("OR")){
                    if(op2 == 1){
                        b1.or(b2);
                        System.out.println(b1.cardinality() + " " + b2.cardinality());
                    }else if(op2 == 2){
                        b2.or(b1);
                        System.out.println(b1.cardinality() + " " + b2.cardinality());
                    }
                }else if(op1.equalsIgnoreCase("XOR")){
                    if(op2 == 1){
                        b1.xor(b2);
                        System.out.println(b1.cardinality() + " " + b2.cardinality());
                    }else if(op2 == 2){
                        b2.xor(b1);
                        System.out.println(b1.cardinality() + " " + b2.cardinality());
                    }
                }
            }else{
                scanner.close();
            }
        }





    }
}
