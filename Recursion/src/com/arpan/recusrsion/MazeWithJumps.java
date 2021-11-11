package com.arpan.recusrsion;

import java.util.ArrayList;
import java.util.List;

public class MazeWithJumps {
	public static void main(String[] args) {
		
		int initX=0;
		int initY=0;
		int destX=1;
		int destY=1;
		List<String> allPaths=getAllMazePaths(initX,initY,destX,destY);
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
		
		List<String> xPaths1=new ArrayList<>();
		List<String> xPaths2=new ArrayList<>();
		List<String> xPaths3=new ArrayList<>();
		
		 if(initX<destX) {
		 xPaths1=getAllMazePaths(initX+1,initY,destX,destY);
		 xPaths2=getAllMazePaths(initX+2,initY,destX,destY);
		 xPaths3=getAllMazePaths(initX+3,initY,destX,destY);
		 }
		 
		 
		 List<String> yPaths1=new ArrayList<>();
		 List<String> yPaths2=new ArrayList<>();
		 List<String> yPaths3=new ArrayList<>();
		
		 if(initY<destY) {
		 yPaths1=getAllMazePaths(initX,initY+1,destX,destY);
		 yPaths2=getAllMazePaths(initX,initY+2,destX,destY);
		 yPaths3=getAllMazePaths(initX,initY+3,destX,destY);
		 }
		 
		 List<String> dPaths1=new ArrayList<>();
		 List<String> dPaths2=new ArrayList<>();
		 List<String> dPaths3=new ArrayList<>();
		
		 if(initX<destX && initY<destY) {
		 dPaths1=getAllMazePaths(initX+1,initY+1,destX,destY);
		 dPaths2=getAllMazePaths(initX+2,initY+2,destX,destY);
		 dPaths3=getAllMazePaths(initX+3,initY+3,destX,destY);
		 }
		 
		List<String> finalPaths=new ArrayList<String>();
		xPaths1.forEach(ele->{
			finalPaths.add("H1"+ele);
		});
		xPaths2.forEach(ele->{
			finalPaths.add("H2"+ele);
		});
		xPaths3.forEach(ele->{
			finalPaths.add("H3"+ele);
		});
		
		yPaths1.forEach(ele->{
			finalPaths.add("V1"+ele);
		});
		yPaths2.forEach(ele->{
			finalPaths.add("V2"+ele);
		});
		yPaths3.forEach(ele->{
			finalPaths.add("V3"+ele);
		});
		
		dPaths1.forEach(ele->{
			finalPaths.add("D1"+ele);
		});
		dPaths2.forEach(ele->{
			finalPaths.add("D2"+ele);
		});
		dPaths3.forEach(ele->{
			finalPaths.add("D3"+ele);
		});
		return finalPaths;
	}
}
