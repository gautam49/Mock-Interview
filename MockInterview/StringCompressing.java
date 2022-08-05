package com.MockInterview;
import java.io.*;
import java.util.*;
public class StringCompressing {
    public static  String compression(String str)
    {
        String s = String.valueOf(str.charAt(0));
        int count=1;
        for(int i=1;i<str.length();i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (curr == prev) {
                count++;
            } else {
                if (count > 1) {
                    s += count;
                    count = 1;
                }
                s += curr;
            }
        }
            if(count>1) {
                s += count;
            }

        return s;

    }
    public static void main(String[] args) {
        String str= "gaaaautammmm";
        System.out.println(compression(str));
    }
}
