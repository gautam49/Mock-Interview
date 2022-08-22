package com.DSA1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Firstnegative
{
    public static void main(String[] args)
    {
        ArrayList<Integer> s=new ArrayList<>();
        int[] arr={-1,4,-2,5,6,7};
        int start=0;
        int end=0;
        while(end<arr.length)
        {
            if(end-start+1<3)
            {
                end++;
            }
            else if (end-start+1==3)
            {
                if(arr[start]<0)
                {
                    s.add(arr[start]);
                    start++;
                }
            }
        }
        System.out.println(s);
    }
}
