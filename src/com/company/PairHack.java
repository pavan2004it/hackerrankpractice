package com.company;

import java.util.ArrayList;
import java.lang.Object;

public class PairHack<K,V> {
    public final K First;
    public final V Second;

    public PairHack(K first, V second) {
        this.First = first;
        Second = second;
    }


    @Override
    public int hashCode() {
        return 31* First.hashCode() + Second.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj ==null || this.getClass() != obj.getClass()){
            return false;
        }

        PairHack<?,?> pairHack = (PairHack<?, ?>) obj;
        if(!First.equals(pairHack.First))
            return false;
        return Second.equals(pairHack.Second);
    }

    @Override
    public String toString() {
        return "(" + First + ", " + Second + ")";
    }

    public static <K,V> PairHack<K,V> of(K k, V v){
        return new PairHack<>(k,v);
    }
}
