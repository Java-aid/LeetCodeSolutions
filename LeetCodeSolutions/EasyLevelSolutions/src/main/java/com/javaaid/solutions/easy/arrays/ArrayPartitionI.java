/**
 * 
 */
package com.javaaid.solutions.easy.arrays;

import java.util.Arrays;

/**
 * @author Kanahaiya Gupta
 *
 */
public class ArrayPartitionI {
	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int sum=0;
		for(int i=0;i<nums.length;i=i+2) {
			sum+=nums[i];
		}
		return sum;
	}
}
