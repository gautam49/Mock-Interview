package com.DSA1;

import java.util.Collections;

public class Longestsubstring {
    public static void main(String[] args) {
        String s="aaaaaa";
        int count[250]={0};
        int l=0; //i - starting index of window
        int r=0;  //j - ending index of window
        int ans=0; //length of longest substring no repeating char

        while(r<s.length())
        {
            count[s[r]]++;

            while(count[s[r]]>1)
            {
                count[s[l]]--;
                l++;
            }

            ans = Math.max(ans,r-l+1);
            r++;
        }
        System.out.println(ans);
    }
}
