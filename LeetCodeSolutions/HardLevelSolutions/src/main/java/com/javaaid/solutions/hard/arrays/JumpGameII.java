/**
 * 
 */
package com.javaaid.solutions.hard.arrays;

/**
 * @author Kanahaiya Gupta
 *
 */
public class JumpGameII {
	public int jump(int[] nums) {
		int jumps = 0, ending_pos = 0, curr_pos = 0;
		for (int i = 0; i < nums.length-1; i++) {
			curr_pos = Math.max(curr_pos, i + nums[i]);
			if (i == ending_pos) {
				jumps++;
				ending_pos = curr_pos;
			}
		}
		return jumps;
	}
}
