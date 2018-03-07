/**
 * 
 */
package com.javaaid.solutions.medium.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kanahaiya Gupta
 *
 */
public class BinaryTreeInorderTraversal {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		inorderTraversalUtil(root, list);
		return list;
	}

	public void inorderTraversalUtil(TreeNode root, List<Integer> list) {
		if (root != null) {
			inorderTraversalUtil(root.left, list);
			list.add(root.val);
			inorderTraversalUtil(root.right, list);
		}
	}
}