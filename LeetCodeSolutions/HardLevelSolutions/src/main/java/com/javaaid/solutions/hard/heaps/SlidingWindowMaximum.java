/**
 * 
 */
package com.javaaid.solutions.hard.heaps;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @author Kanahaiya Gupta
 *
 */
public class SlidingWindowMaximum {

	public static int[] maxSlidingWindow(int[] nums, int k) {
		if (nums.length == 0 || nums == null || k == 0)
			return new int[0];

		int result[] = new int[nums.length - k + 1];
		Deque<Integer> window = new ArrayDeque<Integer>();
		int m = 0;
		for (int i = 0; i < nums.length; i++) {
			while (!window.isEmpty() && nums[window.peekLast()] < nums[i]) {
				window.pollLast();
			}
			while (!window.isEmpty() && window.peek() < i - k + 1) {
				window.poll();
			}
			window.offer(i);
			if (i >= k - 1) {
				result[m++] = nums[window.peek()];
			}
		}
		return result;
	}
}