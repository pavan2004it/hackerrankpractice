package com.company;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SubArrayHack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        in.nextLine();
        String arrelem = in.nextLine();
        String[] arrstr = arrelem.split(" ");
        System.out.println(Arrays.toString(arrstr));
        arr = Arrays.stream(arrstr).mapToInt(Integer::parseInt).toArray();
//        for(int i: arr){
//            System.out.println(i);
//        }
//        int[] arr = {1,-2,4,-5,1};
//        int group =0;
//        int k =0;
//        int count =0;
//        for(int i=0;i<arr.length;i++){
//            k++;
//            for(int j=0;j<=arr.length-1;j++){
//                group = k+j;
//                if(group>arr.length){
//                    continue;
//                }else{
//                    int[] subArray = Arrays.copyOfRange(arr,j,group);
//                    if(Arrays.stream(subArray).sum()<0){
//                        count++;
//                    }
//                }
//            }
//
//        }
//        System.out.println(count);


    }
}
