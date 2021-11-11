package com.arpan.recusrsion;
//Permutation
public class NBoxesRDistinctItems {
	public static void main(String[] args) {
		int boxes=4;
		int items=2;
		arranageItems(boxes,items,-1,"");
	}

	private static void arranageItems(int boxes, int items, int itemNo, String result) {
		
		if(boxes==0) {
				System.out.println(result.substring(1));
			return;
		}
		
		for(int i=0;i<boxes;i++) {
			arranageItems(boxes-1,items,itemNo+1,result+", ");
		
		}
		
	}
 
}
