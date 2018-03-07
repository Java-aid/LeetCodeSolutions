/**
 * 
 */
package com.javaaid.solutions.easy.trees;

/**
 * @author Kanahaiya Gupta
 *
 */
public class MaximumDepthOfBinaryTree {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		return (1 + Math.max(maxDepth(root.left), maxDepth(root.right)));
	}
}
