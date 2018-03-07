/**
 * 
 */
package com.javaaid.solutions.medium.bitmanipulations;

/**
 * @author Kanahaiya Gupta
 *
 */
public class CountingBits {
	public int[] countBits(int num) {
        int dp[]=new int[num+1];
        for(int i=0;i<=num;i++){
            dp[i]=dp[i>>1]+(i&1);
        }
        return dp;
    }
}
