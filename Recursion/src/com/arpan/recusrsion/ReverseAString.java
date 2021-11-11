package com.arpan.recusrsion;

public class ReverseAString {
public static void main(String[] args) {
	String x="arpan";
	System.out.println(reverse(x));
}

private static String reverse(String x) {

	if(x.length()<2) {
		return x;
	}
	return  reverse(x.substring(1,x.length())) + x.charAt(0);
}
}
//reverse(n) + reverse(an) + reverse(pan) + reverse(rpan) + reverse(arpan)
// n            revrse(n) +a