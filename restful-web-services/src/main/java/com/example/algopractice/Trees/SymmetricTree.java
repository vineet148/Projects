package com.example.algopractice.Trees;

public class SymmetricTree {

	static int flag = 1;

	public static void main(String args[]) {
		Tree tree1 = new Tree();
		TreeNode root = tree1.createTree3();
		System.out.println(checkForSymmetry(root.getLeft(), root.getRight()));
		System.out.println(checkForSymmetry2(root.getLeft(), root.getRight()));

	}

	private static boolean checkForSymmetry(TreeNode left, TreeNode right) {
		// TODO Auto-generated method stub

		if (left == null && right != null) {
			flag=0;
			return false;
		} else if (left != null && right == null) {
			flag=0;
			return false;
		} else if (left == null && right == null) {
			return true;
		}

		
		
		if (left != null && right != null && left.getData() == right.getData()) {
			System.out.println(left.getData()+" "+ right.getData());
			checkForSymmetry(left.getLeft(), right.getRight());
			checkForSymmetry(left.getRight(), right.getLeft());
		} else if (left != null && right != null && left.getData() != right.getData()) {
			flag = 0;
		}

		if (flag == 0)
			return false;

		return true;

	}

	

	private static boolean checkForSymmetry2(TreeNode left, TreeNode right) {
		// TODO Auto-generated method stub

		if (left == null || right == null) {
			return left==right;
		}

		if (left.getData() != right.getData())		
		{
			return false;
		}
			return checkForSymmetry(left.getLeft(), right.getRight())
			&& checkForSymmetry(left.getRight(), right.getLeft());
		
	}

}
