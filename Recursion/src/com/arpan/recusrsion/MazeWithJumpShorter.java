package com.arpan.recusrsion;

import java.util.ArrayList;
import java.util.List;

public class MazeWithJumpShorter {
    public static int[] horizonalMoves= {2,3};
	public static int[] verticalMoves= {1,2,3};
	public static int[] diagonalMoves= {1,2,3};

	public static void main(String[] args) {

		int initX = 0;
		int initY = 0;
		int destX = 2;
		int destY = 2;
		List<String> allPaths = getAllMazePaths(initX, initY, destX, destY);
		System.out.println(allPaths);

	}

private static List<String> getAllMazePaths(int initX, int initY, int destX, int destY) {
	
	if(initX==destX && initY==destY) {
		List<String> basePaths=new ArrayList<>();
		basePaths.add("");
		return basePaths;
	}
	
	if(initX>destX && initY>destY) {
		List<String> negativePaths=new ArrayList<>();
		return negativePaths;
	}
	
	List<String> xPaths=new ArrayList<>();
	List<String> yPaths=new ArrayList<>();
	List<String> dPaths=new ArrayList<>();
	List<String> finalPaths=new ArrayList<>();
	
	if(initX<destX) {
	for (int i = 0; i < horizonalMoves.length; i++) {
		xPaths = getAllMazePaths(initX + horizonalMoves[i], initY, destX, destY);
		for (String elem : xPaths) {
			finalPaths.add("H" + horizonalMoves[i] + elem);
		}
	}
	}
	
	if (initY < destY) {
		for (int i = 0; i < verticalMoves.length; i++) {
			yPaths = getAllMazePaths(initX, initY + verticalMoves[i], destX, destY);
			for (String elem : yPaths) {
				finalPaths.add("V" + verticalMoves[i] + elem);
			}
		}
	}
	
	if (initX < destX && initY < destY) {
		for (int i = 0; i < diagonalMoves.length; i++) {
			dPaths = getAllMazePaths(initX + diagonalMoves[i], initY + diagonalMoves[i], destX, destY);
			for (String elem : dPaths) {
				finalPaths.add("D" + diagonalMoves[i] + elem);
			}
		}
	}
	
	return finalPaths;
	
}

}
