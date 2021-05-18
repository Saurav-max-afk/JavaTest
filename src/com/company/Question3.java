package com.company;

import java.util.HashSet;
import java.util.Set;

public class Question3 {
    public static void main(String[] args) {
        int[] a= {0,1,2,3,4,5,6,7,7,8,9};
        System.out.println("Duplicate element is: ");
        Set<Integer> s= new HashSet<>();
        for(int i:a){
            boolean b=s.add(i);
            if (b==false){
                System.out.println(i);
            }
        }
    }
}
