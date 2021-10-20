package com.example.algopractice.Trees;

public class HeightOfTree {

	public static void main(String args[]) {
		Tree tree1 = new Tree();
		TreeNode root = tree1.createTree();
		System.out.println(findHeightofTree(root));

	}

	public static int findHeightofTree(TreeNode root) {
		// TODO Auto-generated method stub

		if (root == null) {
			return 0;
		}

		int left =  findHeightofTree(root.getLeft());
		int right =  findHeightofTree(root.getRight());

		if(left >= right)
		{
			return left+1;
		}else {
			return right+1;
		}
		
//		return 1+max(left, right);

		}

	public static int max(int left, int right) {
		// TODO Auto-generated method stub
		if (left > right) {
			return left;
		} else {
			return right;
		}
	}

}
