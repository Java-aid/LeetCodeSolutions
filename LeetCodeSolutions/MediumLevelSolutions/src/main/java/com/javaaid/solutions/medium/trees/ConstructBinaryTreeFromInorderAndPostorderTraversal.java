/**
 * 
 */
package com.javaaid.solutions.medium.trees;

/**
 * @author Kanahaiya Gupta
 *
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
	
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	class Level{
		int index=0;
	}

	 public TreeNode buildTree(int[] inorder, int[] postorder) {
	        Level lvl=new Level();
	        lvl.index=postorder.length-1;
	        TreeNode root=buildTreeUtil(inorder,postorder,0,postorder.length-1,lvl);
	        return root;
	    }
	 
/**
 * 
 * @param inorder
 * @param postorder
 * @param start
 * @param end
 * @param lvl
 * @return
 */
	private TreeNode buildTreeUtil(int[] inorder, int[] postorder, int start, int end, Level lvl) {
		if(start<=end) {
			TreeNode midNode=new TreeNode(postorder[lvl.index--]);
			if(start==end)return midNode;
			int inIndex=searchKey(inorder, start, end, midNode.val);
			midNode.right=buildTreeUtil(inorder,postorder,inIndex+1,end,lvl);
			midNode.left=buildTreeUtil(inorder,postorder,start,inIndex-1,lvl);
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