package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapHack {
    public static void main(String[] args) {
        Scanner contacts = new Scanner(System.in);
        Map<String,Integer> phoneBook = new HashMap<>();
        int n = contacts.nextInt();
        contacts.nextLine();
        for(int i=0;i<n;i++){
            String name = contacts.nextLine();
            int phoneNumber = contacts.nextInt();
            contacts.nextLine();
            phoneBook.put(name,phoneNumber);
        }
        while(contacts.hasNextLine()){
            String s = contacts.nextLine();
            if(phoneBook.containsKey(s)){
                if(s.equals("")){
                    contacts.close();
                }
                System.out.println(s + "=" + phoneBook.get(s));
            }else{
                System.out.println("Not Found");
            }

        }
    }
}
