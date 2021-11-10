package com.arpan.backtracking;

import java.util.LinkedList;
import java.util.Queue;

public class AllKnightPaths {
	public static void main(String[] args) {
		ChessCell source=null;
		int N=5;
		int[][] visited=new int[N][N];
		for(int i=0;i<visited.length;i++) {
			for(int j=0;j<visited[0].length;j++) {
				source=new ChessCell(i,j);
			}
		}
		printAllPaths(visited,N,source,0);
	}

	private static void printAllPaths(int[][] visited, int N,ChessCell source,int counter) {
		Queue<ChessCell> queue=new LinkedList<ChessCell>();
		queue.add(source);
		while(!queue.isEmpty() && counter<=N*N) {
			
		}
		
		
		
	}
}


	

