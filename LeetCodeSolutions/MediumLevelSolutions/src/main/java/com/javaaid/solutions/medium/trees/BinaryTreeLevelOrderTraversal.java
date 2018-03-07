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
public class BinaryTreeLevelOrderTraversal {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	/*public List<List<Integer>> levelOrder(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		List<List<Integer>> row = new ArrayList<List<Integer>>();
		if (root == null)
			return row;
		q.add(root);

		while (!q.isEmpty()) {
			int size = q.size();
			List<Integer> col = new ArrayList<Integer>();
			while (size-- > 0) {
				TreeNode node = q.poll();
				col.add(node.val);
				if (node.left != null)
					q.add(node.left);
				if (node.right != null)
					q.add(node.right);
			}
			row.add(col);
		}
		return row;
	}*/
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> row = new ArrayList<List<Integer>>();
		levelOrderUtil(root,row,1);
		return row;
	}

	/**
	 * @param root
	 * @param row
	 * @param i
	 */
	private void levelOrderUtil(TreeNode root, List<List<Integer>> row, int lvl) {
		if(root==null)return;
		if(lvl>row.size()) {
			row.add(new ArrayList<Integer>());
		}
		row.get(lvl).add(root.val);
		levelOrderUtil(root.left,row,lvl+1);
		levelOrderUtil(root.right,row,lvl+1);
	}
}
