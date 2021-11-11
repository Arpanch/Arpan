package com.arpan.recusrsion;

public class FirstIndexOfOccurence {
public static void main(String[] args) {

	int a[]= {10,6,30,1,2,6,8};
	int target=6;
	int firstIndex=firstIndex(a,0,target);
	System.out.println(firstIndex);

}

private static int firstIndex(int[] a, int index,int target) {
	if(index==a.length) {
		return -1;
	}
	if(a[index]==target) {
		return index; 
	}
	return firstIndex(a,index+1,target);
	
}
}
