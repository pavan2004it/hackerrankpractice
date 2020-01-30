package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class dequeHack {
    public static void main(String[] args) {
//        Deque<String> deque = new ArrayDeque<>();
//        deque.add("a");
//        deque.add("b");
//        deque.add("c");
//        deque.add("c");
//        for(String s : deque){
//            System.out.println(s);
//        }
//        for(int i=0;i<deque.size();i++){
//            System.out.println(deque.);
//        }
//        deque.descendingIterator();
//        long unique = deque.stream().distinct().count();
//        System.out.println(unique);

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        List<Integer> list;
//        List<Long> count = new ArrayList<>();
//        int m = in.nextInt();
//        in.nextLine();
//        String a = in.nextLine();
//        List<Integer> deque = Arrays.stream(a.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
//        for(int i=0;i<=m;i++){
//            list = deque.stream().limit(m).collect(Collectors.toList());
//            deque.remove(0);
//            count.add(list.stream().distinct().count());
//        }
//
//        System.out.println(Collections.max(count));

         Scanner in = new Scanner(System.in);
         ArrayDeque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> hashSet =  new HashSet<>();
         int n = in.nextInt();
         int m = in.nextInt();
         int max = 0;

         for (int i = 0; i < n; i++) {
             System.out.println(i);
             int num = in.nextInt();
             deque.add(num);
             if(deque.size()==m){

                 if(hashSet.size()>max){
                     max=hashSet.size();
                 }
                 int first = deque.remove();
                 if(!deque.contains(first)){
                     hashSet.remove(first);
                 }

             }
         }

//        System.out.println(max);

    }
}
