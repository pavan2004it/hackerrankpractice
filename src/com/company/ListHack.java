package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class ListHack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> intList = new ArrayList<>();
        in.skip("\\d*");
        in.nextLine();
        String elements = in.nextLine();
        for(String str:elements.split(" ")){
            intList.add(Integer.parseInt(str));
        }
        int queries = in.nextInt();
        int count =0;
        in.nextLine();
        while(count<queries){
            count++;
            in.skip("\\w*");
            System.out.println(count);

            int index = in.nextInt();
            String element;
            if(!in.hasNextLine() || (element = in.nextLine()).equals("")){
                intList.remove(index);
            }else{
                String res = element.trim();
                intList.add(index,Integer.parseInt(res));
            }

        }
        in.close();
        String list = intList.stream().map(Objects::toString).collect(Collectors.joining(" "));
        System.out.println(list);

    }

}
