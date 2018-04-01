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
public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		int result = lengthOfLongestSubstring("abcabcbb");
		System.out.println(result);
	}

	public static int lengthOfLongestSubstring(String s) {
		if(s==null||s==""||s.isEmpty())return 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int begin = 0, end = 0, len = Integer.MIN_VALUE;
		Integer index = 0;
		while (end < s.length()) {
			char endChar = s.charAt(end);
			index = map.get(endChar);
			if (index != null && index >= begin) {
				begin++;

			} else {
				map.put(endChar, end);
				end++;

			}
			
			if (end - begin > len) {
				len = end - begin;
			}
		}
		return len==Integer.MIN_VALUE?0:len;
	}

}