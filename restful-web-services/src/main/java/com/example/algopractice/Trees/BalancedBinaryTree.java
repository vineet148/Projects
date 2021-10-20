package com.example.algopractice.Trees;

public class BalancedBinaryTree {

	public static void main(String args[]) {

		Tree tree1 = new Tree();
		TreeNode root = tree1.createTree();

		System.out.println(checkForBalanceTree(root));
	}

	private static boolean checkForBalanceTree(TreeNode root) {
		// TODO Auto-generated method stub

		int x = checkForHeight(root);
		if (x == -1) {
			return false;
		}
	  checkForBalanceTree(root.getRight());
		
		return true;

		
	}

	private static int checkForHeight(TreeNode root) {
		// TODO Auto-generated method stub

		if (root == null)
			return 0;

		int left = checkForHeight(root.getLeft());
		int right = checkForHeight(root.getRight());

		if(left==-1 || right==-1)
			return -1;
		
		if (Math.abs(left - right) > 1) {
			return -1;
		}

		return 1+Max(left, right);

	}

	private static int Max(int left, int right) {
		// TODO Auto-generated method stub

		if (left > right) {
			return left;
		} else {
			return right;
		}

	}
}
