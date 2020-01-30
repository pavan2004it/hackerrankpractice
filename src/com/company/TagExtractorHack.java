package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagExtractorHack {

    public static void main(String[] args) {
//        StringBuilder htmlText = new StringBuilder("<h1>I am Iron Man</h1>");
//        htmlText.append("<h2>I am Hulk</h2>");
//        htmlText.append("<p>A Paragraph of sups</p>");
//        htmlText.append("<p>another para</p>");
//        htmlText.append("<h2>Summary</h2>");
//        htmlText.append("<h2></h2>");
//        htmlText.append("<p>Summary</p>");
//        int count =0;

//        System.out.println(matcher.groupCount());
        String line = "<h1>had<h1>public has its limits</h1></h1>";
        String tagPattern = "<(.+?)>([^<>]+)</\\1>";
        Pattern gPattern = Pattern.compile(tagPattern);
        Matcher matcher = gPattern.matcher(line);
        while(matcher.find()){
            System.out.println(matcher.group(2));
        }
//        System.out.println("None");
//        if(matcher.find()){
//
//        }else{
//            System.out.println("None");
//        }

//        String tagPattern = "(<.+?>)(.+?)(</.+?>)";
////        String tagPattern1 = "<h2>";
//        Pattern gPattern = Pattern.compile(tagPattern);
//        Matcher matcher = gPattern.matcher(htmlText);
//
//        while(matcher.find()){
//            count++;
//            System.out.println(matcher.group(2));
////            System.out.println("Occurence " + count + " Started at  " + matcher.start() + " Ended at " + matcher.end() + " " +  matcher.group(2));
////            System.out.println("Occurence " + count + " " + matcher.group(1) + " Started at  " + matcher.start() + " Ended at " + matcher.end());
//
//        }


    }



}
