package com.arpan.recusrsion;

import java.util.*;

public class KeyPadCombination {
	public static String[] codes= {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"}; 

	public static void main(String[] args) {
		String inputCode="789";
		List<String> allCombinations = getAllComb(inputCode);
		System.out.println(allCombinations);
	}

	private static List<String> getAllComb(String code) {
		if(code.length()==0) {
			List<String> baseList=new ArrayList<>();
			baseList.add("");
			return baseList;
		}
		
		char ch=code.charAt(0);
		String initalString=codes[ch-'0'];
		String ros=code.substring(1);
		List<String> allCombinations=getAllComb(ros);
		List<String> finalList=new ArrayList<>();
		allCombinations.forEach(ele->{
			for(int i=0;i<initalString.length();i++) {
				char charCode=initalString.charAt(i);
				finalList.add(charCode+ele);
			}
		});
		return finalList;
	}
	
}
