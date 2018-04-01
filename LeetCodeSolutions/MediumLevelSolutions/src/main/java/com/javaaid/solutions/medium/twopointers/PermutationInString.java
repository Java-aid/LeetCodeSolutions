/**
 * 
 */
package com.javaaid.solutions.medium.twopointers;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kanahaiya Gupta
 *
 */
public class PermutationInString {
	

	public static boolean checkInclusion(String s1, String s2) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (char ch : s1.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		int begin = 0, end = 0, len = s1.length();
		Integer count = 0;
		int counter = map.size();
		while (end < s2.length()) {
			char endChar = s2.charAt(end);
			count = map.get(endChar);
			if (count != null) {
				map.put(endChar, count - 1);
				if (map.get(endChar) == 0)
					counter--;
			}
			end++;
			while (counter == 0) {
				char startChar = s2.charAt(begin);
				count = map.get(startChar);
				if (count != null) {
					map.put(startChar, count + 1);
					if (map.get(startChar) > 0)
						counter++;
				}
				if (len == end - begin) {
					return true;
				}
				begin++;
			}

		}
		return false;

	}
}