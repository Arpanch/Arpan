package com.arpan.recusrsion;

import java.util.List;

public class StairPathPrint {
	public static void main(String[] args) {

		int noOfStairs=5;
		printAllWays(noOfStairs,"");
		

	}

	private static void printAllWays(int noOfStairs, String string) {
		
		if(noOfStairs==0) {
			System.out.print(string+" ,");
			return;
		}
		if(noOfStairs<0) {
			return;
		}
		
		printAllWays(noOfStairs-1,string+"1");
		printAllWays(noOfStairs-2,string+"2");
		printAllWays(noOfStairs-3,string+"3");
		
	}

}
