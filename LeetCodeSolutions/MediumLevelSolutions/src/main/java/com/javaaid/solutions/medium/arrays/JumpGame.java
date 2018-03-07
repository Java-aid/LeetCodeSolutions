/**
 * 
 */
package com.javaaid.solutions.medium.arrays;

/**
 * @author Kanahaiya Gupta
 *
 */
public class JumpGame {
	 public boolean canJump(int[] nums) {
		 int laspos=nums.length-1;
	        for(int i=nums.length-1;i>=0;i--) {
	        	if(i+nums[i]>=laspos) {
	        		laspos=i;
	        	}
	        }
	        return laspos==0;
	    }
}
