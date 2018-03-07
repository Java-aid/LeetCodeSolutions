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
public class BinaryTreeRightSideView {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		rightSideViewUtil(list, root, 1);
		return list;
	}

	private void rightSideViewUtil(List<Integer> list, TreeNode root, int currLevel) {
		if(root==null)return;
		if (currLevel >list.size()) {
			list.add(root.val);
		}
		rightSideViewUtil(list, root.right, currLevel + 1);
		rightSideViewUtil(list, root.left, currLevel + 1);

	}
}
