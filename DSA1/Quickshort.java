package com.DSA1;

import java.util.Arrays;

public class Quickshort {
    static int Partion(int[] arr,int low,int high)
    {
        int pivot=arr[high];
        int i=(low-1);
        for(int j=low;j<high;j++)
        {
            if(pivot>=arr[j])
            {
             i++;
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
            }
        }
           int temp=arr[i+1];
           arr[i+1]=arr[high];
           arr[high]=temp;
           return (i+1);
    }
    static void Quick(int[] arr,int low,int high) {
        if (low < high) {
            int pi = Partion(arr, low, high);
            Quick(arr, low, pi - 1);
            Quick(arr, pi + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,1,2,3,4,5,6};
         Quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
