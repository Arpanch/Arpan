package com.arpan.recusrsion;

public class PrintEncodings {
private static String codes[]= {"","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s"
			,"t","u","v","w","x","y","z"};
public static void main(String[] args) {
	String input="103";
	printAllEncodings(input,"");
}
private static void printAllEncodings(String input, String result) {
	
	if(input.length()==0) {
		System.out.print(result+" ");
		return;
	}
	
	char ch=input.charAt(0);
	if(isValidCode(ch+"")) {
		printAllEncodings(input.substring(1),result + getCode(ch+""));
	}
	if(input.length()>1 && isValidCode(input.substring(0,2))) {
		printAllEncodings(input.substring(2),result + getCode(input.substring(0,2)));
	}
	
}

private static boolean isValidCode(String x) {
	if (x.length() == 0 || x.charAt(0) == '0') {
		return false;
	}
	try {
		int a = (Integer.parseInt(x));
		if (0 < a && 27 > a) {
			return true;
		}
	} catch (Exception e) {
		return false;
	}
	return false;
}

private static String getCode(String x) {
	return codes[Integer.parseInt(x)];
}

}
