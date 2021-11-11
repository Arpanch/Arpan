package com.arpan.recusrsion;

import java.util.ArrayList;
import java.util.List;

public class StairPathSolution {
public static void main(String[] args) {
	int noOfStairs=5;
	List<String> allPossibleWays=getAllWays(noOfStairs);
	System.out.println(allPossibleWays);
}

private static List<String> getAllWays(int noOfStairs) {
	if(noOfStairs==0) {
		List<String> baseList=new ArrayList<>();
		baseList.add("");
		return baseList;
	}
	
	if(noOfStairs<0) {
		List<String> baseList=new ArrayList<>();
		return baseList;
	}
	
	List<String> allWaysToDown1Stair=getAllWays(noOfStairs-1);
	List<String> allWaysToDown2Stair=getAllWays(noOfStairs-2);
	List<String> allWaysToDown3Stair=getAllWays(noOfStairs-3);
	
	List<String> allWaysallWaysToDown123Stairs=new ArrayList<>();
	allWaysToDown1Stair.forEach(ele->allWaysallWaysToDown123Stairs.add("1"+ele));
	allWaysToDown2Stair.forEach(ele->allWaysallWaysToDown123Stairs.add("2"+ele));
	allWaysToDown3Stair.forEach(ele->allWaysallWaysToDown123Stairs.add("3"+ele));
	return allWaysallWaysToDown123Stairs;
}
}
