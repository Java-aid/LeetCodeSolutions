/**
 * 
 */
package com.javaaid.solutions.easy.arrays;

/**
 * @author Kanahaiya Gupta
 *
 */
public class FindAnagramMappings {
	public int[] anagramMappings(int[] A, int[] B) {
		int len = A.length;
		int a[] = new int[len];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (A[i] == B[j]) {
					a[i] = j;
				}
			}
		}
		return a;
	}

}
