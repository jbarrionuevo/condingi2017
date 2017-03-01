package cci.arrays.lists;

import java.util.HashSet;
import java.util.Set;

public class Ch01Ex01 {

	public boolean hasAllUniqueChars(String inputStr) {
		Set<Character> charSet = new HashSet<>();
		int i = 0;

		while (i < inputStr.length() /*&& !repeatedCharFound*/) {
			if (charSet.contains(inputStr.charAt(i))) {
				return false;
			} else {
				charSet.add(inputStr.charAt(i));
			}
			i++;
		}
		return true;
	}
}
/*
 * Is Unique: Implement an algorithm to determine if a string has all unique
 * characters. What if you cannot use additional data structures? Hints: #44, #
 * 777, # 732
 */