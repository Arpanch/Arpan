package com.arpan.dynamic.programing;

import java.sql.Date;

//// A Naive recursive solution for Rod cutting problem
public class RodCuttingProblem
{
 /* Returns the best obtainable price for a rod of length
    n and price[] as prices of different pieces */
 static int cutRod(int price[], int n)
 {
     if (n <= 0)
         return 0;
     int max_val = Integer.MIN_VALUE;

     // Recursively cut the rod in different pieces and
     // compare different configurations
     for (int i = 0; i<n; i++)
         max_val = Math.max(max_val,
                           price[i] + cutRod(price, n-i-1));

     return max_val;
 }

 /* Driver program to test above functions */
 public static void main(String args[])
 {
     int arr[] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};
     int size = arr.length;
     System.out.println("Start Time");
     long startTime=System.currentTimeMillis();
     System.out.println("Maximum Obtainable Value is "+
                         cutRod(arr, 34));
     long endTime=System.currentTimeMillis();
     System.out.println("Total time"+(endTime-startTime)/1000);

 }
}
