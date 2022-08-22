package com.DSA1;

import java.util.Arrays;

public class Theesum {
    public static void main(String[] args) {
        int[] arr={2,4,3,5,6,7,8,9,10};
        int k=34;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int start=j+1,end=arr.length-1;
                while(start<end)
                {
                    int current=arr[i]+arr[start]+arr[end]+arr[j];
                    if(current==k)
                    {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[start]+" "+arr[end]);
                        start++;
                        end--;
                    }
                    else if (current<k)
                    {
                        start++;
                    }
                    else
                    {
                        end--;
                    }
                }
            }
        }
    }
}
