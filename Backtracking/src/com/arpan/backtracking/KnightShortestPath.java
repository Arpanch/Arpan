package com.arpan.backtracking;

import java.util.LinkedList;
import java.util.Queue;

public class KnightShortestPath {
public static void main(String[] args) {
	int N=100;
	int[][] chess=new int[N][N];
	Cell sourceCell=new Cell(0, 0);
	Cell destinationCell=new Cell(99,99);
	
	int length= findShortestPath(chess,sourceCell,destinationCell,N);
	System.out.println(length);
	
}

private static int findShortestPath(int[][] chess, Cell sourceCell, Cell destinationCell,int N) {
	Queue<Cell> queue=new LinkedList<Cell>();
	queue.add(sourceCell);
	int row[] = { 2, 2, -2, -2, 1, 1, -1, -1 };
	int col[] = { -1, 1, 1, -1, 2, -2, 2, -2 };
	while(!queue.isEmpty()) {
		Cell box=queue.poll();
		if(box.getX()==destinationCell.getX() && box.getY()==destinationCell.getY()) {
			return chess[box.getX()][box.getY()];
		}else {
			for (int i = 0; i < row.length; i++)
            {
                int x1 = box.getX() + row[i];
                int y1 = box.getY() + col[i];

                if (isValid(x1, y1, N) && chess[x1][y1]==0) {
                	queue.add(new Cell(x1, y1));
                	chess[x1][y1]=chess[box.getX()][box.getY()]+1;
                }
            }
			
		}
	}
	return Integer.MAX_VALUE;
}
private static boolean isValid(int x, int y, int N) {
    return (x >= 0 && x < N) && (y >= 0 && y < N);
}

}


class Cell{
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Cell(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
}
