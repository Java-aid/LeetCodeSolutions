/**
 * 
 */
package com.javaaid.solutions.easy.bitmanipulations;

/**
 * @author Kanahaiya Gupta
 *
 */
public class PowerOfTwo {
	public boolean isPowerOfTwo(int n) {
        return (n>0 && (n&(n-1))==0);
    }
}
