/**
 * 
 */
package com.javaaid.solutions.easy.dp;

/**
 * @author Kanahaiya Gupta
 *
 */
public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
		int max_so_far = 0, curr_max = 0;
		for (int i = 1; i < prices.length; i++) {
			curr_max += prices[i] - prices[i - 1];
			curr_max = Math.max(curr_max, 0);
			max_so_far = Math.max(max_so_far, curr_max);
		}
		return max_so_far;
	}
}
