package com.arpan.recusrsion;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class GetAllSubsequences {
public static void main(String[] args) {
	String inputString="abc";
	List<String> allSubsequences=getAllSubsequences(inputString);
	System.out.println(allSubsequences);
}

private static List<String> getAllSubsequences(String inputString) {

	
	if(inputString.length()==0) {
		List<String> baseArrayList=new ArrayList<>();
		baseArrayList.add("");
		return baseArrayList;
	}
	char ch=inputString.charAt(0);
	String ros=inputString.substring(1);
	List<String> allSubsequncesOfROS=getAllSubsequences(ros);
	List<String> finalList=new ArrayList<>();
	if(!allSubsequncesOfROS.isEmpty()) {
	finalList.addAll(allSubsequncesOfROS);
	allSubsequncesOfROS.forEach(elem->finalList.add(ch+elem));
	}
	return finalList;
}
}
