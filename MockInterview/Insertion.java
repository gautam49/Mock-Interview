package com.MockInterview;

import java.util.Arrays;

public class Insertion
{
    public static void main(String[] args) {
        int[] arr={6,5,2,6,7,8,9};
        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && key<arr[j])
            {
             arr[j+1]=arr[j];
             j--;
            }
            arr[j+1]=key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
