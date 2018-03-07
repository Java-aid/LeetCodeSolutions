/**
 * 
 */
package com.javaaid.solutions.easy.dp;

/**
 * @author Kanahaiya Gupta
 *
 */
public class HouseRobber {
	public int rob(int[] nums) {
		int n = nums.length;
		if (n == 0)
			return 0;
		if (n == 1)
			return nums[0];

		int dp[] = new int[n + 1];
		dp[0] = nums[0];
		dp[1] = Math.max(dp[1], dp[0]);
		int max = dp[1];
		for (int i = 2; i < n; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
			max = Math.max(max, dp[i]);
		}
		return max;
	}
}
