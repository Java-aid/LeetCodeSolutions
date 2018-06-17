package com.javaaid.solutions.easy.twopointers;

/**
 * 
 * @author Kanahaiya Gupta
 *
 */
public class TwoSumII {
	public int[] twoSum(int[] numbers, int target) {
		int start = 0;
		int end = numbers.length - 1;
		int sum = 0;

		while (start < end) {
			sum = numbers[start] + numbers[end];
			if (sum == target) {
				return new int[] { start + 1, end + 1 };
			} else if (sum < target) {
				start++;
			} else {
				end--;
			}

		}
		return new int[] {};
	}

}
