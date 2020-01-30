package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class LeapHack {

    public static boolean canWin(int leap, int[] game) {
        int n = game.length;

        int seekone = 0;
        int seektwo = 0;
        int seekthree = 0;

        for (int i = 0; i < game.length - 1; i++) {
            System.out.println(i);
            System.out.println("Check 0");
            seekone = game[i + 1];

            if (i < game.length - leap) {
                seektwo = game[i + leap];
            }

            if (seekone == 0) {

                if ((i == game.length - 2) && (game[game.length - 1] == 0)) {
                    System.out.println("Check 1");
                    return true;
                }
            } else if (seekone != 0) {
                if (i + leap >= n && game[i] == 0) {
                    System.out.println("Check 2");

                    return true;
                }
                if (i + leap < n) {
                    seektwo = game[i + leap];
                }

                System.out.println(i);

                if (seektwo == 0 || i+leap>=n) {

                    if ((i == game.length - 1 - leap) && (game[game.length - 1] == 0)) {
                        System.out.println("Check 3");
                        return true;
                    }else if(i+leap>=n){
                        return true;
                    }
                    i += leap - 1;

                } else {

                    if (i > 0) {
                        seekthree = game[i - 1];
                        seektwo = game[i - 1 + leap];
                    }
                    if (seekone != 0 && seektwo != 0) {
                        for(int j=i;j>0;j--){
                            System.out.println("Check 4");

                            if(game[j] ==0){
                                seekthree = game[j-1];
                                seektwo = game [j-1+leap];
                                if (seekthree == 0 && seektwo == 0) {
                                    if(j-1+leap+leap>=n){
                                        return true;
                                    }
                                }
                            }
                            }

                        seekone = game[i+1];
                        seektwo = game[i+leap];
                        if(seekone!=0 && seektwo!=0){
                            return false;
                        }
                        continue;
                    }
                    if (seekthree == 0) {
                        if ((i == game.length - 1 - leap) && (game[game.length - 1] == 0)) {
                            System.out.println("Check 4");
                            return true;
                        }
                        i = i-1 +leap;


                    }

                 }
                }else if (i + leap >= n) {
                return true;
                }

            }
            return false;
        }



//        for(int i=0;i<game.length-leap;i++){
//            System.out.println("Value of i fed " + i);
//            seekone = game[i+1];
//            seektwo = game[i+leap];
//            if(i>0){
//                seekthree = game[i-1];
//            }
//
//            if(seekone ==0 && i+1+leap>=n){
//                System.out.println("First Check");
//                return true;
//            }
//            if(seekthree ==0 && i-1+leap==0){
//                if(i-1+leap+leap>=n){
//                    System.out.println("Second Check");
//                    return true;
//                }
//
//            }
//            if(seekone==0 && seektwo ==0 && i==game.length-leap-1){
//                System.out.println("Check three");
//                return true;
//            }else if(seekone!=0 && seektwo ==0 && i ==game.length-leap-1){
//                ++i;
//                System.out.println("Check four");
//                return true;
//            }else if((seekone !=0 && seektwo!=0)){
//                System.out.println("Check six");
//                return false;
//            }else if (seektwo==0){
//                System.out.println("Check five");
//                i+=leap;
//                seekthree = game[i-1];
//                if(seekthree==0){
//                    if(i-1+leap+leap>=n){
//                        return true;
//                    }else{
//
//                    }
//
//                }
//            }
//
//        }
//        return false;

//        }

    public static void main(String[] args) {
        int[] game1 = {0,1,0};
        int [] game = {0,1,1,0,0,1,1,0,1};
        int[] game2 = {0,1,0,1,0,1,0};
        int[] game3 = {0,0,0,0,0,0};
        int[] game4 = {0,1,1,1,1,0,1,0,1,1,1,1,0,1,1};
        int[] game5 = {0,0,0,1,1,1};
//        System.out.println(canWin(7,game4));
        String test = "0 0 1";
        String [] test1 = test.split(" ");
        int[] game6 = Arrays.stream(test1).mapToInt(Integer::parseInt).toArray();
        System.out.println(canWin(4,game));
//        Scanner scan = new Scanner(System.in);
//        int q = scan.nextInt();
//        while (q-- > 0) {
//            int n = scan.nextInt();
//            int leap = scan.nextInt();
//
//            int[] game = new int[n];
//            for (int i = 0; i < n; i++) {
//                game[i] = scan.nextInt();
//            }
//
//            System.out.println( (canWin(leap, game,n)) ? "YES" : "NO" );
//        }
//        scan.close();
    }


}
