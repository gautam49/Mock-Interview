package com.MockInterview;

public class MaxNumber {
    public static void main(String[] args) {
        int[] arr={15,4,12,6,122,8,19};
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(max >arr[i])
            {
                max=max;
            }
            else
            {
               max=arr[i];
            }
        }
        System.out.println(max);

    }
}
