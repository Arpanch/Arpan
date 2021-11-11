package com.arpan.recusrsion;
/*Bottom up approach*/
public class PermutationOfString {
public static void main(String[] args) {
	String input="ab";
	printAllPermutations(input,"");
}

private static void printAllPermutations(String input,String result) {// acb
	
	if(input.length()==0) {
		System.out.print(result + ", ");
		return;
	}
	for(int i=0;i<input.length();i++) {
		char init=input.charAt(i);//c
		String ros=input.substring(0,i) + input.substring(i+1);//c
		printAllPermutations(ros,result + init);
	}
}
}
