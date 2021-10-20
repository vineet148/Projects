package com.example.algopractice.Trees;

public class DiameterOfTree {

	static int max1 = 0;

	public static void main(String args[]) {
		Tree tree1 = new Tree();
		int max[] = new int[1];
		TreeNode root = tree1.createTree();
		int diameter = findDiameter(root);
		int height = findDiameterOptimized(root, max);

		System.out.println("Diameter of the tree o(n^2)" + diameter);
		System.out.println("Diameter of the tree optimized in o(n)" + max[0]);

		/*
		 * int[] diameter = new int[1]; height(root, diameter); System.out.println(
		 * diameter[0]);
		 */
	}

	private static int findDiameterOptimized(TreeNode root, int[] max) {
		// TODO Auto-generated method stub

		if (root == null) {
			return 0;
		}

		int left = findDiameterOptimized(root.getLeft(), max);
		int right = findDiameterOptimized(root.getRight(), max);

		max[0] = Math.max(max[0], left + right);
		return 1 + Math.max(left, right);

	}

	private static int findDiameter(TreeNode root) {
		// TODO Auto-generated method stub

		if (root == null) {
			return 0;
		}

		int left = HeightOfTree.findHeightofTree(root.getLeft());
		int right = HeightOfTree.findHeightofTree(root.getRight());

		if (left + right >= max1) {
			max1 = left + right;
		}
		findDiameter(root.getLeft());
		findDiameter(root.getRight());

		return max1;

	}
}