package com.company;

import java.math.BigDecimal;
import java.util.*;

public class TheBigHack {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Integer [] intArr = {1,2,34,5,6,78,99};
        for(int i=0;i<intArr.length;i++){
            for(int j=i+1;j<intArr.length;j++){
                System.out.println(i);
                System.out.println(j);
                if(intArr[i]<intArr[j]){
                    int temp = intArr[j];
                    intArr[j] = intArr[i];
                    intArr[i] = temp;
                }
                System.out.println(Arrays.toString(intArr));
            }
        }
        System.out.println(Arrays.toString(intArr));
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        s = Arrays.stream(s).filter(e-> (e != null && e.length()>0)).toArray(String[]::new);

        Arrays.sort(s,Collections.reverseOrder((o1, o2) -> {
            BigDecimal a = new BigDecimal(o1);
            BigDecimal b = new BigDecimal(o2);
            return a.compareTo(b);
        }));

//        Arrays.sort(s,Collections.reverseOrder(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                BigDecimal a = new BigDecimal(o1);
//                BigDecimal b = new BigDecimal(o2);
//                return a.compareTo(b);
//            }
//        }));





//        for(int i=0;i<arr.length-1;i++){
//            BigDecimal a = new BigDecimal(arr[i]);
//            BigDecimal b = new BigDecimal(arr[i+1]);
//            if(a.compareTo(b) >0 ){
//                System.out.println(arr[i]);
//            }else{
//                System.out.println(arr[i+1]);
//            }
//        }
//        System.out.println(Arrays.toString(arr));
////        System.out.println(s);
//        BigDecimal a = new BigDecimal(s);
//        BigDecimal b = new BigDecimal("0.01");

    }
 }


