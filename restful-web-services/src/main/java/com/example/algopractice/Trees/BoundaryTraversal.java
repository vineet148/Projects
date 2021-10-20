package com.example.algopractice.Trees;

import java.util.Stack;
import java.util.Vector;

public class BoundaryTraversal {

	public static void main(String args[]) {
		Tree tree1 = new Tree();
		TreeNode root = tree1.createTree();
		Boundarytrav(root);

	}

	private static void Boundarytrav(TreeNode root) {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new Stack<>();
		if (root == null)
			return;
		Vector<Integer> res = new Vector<>();
		res.add(root.getData());
		traverseLeft(root.getLeft(), res);
		findLeaves(root, res);
		traverseRight(root.getRight(), stack);

		while (!stack.isEmpty()) {
			res.add(stack.pop());
		}
		
		for(int elem:res)
		{
			System.out.print(elem);
		}
		
	}

	private static void traverseLeft(TreeNode left, Vector<Integer> res) {
		// TODO Auto-generated method stub

		if (left != null) {
			res.add(left.getData());
		}
		if (left.getLeft() != null) {
			traverseLeft(left.getLeft(), res);
		} else if (left.getLeft() == null && left.getRight() != null) {
			traverseLeft(left.getRight(), res);
		} else {
			return;
		}

	}

	private static void findLeaves(TreeNode root, Vector<Integer> res) {
		// TODO Auto-generated method stub

		if (root == null) {
			return;
		}

		if (root.getLeft() == null && root.getRight() == null) {
			res.add(root.getData());
		}

		findLeaves(root.getLeft(), res);
		findLeaves(root.getRight(), res);

	}

	private static void traverseRight(TreeNode right, Vector<Integer> res) {
		// TODO Auto-generated method stub

		if (right != null) {
			res.add(right.getData());
		}
		if (right.getRight() != null) {
			traverseRight(right.getRight(), res);
		} else if (right.getRight() == null && right.getLeft() != null) {
			traverseRight(right.getLeft(), res);
		} else {
			return;
		}

	}
}
