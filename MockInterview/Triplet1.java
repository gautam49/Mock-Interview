package MockInterview.DSA1;

import java.util.HashMap;
import java.util.HashSet;
import java.io.*;

public class Triplet1 {
    public static boolean triplet(int[] arr,int sum)
    {
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<arr.length-2;i++)
        {
          int temp=sum-arr[i];
          for(int j=i+1;j< arr.length;j++)
          {
              if(s.contains(temp-arr[j]))
              {
                  System.out.println(arr[i]+" "+ (temp-arr[j])+" "+arr[j]);
                  return true;
              }
              s.add(arr[j]);
          }

        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,8,9};
        int sum=20;
         triplet(arr,sum);
    }

    
}
