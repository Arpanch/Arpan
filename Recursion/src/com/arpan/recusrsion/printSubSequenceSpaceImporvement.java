package com.arpan.recusrsion;

import java.util.List;

public class printSubSequenceSpaceImporvement {
public static void main(String[] args) {
	String inputString="abc";
	printAllSubsequences(inputString,"");
	

}

private static void printAllSubsequences(String inputString,String finalString) {
	
	if(inputString.length()==0) {
		System.out.print(finalString+",");
		return;
	}
	char ch=inputString.charAt(0);
	String ros=inputString.substring(1);
	printAllSubsequences(ros,finalString);
	printAllSubsequences(ros,finalString+ch);
	
}
}
