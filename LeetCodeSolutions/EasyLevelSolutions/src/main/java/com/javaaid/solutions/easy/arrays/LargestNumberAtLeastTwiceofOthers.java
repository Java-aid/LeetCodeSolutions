/**
 * 
 */
package com.javaaid.solutions.easy.arrays;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class LargestNumberAtLeastTwiceofOthers {
	public int dominantIndex(int[] nums) {
		int len = nums.length;
		if (len == 1)
			return 0;
		int largest = nums[0];
		int secondLargest = Integer.MIN_VALUE;
		int index = 0;
		for (int i = 1; i < len; i++) {
			if (nums[i] >= largest) {
				secondLargest = largest;
				largest = nums[i];
				index = i;
			} else if (nums[i] > secondLargest) {
				secondLargest = nums[i];
			}

		}
		return (2 * secondLargest <= largest ? index : -1);

	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		LargestNumberAtLeastTwiceofOthers largestNum = new LargestNumberAtLeastTwiceofOthers();
		int result = largestNum.dominantIndex(a);
		System.out.println(result);
		sc.close();
	}

}
