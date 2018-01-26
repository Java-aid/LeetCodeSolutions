/**
 * 
 */
package com.javaaid.solutions.easy.twopointers;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		sc.close();
		RemoveDuplicatesFromSortedArray rm=new RemoveDuplicatesFromSortedArray();
		int result=rm.removeDuplicates(nums);
		System.out.println(result);
		System.out.println(Arrays.toString(nums));

	}

	/**
	 * @param nums
	 * @return
	 */
	public int removeDuplicates(int[] nums) {
		if(nums==null||nums.length<=1)return nums.length;
		int prev=nums[0],curr=0;
		int distinctCount=1;
		int len=nums.length;
		for(int i=1;i<len;i++) {
			prev=nums[i-1];
			curr=nums[i];
			if(curr==prev) {
				
			}else{
				nums[distinctCount]=curr;
				distinctCount++;
			}
		}
		return distinctCount;
	}

}
