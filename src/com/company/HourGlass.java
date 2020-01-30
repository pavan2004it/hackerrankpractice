package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HourGlass {
    public static void main(String[] args) {
        int total =0;
        int[][] arr = {{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}};
        ArrayList<Integer> hourMax = new ArrayList<>();
        for(int i=0;i<6;i++){
            for(int j=0;j<=3;j++){
                if(i>3){
                    break;
                }else{
                    int sum1 = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                    int sum2 = arr[i+1][j+1];
                    int sum3 = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                    total = sum1 + sum2 + sum3;
                    hourMax.add(total);
                }
            }
        }
        System.out.println(Collections.max(hourMax));


    }
}
