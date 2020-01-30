package com.company;



import java.util.*;


public class UniqueHack {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        Set<PairHack<String,String>> leftie = new HashSet<>();




        int count = 0;
        String[] left = new String[length];
        String[] right = new String[length];
        for (int i = 0; i < length; i++) {
            left[i] = in.next();
            right[i] = in.next();
        }

        for(int i= 0;i<length;i++){
            PairHack<String,String> pairHack = PairHack.of(left[i],right[i]);
            if(leftie.add(pairHack)){
                count++;
                System.out.println(count);
            }else{
                System.out.println(count);
            }
        }




    }
}





