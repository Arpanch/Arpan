package com.arpan.recusrsion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllIndicesOfArray {
public static void main(String[] args) {


	int a[]= {10,6,30,1,2,6,8,6};
	int target=6;
	List<Integer> allIndeces=findAllIndices(a,0,target);
	//System.out.println(allIndeces);
	
	int[] allOccurences=findAllIndices(a,0,target,0);
	System.out.println(Arrays.toString(allOccurences));


}

private static int[] findAllIndices(int[] a, int index, int target, int fsf) {
	if(a.length==index) {
		return new int[fsf];
	}
	if(a[index]==target) {
		fsf++;
	}
	int[] targetArray= findAllIndices(a,index+1,target,fsf);
	if(a[index]==target) {
		targetArray[fsf-1]=index;
	}
	
	return targetArray;
}

private static List<Integer> findAllIndices(int[] a, int index, int target) {
	if(index==a.length) {
	return 	new ArrayList<>();
	}
	List<Integer> list=findAllIndices(a,index+1,target);
	if(a[index]==target) {
		list.add(index);
	}
	return list;
}
}
