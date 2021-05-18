package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Question5 {
    public static void main(String[] args) {
        Map<Integer,String> unsorted=new HashMap<>();
        unsorted.put(4,"abc");
        unsorted.put(10,"ab2");
        unsorted.put(5,"abc3");
        unsorted.put(6,"abc5");

        Map<Integer,String> treeMap=new TreeMap<>(unsorted);
        for(Map.Entry<Integer,String> entry:treeMap.entrySet()){
            System.out.println("Sorted key id: "+entry.getKey()+","+"name: "+entry.getValue());
        }

    }
}
