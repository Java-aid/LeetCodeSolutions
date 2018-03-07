/**
 * 
 */
package com.javaaid.solutions.medium.trees;

/**
 * @author Kanahaiya Gupta
 *
 */
public class ValidateBinarySearchTree {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isValidBST(TreeNode root) {
		return validateBSTUtil(root, null);
	}

	private boolean validateBSTUtil(TreeNode root, Integer prevValue) {
		if (root == null)
			return true;
		if (!validateBSTUtil(root.left, prevValue))
			return false;
		if (prevValue != null && prevValue >= root.val)
			return false;
		prevValue = root.val;
		if (!validateBSTUtil(root.right, prevValue))
			return false;
		return true;
	}
}