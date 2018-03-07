/**
 * 
 */
package com.javaaid.solutions.medium.trees;

/**
 * @author Kanahaiya Gupta
 *
 */
public class FindBottomLeftTreeValue {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	static class Level {
		int bottomLeftLeaf = 0;
	}

	public int findBottomLeftValue(TreeNode root) {
		Level level = new Level();
		int result = findBottomLeftValueUtil(root, 1, level, -1);
		return result;
	}

	private int findBottomLeftValueUtil(TreeNode root, int currentLevel, Level level, int res) {
		if (root == null)	return res;
		if (currentLevel > level.bottomLeftLeaf) {
			level.bottomLeftLeaf = currentLevel;
			res = root.val;
		}
		findBottomLeftValueUtil(root.left, currentLevel + 1, level, res);
		findBottomLeftValueUtil(root.right, currentLevel + 1, level, res);
		return res;
	}
}