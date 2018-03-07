/**
 * 
 */
package com.javaaid.solutions.easy.trees;

/**
 * @author Kanahaiya Gupta
 *
 */
public class ConvertSortedArrayToBinarySearchTree {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode sortedArrayToBST(int[] nums) {
		TreeNode root = null;
		root = sortedArrayToBSTUtil(nums, 0, nums.length - 1);
		return root;
	}

	/**
	 * 
	 * @param nums
	 * @param start
	 * @param end
	 * @return
	 */
	private TreeNode sortedArrayToBSTUtil(int[] nums, int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = (start + end) / 2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = sortedArrayToBSTUtil(nums, start, mid - 1);
		node.right = sortedArrayToBSTUtil(nums, mid + 1, end);
		return node;
	}
}
