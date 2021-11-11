package com.arpan.recusrsion;

public class NBoxesRIdenticalItems {
	static int counter=0;
public static void main(String[] args) {
	int boxes=8;
	int items=7;
	
	arrangeItems(boxes,items,0,0,"");
}

private static void arrangeItems(int boxes, int items, int usedItems,int usedBoxes, String result) {
	
	if(boxes==usedBoxes) {
		if(usedItems==items) {
			counter++;
			System.out.println(counter+" ---> "+result.substring(0,result.length()-2));
		}
		return;
	}
	arrangeItems(boxes,items,usedItems+1,usedBoxes+1,result+"###, ");
	arrangeItems(boxes,items,usedItems,usedBoxes+1,result+"___, ");
}
}
