package com.arpan.recusrsion;

public class AbberivationGeneration {
public static void main(String[] args) {

	String input="pep";
	printAllAberavitions(input,"");
	
}

private static void printAllAberavitions(String input, String result) {
	
	if(input.length()==0) {
		System.out.print(result+", ");
		return;
	}
	
	char ch=input.charAt(0);
	String ros=input.substring(1);
	printAllAberavitions(ros,result+ch);
	String output=result+"1";
	if(result.length()>0 && isNumber(result.charAt(result.length()-1)+"")) {
		output=result.substring(0,result.length()-1) + (Integer.parseInt(result.charAt(result.length()-1)+"")+1);
	}
	printAllAberavitions(ros,output);
	
}

private static boolean isNumber(String in) {
	try {
		Integer.parseInt(in);
		return true;
	} catch (Exception e) {
		return false;
	}
}
}
