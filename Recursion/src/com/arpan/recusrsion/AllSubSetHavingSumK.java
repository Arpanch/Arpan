package com.arpan.recusrsion;
import java.util.*;
public class AllSubSetHavingSumK {
public static void main(String[] args) {
	int[] inputs= {10,20,30,40,50};
	int sum=70;
	List<Integer> results=new ArrayList<>();
	printsAllSets(inputs,sum,0,results,0);
}

private static void printsAllSets(int[] inputs, int sum, int ssf,List<Integer> results,int index) {
	
	if(sum==ssf) {
		System.out.println(results);
		return;
	}
	
	if(index>=inputs.length || ssf>sum) {
		return;
	}
	
	
	List<Integer> wIncluding=new ArrayList<Integer>(results);
	printsAllSets(inputs,sum,ssf,wIncluding,index+1);
	
	List<Integer> including=new ArrayList<Integer>(results);
	including.add(inputs[index]);
	printsAllSets(inputs,sum,ssf+inputs[index],including,index+1);
	
}
}
