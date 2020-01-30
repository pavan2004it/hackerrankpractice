package com.company;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {
    public static void main(String[] args) {
//        String word = "ab ABCD";
//        Pattern pattern = Pattern.compile("\\babc",Pattern.CASE_INSENSITIVE);
//        Matcher m = pattern.matcher(word);
//        while(m.find()){
//            System.out.println(m.group());
//        }
        String sentence = "i am am am north am ram here";
        Pattern pattern = Pattern.compile("\\b(\\w+)(\\s+\\1+)",Pattern.CASE_INSENSITIVE);
        Matcher m = pattern.matcher(sentence);

        while(m.find()){
//            System.out.println("Group 1 " + m.group(0) + " Starting at " + m.start() + " ending at " + m.end());
            System.out.println("Group 2 " + m.group(2));
//            sentence = sentence.replaceAll(m.group(),m.group(1));
        }
//        System.out.println(sentence);

    }
}
