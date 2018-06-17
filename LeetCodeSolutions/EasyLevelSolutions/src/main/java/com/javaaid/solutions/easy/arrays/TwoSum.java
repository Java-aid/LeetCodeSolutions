package com.javaaid.solutions.easy.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Kanahaiya Gupta
 *
 */
public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int res[] = new int[2];

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				res[0] = map.get(target - nums[i]);
				res[1] = i;
			} else {
				map.put(nums[i], i);
			}
		}

		return res;

	}

}
