package com.company;


public class GenericsHack {

    public static <T> void printArray(T[] a){
        for(T element: a){
            System.out.println(element);
        }
    }




}


