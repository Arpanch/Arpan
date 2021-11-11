package com.arpan.recusrsion;

public class TOI {
	static int counter=0;
public static void main(String[] args) {
	int noOfDiscs=3;
	String iTower="A";
	String tTower="B";
	String temp="C";
	int counter=0;
	
	moveTower(noOfDiscs,iTower,tTower,temp);
	
}

private static void moveTower(int disc, String iTower, String tTower, String temp) {
	if(disc==0) {
		return;
	}
	moveTower(disc-1,iTower,temp,tTower);
	counter++;
	System.out.println(counter+": "+"Move Disc "+disc+" ("+iTower+ "->"+tTower+")");
	moveTower(disc-1,temp,tTower,iTower);
}
}
