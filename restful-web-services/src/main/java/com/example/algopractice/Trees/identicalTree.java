package com.example.algopractice.Trees;

public class identicalTree {

	public static void main(String args[]) {
		Tree tree1 = new Tree();
		Tree tree2 = new Tree();
		TreeNode root1 = tree1.createTree();
		TreeNode root2 = tree2.createTree2();
		System.out.println(identicalTree(root1, root2));
		System.out.println(identicalTreestriver(root1, root2));
	}

	private static boolean identicalTreestriver(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub

		if(root1==null || root2==null)
		{
			return (root1==root2);
			
		}
		
		return root1.getData() ==root2.getData() &&
				identicalTreestriver(root1.getLeft(), root2.getLeft()) &&
				identicalTreestriver(root1.getRight(), root2.getRight());
  		
	}

	
	private static int identicalTree(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub

		if (root1 == null && root2 == null) {
			return 1;
		} else if (root1 == null && root2 != null) {

			return 0;
		} else if (root1 != null && root2 == null) {
			return 0;

		}
		if (root1.getData() != root2.getData()) {
			return 0;

		}

		int left = identicalTree(root1.getLeft(), root2.getLeft());
		int right = identicalTree(root1.getRight(), root2.getRight());

		if (left == 0 || right == 0) {
			return 0;
		}

		return 1;

	}
}
