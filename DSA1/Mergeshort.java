package com.DSA1;

import java.util.Arrays;

public class Mergeshort {
    static  void merger(int[]arr,int start,int mid,int end) {
        int[] A = new int[end - start + 1];
        int k = 0;
        int i = start;
        int j = mid + 1;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                A[k] = arr[i];
                i++;
            } else {
                A[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            A[k] = arr[i];
            i++;
            k++;
        }
        while (j <= end) {
            A[k] = arr[j];
            j++;
            k++;
        }
        for(int l=0,m=start;l<A.length;l++,m++)
        {
            arr[m]=A[l];
        }
    }
    static void partion(int[] arr,int start,int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            partion(arr, start, mid);
            partion(arr, mid + 1, end);
            merger(arr, start, mid, end);
        }
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,1,3,4,5,6,7,8,9};
        partion(arr,0,arr.length-1);
        System.out.println (Arrays.toString(arr));
    }
}
