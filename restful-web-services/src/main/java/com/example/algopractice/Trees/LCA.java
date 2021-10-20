package com.example.algopractice.Trees;

public class LCA {

	public static void main(String args[]) {
		Tree tree1 = new Tree();
		TreeNode root = tree1.createTree();
		TreeNode key1 = new TreeNode(2);
		TreeNode key2 = new TreeNode(5);

		TreeNode t=findLCA(root, key1, key2);

		if(t!=null)
		{
			System.out.println(t.getData());
		}
		else {
			System.out.println("not found");
		}
	}

	private static TreeNode findLCA(TreeNode root, TreeNode key1, TreeNode key2) {
		// TODO Auto-generated method stub

		if (root == null || root == key1 || root == key2) {
			return root;
		}

		TreeNode left = findLCA(root.getLeft(), key1, key2);
		TreeNode right = findLCA(root.getRight(), key1, key2);

		if (left == null ) {
			return right;
		} else if ( right == null) {
			return left;
		} else {
			return root;
		}
	}

}
