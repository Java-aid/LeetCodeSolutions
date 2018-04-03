/**
 * 
 */
package com.javaaid.solutions.medium.trees;

/**
 * @author Kanahaiya Gupta
 *
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	class Level {
		int index = 0;
	}

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		Level lvl = new Level();
		TreeNode root = buildTreeUtil(preorder, inorder, 0, preorder.length - 1, lvl);
		return root;
	}

/**
 * 
 * @param preorder
 * @param inorder
 * @param start
 * @param end
 * @param lvl
 * @return
 */
	private TreeNode buildTreeUtil(int[] preorder, int[] inorder, int start, int end, Level lvl) {
		if (start <= end) {
			TreeNode midNode = new TreeNode(preorder[lvl.index++]);
			if (start == end)
				return midNode;
			int inIndex = searchKey(inorder, start, end, midNode.val);
			midNode.left = buildTreeUtil(preorder, inorder, start, inIndex - 1, lvl);
			midNode.right = buildTreeUtil(preorder, inorder, inIndex + 1, end, lvl);
			return midNode;
		}
		return null;
	}

/**
 * 
 * @param inorder
 * @param start
 * @param end
 * @param val
 * @return
 */
	private int searchKey(int[] inorder, int start, int end, int val) {
		for (int i = start; i <= end; i++) {
			if (inorder[i] == val)
				return i;
		}
		return -1;
	}
}
