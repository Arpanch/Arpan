package com.arpan.recusrsion;

public class MaxUsingRecursion {
public static void main(String[] args) {
	int a[]= {100};
	int max=findMax(a,0);
	System.out.println(max);
}

private static int findMax(int[] a,int index) {
	if(a.length==0) {
		return -1;
	}
	if(index==a.length-1) {
		return a[a.length-1];
	}
	int rmax=findMax(a,index+1);
	return (a[index]>rmax)?a[index]:rmax;
}
}
