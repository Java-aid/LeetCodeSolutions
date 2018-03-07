/**
 * 
 */
package com.javaaid.solutions.medium.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Kanahaiya Gupta
 *
 */
public class FindLargestValueInEachTreeRow {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<Integer> largestValues(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		if (root == null)
			return list;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			int noOfNode = q.size();
			long maxValue = Long.MIN_VALUE;
			while (noOfNode-- > 0) {
				TreeNode node = q.poll();
				if (node.left != null) {
					q.add(node.left);
				}
				if (node.right != null) {
					q.add(node.right);
				}
				maxValue = Math.max(node.val, maxValue);
			}
			if (maxValue != Long.MIN_VALUE)
				list.add((int) maxValue);
		}
		return list;

	}
}
