package com.MockInterview;

public class Leastpostive
{
    public static int binary(int[] arr,int start,int end)
    {

        int mid=start+(end-start)/2;
        if(arr[mid]>=1)
        {
            return mid;
        }
        if(arr[mid]<0)
        {
            return binary( arr,mid+1,end);
        }
        else{
            return binary(arr,start, mid-1);
        }

    }
    public static void main(String[] args) {
        int[] arr={-7,-5,-4,-2,3,9};
        int x= binary(arr,0,arr.length-1);
        System.out.println(x);

    }
}
