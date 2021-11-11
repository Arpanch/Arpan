package com.arpan.recusrsion;

import java.util.List;

public class printMazePath {
public static void main(String[] args) {

	int initX=0;
	int initY=0;
	int destX=3;
	int destY=3;
	printMazePaths(initX,initY,destX,destY,"");
	
}

private static void printMazePaths(int initX, int initY, int destX, int destY, String path) {
	
	if(initX==destX && initY== destY) {
		System.out.print(path+",");
		return;
	}
	
	if(initX<destX) {
	printMazePaths(initX+1,initY,destX,destY,path+"H");
	}
	if(initY<destY) {
	printMazePaths(initX,initY+1,destX,destY,path+"V");
	}
	
}
}
