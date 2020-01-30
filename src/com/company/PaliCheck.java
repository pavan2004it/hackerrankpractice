package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class PaliCheck {
    public static void main(String[] args) {
        String s = "madam";
        List<String> pali = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        Collections.addAll(pali, s.split(""));
        Collections.reverse(pali);
        pali.forEach(sb::append);
        pali.forEach(System.out::println);
        if(s.compareToIgnoreCase(sb.toString()) == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
