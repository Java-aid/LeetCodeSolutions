/**
 * 
 */
package com.javaaid.solutions.easy.dp;

/**
 * @author Kanahaiya Gupta
 *
 */
public class MaximumProductSubarray {
	public int maxProduct(int[] nums) {
		int max_so_far = 1, max_ending_here = 1;
		for (int i = 0; i < nums.length; i++) {
			max_ending_here *= nums[i];
			max_ending_here = Math.max(max_ending_here, nums[i]);
			max_so_far = Math.max(max_so_far, max_ending_here);
		}
		return max_so_far;
	}
}
