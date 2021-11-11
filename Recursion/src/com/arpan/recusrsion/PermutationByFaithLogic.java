package com.arpan.recusrsion;

import java.util.ArrayList;
import java.util.List;

public class PermutationByFaithLogic {
public static void main(String[] args) {
	String input="abcd";
	List<String> allPermuationOfString =getAllPermutation(input);
	System.out.println(allPermuationOfString);

}

private static List<String> getAllPermutation(String input) {

	if (input.length() == 0) {
		List<String> baseArrayList = new ArrayList<>();
		baseArrayList.add("");
		return baseArrayList;
	}
	char ch = input.charAt(0);
	
	List<String> allPermutatoions = getAllPermutation(input.substring(1));
	
	List<String> myPermutations = new ArrayList<>();
	for (String word : allPermutatoions) {
		if (word.length() > 0) {
			myPermutations.add(ch + word);
			for (int i = 1; i < word.length(); i++) {
				myPermutations.add(word.substring(0, i) + ch + word.substring(i));
			}
;			myPermutations.add(word + ch);
		} else {
			myPermutations.add(word + ch);
		}
	}
	return myPermutations;
}
}
