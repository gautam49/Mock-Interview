package com.DSA1;

public class Longestsubarray {
    public static void main(String[] args)
    {
      int[] arr={1,0,0,1,1};
      int start=0;
      int end=0;
      int zerocount=0;
      int max=0;
      while(end<arr.length) {
          if (arr[end] == 1) {
              end++;
          } else {
              zerocount++;
              if (zerocount == 2)
              {
                  while (arr[start] != 0)
                  {
                      start++;
                  }
                  start++;
                  zerocount--;
              }
              end++;
          }
          max = Math.max(max, end - start);
      }
        System.out.println(max);
    }
}
