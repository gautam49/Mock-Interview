package com.MockInterview;

import java.util.HashSet;

public class pair {
    static void PairSum(int[] arr,int target){
        HashSet<Integer> s=new HashSet<Integer>();
        for(int i=0;i< arr.length;i++)
        {
            int temp=target-arr[i];
            if(s.contains(temp))
            {
                System.out.println(arr[i]+" "+temp);
            }
            s.add(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,3,1,2,9};
        int target=5;
        PairSum(arr,target);
    }
    
}
