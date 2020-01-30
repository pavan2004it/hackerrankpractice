package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringTokenHack {
    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?";
        ArrayList<String> arr = new ArrayList<>();
        Collections.addAll(arr,s.split("[\\s'\\?,@_\\.!]"));
        arr.removeAll(Collections.singleton(""));
        System.out.println(arr.size());
        arr.forEach(System.out::println);
    }
}
