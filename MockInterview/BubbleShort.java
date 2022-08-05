package com.MockInterview;


import java.util.Arrays;

public class BubbleShort {
    public static void main(String[] args) {
        int[] arr={3,6,4,8,9,0};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
