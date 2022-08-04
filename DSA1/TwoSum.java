package com.MockInterview;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] pairSum(int[] arr, int k) {
        HashMap<Integer,Integer> gautam = new HashMap<Integer,Integer>();
        int indexOne = 0, indexTwo = 0;
        for (int num : arr){
            if (gautam.containsKey(k - num)) {
                indexTwo = gautam.get(k - num);
                break;
            }
        gautam.put(num, indexOne);
        indexOne++;
    }
    return new int[] {indexOne, indexTwo};
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int k=7;
        int[] sum = pairSum(arr, k);
        System.out.println(Arrays.toString(sum));

    }
}
