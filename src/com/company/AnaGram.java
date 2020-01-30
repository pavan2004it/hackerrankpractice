package com.company;




public class AnaGram {
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "margana";
        java.util.List<String> arrlist = new java.util.ArrayList<>();
        java.util.HashMap<String,Integer> anagram1 = new java.util.HashMap<>();
        java.util.HashMap<String,Integer> anagram2 = new java.util.HashMap<>();
        java.util.Collections.addAll(arrlist,str1.split(""));
        for (String s : arrlist) {
            anagram1.put(s.toLowerCase(), java.util.Collections.frequency(arrlist,s));
            System.out.println(anagram1);
        }
        arrlist.clear();
        java.util.Collections.addAll(arrlist,str2.split(""));
        for (String s : arrlist) {
            anagram2.put(s.toLowerCase(),java.util.Collections.frequency(arrlist,s));
            System.out.println(anagram2);
        }
        System.out.println(anagram1.equals(anagram2));



    }
}
