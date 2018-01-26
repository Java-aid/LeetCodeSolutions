/**
 * 
 */
package com.javaaid.solutions.easy.maths;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kanahaiya Gupta
 *
 */
public class SelfDividingNumbers {
	 public List<Integer> selfDividingNumbers(int left, int right) {
		 List<Integer> list=new ArrayList<Integer>();
		 for(int i=left;i<=right;i++) {
			 if(isSelfDivisible(i,i+"")) {
				 list.add(i);
			 }
		 }
		 
		return list;
	        
	    }

	/**
	 * @param i
	 * @return
	 */
	private boolean isSelfDivisible(int n,String  num) {
		if(num.indexOf('0')!=-1)return false;
		for(int i=0;i<num.length();i++) {
			char ch=num.charAt(i);
			int digit=ch-'0';
			if(n%digit!=0) {
				return false;
			}
		}
		return true;
	}
	}
