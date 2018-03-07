/**
 * 
 */
package com.javaaid.solutions.medium.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Kanahaiya Gupta
 *
 */
public class BinaryTreeZigzagLevelOrderTraversal {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	
	 public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	        Stack<TreeNode>s1=new Stack<TreeNode>();
	        List<List<Integer>> lists=new ArrayList<List<Integer>>();
	        boolean leftToRight=true;
	        if(root==null) return lists;
	        s1.push(root);
	        while(!s1.isEmpty()) {
	        	int size=s1.size();
	        	Stack<TreeNode> s2=new Stack<TreeNode>();
	        	List<Integer> row=new ArrayList<Integer>();
	        	while(size-->0) {
	        		TreeNode node=s1.pop();
	        		row.add(node.val);
	        		if(leftToRight) {
	        			if(node.left!=null)s2.push(node.left);
	        			if(node.right!=null)s2.push(node.right);
	        		}else {
	        			if(node.right!=null)s2.push(node.right);
	        			if(node.left!=null)s2.push(node.left);
	        		}
	        	}
	        	leftToRight=!leftToRight;
	        	s1=s2;
	        	lists.add(row);
	        }
	        return lists;
	        
	    }
}
