package com.company;

import java.math.BigInteger;

public class IsPrimeBig {
    public static void main(String[] args) {
        BigInteger big = new BigInteger("9");
        if(big.isProbablePrime(1)){
            System.out.println("Bazinga");
        }else{
            System.out.println("Not Prime");
        }
    }
}
