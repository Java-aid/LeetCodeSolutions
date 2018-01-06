/**
 * 
 */
package com.javaaid.solutions.easy.trees;

import java.util.LinkedList;

/**
 * @author Kanahaiya Gupta
 *
 */
public class InvertBinaryTree {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode invertTree(TreeNode root) {
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		if (root != null)
			queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode tmp = queue.poll();
			if (tmp.left != null)
				queue.add(tmp.left);
			if (tmp.right != null)
				queue.add(tmp.right);
			TreeNode leftNode = tmp.left;
			tmp.left = tmp.right;
			tmp.right = leftNode;
		}
		return root;
	}
}
