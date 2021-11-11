package com.arpan.recusrsion;

public class PrintAllElements {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5};
	printAllElemen(a,0);
}


private static void printAllElemen(int[] a,int index) {
	if(index>=a.length) {
		return;
	}
	System.out.print(a[index]+" ");
	printAllElemen(a,index+1);
	}
}
