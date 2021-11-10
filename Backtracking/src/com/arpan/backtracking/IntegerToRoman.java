package com.arpan.backtracking;

import java.util.Arrays;
import java.util.List;

public class IntegerToRoman {
public static void main(String[] args) {
	System.out.println(getRoman(427));
}

public static String getRoman(int num) {
	List<Integer> numbers = Arrays.asList(1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000);

	List<String> romanStr = Arrays.asList("I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M");
	String roman = "";
	while (num != 0) {

		for (int i = numbers.size() - 1; i >= 0; i--) {

			if (num - numbers.get(i) < 0)
				continue;

			num =num - numbers.get(i);
			roman =roman + romanStr.get(i);

			break;
		}

	}

	return roman;
}

}
