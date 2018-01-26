/**
 * 
 */
package com.javaaid.solutions.easy.bitmanipulations;

/**
 * @author Kanahaiya Gupta
 *
 */
public class HammingDistance {
	public int hammingDistance(int x, int y) {
		int xor = x ^ y;
		return countNoOf1s(xor);

	}

	private int countNoOf1s(int n) {
		int count = 0;
		while (n != 0) {
			n = n & (n - 1);
			count++;
		}

		return count;
	}
}