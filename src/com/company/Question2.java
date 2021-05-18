package com.company;

public class Question2 {
    public static void main(String[] args) {

        int[] arr={1,1,0,1,1,1,1,1,0};
        System.out.println(countConsecutiveOnes(arr));
    }

    private static int countConsecutiveOnes(int[] arr) {
        int count=0;
        int maxConsecutiveOne=0;

        for (int i=0;i<arr.length;i++){
            if (arr[i]==1){
                count++;
                maxConsecutiveOne=Math.max(count,maxConsecutiveOne);
            }else {
                count=0;
            }
        }
        return maxConsecutiveOne;
    }

}
