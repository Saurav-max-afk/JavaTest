package com.company;

import java.util.ArrayList;

public class Question1 {
    public static void main(String[] args) {
        int[] a={8,5,10,12,3,1,4};

        ArrayList<Integer> al1= new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 == 0){
                al1.add(a[i]);
            }

        }
        System.out.println("Even Numbers are: ");
        for(int i:al1){
            System.out.println(i+"");
        }
    }
}
