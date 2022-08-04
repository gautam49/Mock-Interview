package com.MockInterview;

public class Triplet {
    public static void main(String[] args)
    {
       int[] arr={3,4,5,6,7,8,};
       int target=13;
       for(int i=0;i<arr.length-2;i++)
       {
          for(int j=i+1;j<arr.length-1;j++)
          {
              for(int k=j+1;k<arr.length;k++)
              {
                 if(arr[i]+arr[j]+arr[k]==target)
                 {
                     System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                 }
              }
          }
       }
    }
}
