package com.Test;

public class Test1 {
    static void binary(int[] arr,int k)
    {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]==k)
            {
                System.out.println(mid);
            }
            if(arr[mid]<k)
            {
                start=mid+1;
            }
            else if(arr[mid]>k)
            {
                end=mid-1;
            }

        }

    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,7,6,9};
        int k=9;
        binary(arr,k);

    }
}
