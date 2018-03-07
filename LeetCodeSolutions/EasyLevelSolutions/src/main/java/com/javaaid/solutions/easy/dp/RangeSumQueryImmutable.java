/**
 * 
 */
package com.javaaid.solutions.easy.dp;

/**
 * @author Kanahaiya Gupta
 *
 */
public class RangeSumQueryImmutable {

	int[] nums;

	public RangeSumQueryImmutable(int[] nums) {
		this.nums = nums;
		for (int k = 1; k < nums.length; k++) {
			nums[k] += nums[k - 1];
		}

	}

	public int sumRange(int i, int j) {

		if (i > 0)
			return (nums[j] - nums[i - 1]);
		return (nums[j]);
	}
}