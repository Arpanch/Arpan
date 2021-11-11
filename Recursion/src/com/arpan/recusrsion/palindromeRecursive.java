package com.arpan.recusrsion;

public class palindromeRecursive {
	public static void main(String[] args) {
		String x="manz";
		if(x.length()>3) {
			x=x.substring(0,3);
			System.out.println(x);
		}
		boolean isPalindrome= checkPlaindrome(x,0,x.length()-1);
		//System.out.println(isPalindrome);
		
	}

	private static boolean checkPlaindrome(String x,int start,int end) {
		if(start>=end) {
			return true;
		}
		return x.charAt(start)==x.charAt(end) && checkPlaindrome(x,start+1,end-1);
	}


}
