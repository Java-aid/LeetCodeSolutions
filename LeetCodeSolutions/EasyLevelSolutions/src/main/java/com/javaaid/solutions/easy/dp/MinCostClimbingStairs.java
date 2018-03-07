/**
 * 
 */
package com.javaaid.solutions.easy.dp;

/**
 * @author Kanahaiya Gupta
 *
 */
public class MinCostClimbingStairs {
	public int minCostClimbingStairs(int[] cost) {
		int n = cost.length;
		int[] dp = new int[cost.length + 1];
		dp[0] = cost[0];
		dp[1] = cost[1];
		for (int i = 2; i < cost.length; i++) {
			dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
		}
		return Math.min(dp[n - 2], dp[n - 1]);
	}
}