package com.arpan.graph;

public class LongestPlaindromeWorst {
	
	public static String longestSequence(String s){
		char c[]=s.toCharArray();
		String longest=s.substring(0,1);
		for(int i=0;i<c.length;i++){
			String ap=""+c[i];
			for(int j=i+1;j<c.length;j++){
				 ap=ap+c[j];
				 if(checkPlaindrome(ap)){
					 if(ap.length()>longest.length()){
						 longest=ap;
					 }
				 }
			}
		}
		return longest;
	}
	public static boolean checkPlaindrome(String s){
		for(int i=0;i<s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(s.length()-i-1)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String s="forgeeksskeegfor";
		System.out.println(longestSequence(s));
	}

}
