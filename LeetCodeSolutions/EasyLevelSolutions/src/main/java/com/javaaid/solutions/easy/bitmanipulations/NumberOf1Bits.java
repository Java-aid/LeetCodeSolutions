/**
 * 
 */
package com.javaaid.solutions.easy.bitmanipulations;

/**
 * @author Kanahaiya Gupta
 *
 */
public class NumberOf1Bits {
	 public int hammingWeight(int n) {
	        int noOfOnes=0;
	        while(n!=0){
	            n=n&(n-1);
	            noOfOnes++;
	        }
	        return noOfOnes;
	    }
}
