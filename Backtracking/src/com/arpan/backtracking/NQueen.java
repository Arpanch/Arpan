package com.arpan.backtracking;

import java.util.Arrays;

public class NQueen {
	
public static int count=0;
public static void main(String[] args) {
	int N=8;
	char chess[][]=new char[N][N];
	
	for(int i=0;i<chess.length;i++) {
		Arrays.fill(chess[i],'-');
	}
	nQueen(chess, 0);
	//printBoard(chess);
}

private static void nQueen(char[][] mat, int r) {
	if(mat.length==r) {
		printSolution(mat);
		System.out.println();
		System.out.println("*********************************************************");
		
	}
	for(int c=0;c<mat.length;c++) {
		  if(isSafeToPlaceQueen(mat,r,c)) {
			  mat[r][c]='Q';
			  nQueen(mat,r+1);
			  mat[r][c]='-';
		  }
	  }
}

private static boolean isSafeToPlaceQueen(char[][] mat, int r, int c) {
	// Column checking
	for (int i = 0; i < r; i++) {
		if (mat[i][c] == 'Q') {
			return false;
		}
	}
	//
	for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) {
		if (mat[i][j] == 'Q') {
			return false;
		}
	}

	for (int i = r, j = c; i >= 0 && j < mat.length; i--, j++) {
		if (mat[i][j] == 'Q') {
			return false;
		}
	}
	return true;
}

private static void printSolution(char[][] mat)
{	System.out.println(++count+ ": ");
	System.out.println();
    for (char[] chars: mat) {
        System.out.println(Arrays.toString(chars).replaceAll(",", "   "));
    }
    System.out.println();
}

private static void printBoard(char[][] chess) {
	for(int i=0;i<chess.length;i++) {
		for(int j=0;j<chess[0].length;j++) {
			System.out.print(chess[i][j]+"  ");
		}
		System.out.println();
	}
	
}
}
