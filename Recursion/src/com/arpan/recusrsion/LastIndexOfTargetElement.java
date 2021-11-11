package com.arpan.recusrsion;

public class LastIndexOfTargetElement {
public static void main(String[] args) {


	int a[]= {10,30,1,2,8};
	int target=6;
	int lastIndex=lastIndex(a,0,target);
	System.out.println(lastIndex);


}

private static int lastIndex(int[] a, int index, int target) {
	if(index==a.length) {
		return -1;
	}
	
	int lastIndex=lastIndex(a,index+1,target);
	if(a[index]==target && lastIndex==-1) {
		return index;
	}else {
		return lastIndex;
	}
}
}
