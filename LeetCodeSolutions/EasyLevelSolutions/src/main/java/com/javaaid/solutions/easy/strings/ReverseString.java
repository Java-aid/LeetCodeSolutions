/**
 * 
 */
package com.javaaid.solutions.easy.strings;

/**
 * @author Kanahaiya Gupta
 *
 */
public class ReverseString {
	public String reverseString(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}