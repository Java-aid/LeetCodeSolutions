package com.javaaid.solutions.easy.trees;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Kanahaiya Gupta
 *
 */
public class TwoSumIV {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean findTarget(TreeNode root, int k) {

		Set<Integer> set = new HashSet<Integer>();
		return findTargetUtil(root, k, set);
	}

	private boolean findTargetUtil(TreeNode root, int k, Set<Integer> set) {
		if (root == null)
			return false;
		int val = root.val;
		if (set.contains(k - val)) {
			return true;
		} else {
			set.add(val);
		}
		return findTargetUtil(root.left, k, set) || findTargetUtil(root.right, k, set);
	}
}
