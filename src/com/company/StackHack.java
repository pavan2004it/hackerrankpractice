package com.company;


import java.util.*;

public class StackHack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<String> st = new Stack<>();
        while(in.hasNext()){
            String s = in.nextLine();
            for(String str: s.split("")){
                if(str.equals("(") || str.equals("{") || str.equals("[")){
                    st.push(str);
                }else if((!st.isEmpty() && str.equals(")") && st.peek().equals("(")) || (!st.isEmpty() && str.equals("}") && st.peek().equals("{")) || (!st.isEmpty() && str.equals("]") && st.peek().equals("["))){
                    st.pop();
                }else{
                    st.push(str);
                }
            }
            if(st.isEmpty()){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }

    }
}
