/**
 * 
 */
package com.javaaid.solutions.easy.arrays;

/**
 * @author Kanahaiya Gupta
 *
 */
public class JudgeRouteCircle {
	public boolean judgeCircle(String moves) {
		int n = moves.length();
		int x = 0, y = 0;
		for (int k = 0; k < n; k++) {
			char ch = moves.charAt(k);
			if (ch == 'L') {
				x--;
			} else if (ch == 'R') {
				x++;
			} else if (ch == 'U') {
				y++;
			} else if (ch == 'D') {
				y--;
			}

		}
		return x == 0 && y == 0;

	}
}
