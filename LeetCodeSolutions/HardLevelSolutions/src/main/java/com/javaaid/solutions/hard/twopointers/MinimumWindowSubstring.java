/**
 * 
 */
package com.javaaid.solutions.hard.twopointers;

import java.util.HashMap;

/**
 * @author Kanahaiya Gupta
 *
 */
public class MinimumWindowSubstring {

	public String minWindow(String s, String t) {
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

		for (char ch : t.toCharArray()) {
			hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
		}
		int counter = hmap.size();
		int begin = 0, end = 0, len = Integer.MAX_VALUE;
		String ans = "";
		while (end < s.length()) {
			char endChar = s.charAt(end);
			Integer count = hmap.get(endChar);
			if (count != null) {
				hmap.put(endChar, count - 1);
				if (hmap.get(endChar) == 0)
					counter--;
			}
			end++;

			while (counter == 0) {
				char c = s.charAt(begin);
				if (hmap.get(c) != null) {
					hmap.put(c, hmap.get(c) + 1);
					if (hmap.get(c) > 0)
						counter++;
				}
				if (end - begin < len) {
					len = end - begin;
					ans = s.substring(begin, begin + len);
				}
				begin++;
			}
		}
		return ans;
	}
}
