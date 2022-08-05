package com.MockInterview;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args)
    {
    String primenumbers="";

    for(int i=1;i<100;i++)
     {
         int counter=0;
        for(int j=i;j>=1;j--)
        {
            if (i%j == 0) {
                counter++;
            }
        }
             if(counter==2)
             {
                 primenumbers = primenumbers + i + " ";
             }

      }
        System.out.println( " Primenumbers are " + primenumbers);
    }
    }
