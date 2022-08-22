package com.DSA1;
import java.util.*;
public class Subarraysum {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,8,9,10};
        int j=0;
        int i=0;
        int sum=0;
        int max=0;
     while(j<arr.length)
     {
         sum+=arr[j];
         if(j-i+1<4)
         {
           j++;
         } else if (j-i+1==4)
         {
             max=Math.max(max,sum);
             sum=max-arr[i];
             i++;
             j++;
         }
     }
        System.out.println(max);
    }
}
