package com.MockInterview;
import java.util.*;
public class SelectionShort
{
    public static void main(String[] args)
    {
        int[] arr={3,4,5,1,6,7};
        for(int i=0;i<arr.length-1;i++)
        {
         int minmum= i;
         for(int j=i+1;j<arr.length;j++)
         {
           if(arr[j]<arr[minmum])
           {
              minmum= j;
           }
         }
         int temp=arr[minmum];
         arr[minmum]=arr[i];
         arr[i]=temp;
         }
        System.out.println(Arrays.toString(arr));
    }
}
