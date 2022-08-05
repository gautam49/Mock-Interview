package com.MockInterview;
import java.util.*;
public class Secondmax {
    public static void main(String[] args)
    {
        int [] arr={2,3,4,5,6,7,8,9};
      int max = Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++)
      {
       if(max<arr[i])
         {
           max=arr[i];
          }
      }

        //System.out.println(max);
        int second_max=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i]>second_max && arr[i]!=max)
          {
            second_max=arr[i];
          }
      }
        System.out.println(second_max);
    }
}
