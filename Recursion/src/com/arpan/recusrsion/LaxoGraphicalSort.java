package com.arpan.recusrsion;

public class LaxoGraphicalSort {
public static void main(String[] args) {
	int n=1000;
	for(int i=1;i<=9;i++) {
		printAllNumbers(i,n);
	}
}

private static void printAllNumbers(int i, int n) {

	if(i>n) {
		return;
	}
	
	System.out.print(i+", ");
	for(int j=0;j<9;j++) {
		printAllNumbers(i*10+j,n);
	}
	
}
}
