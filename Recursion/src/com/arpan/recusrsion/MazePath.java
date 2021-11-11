package com.arpan.recusrsion;

import java.util.ArrayList;
import java.util.List;

//We can only go horizontal-right and vertical-down
public class MazePath {
public static void main(String[] args) {
	int initX=1;
	int initY=1;
	int destX=7;
	int destY=7;
	List<String> allPaths=getAllMazePaths(initX,initY,destX,destY);
	System.out.println(allPaths);
}

private static List<String> getAllMazePaths(int i, int j, int k, int l) {
	
	if(i==k && l==j) {
		List<String> basePaths=new ArrayList<>();
		basePaths.add("");
		return basePaths;
	}
	List<String> xPaths=new ArrayList<>();
	List<String> yPaths=new ArrayList<>();
	
	 if(i<k) {
	 xPaths=getAllMazePaths(i+1,j,k,l);
	 }
	 if(j<l) {
	 yPaths=getAllMazePaths(i,j+1,k,l);
	 }
	 
	 List<String> finalPaths=new ArrayList<>();
	 xPaths.forEach(elem->{
		 finalPaths.add("H"+elem);
	 });
	 yPaths.forEach(elem->{
		 finalPaths.add("V"+elem);
	 });
	 return finalPaths;
	
}
}
