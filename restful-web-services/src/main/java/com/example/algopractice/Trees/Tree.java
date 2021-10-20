package com.example.algopractice.Trees;

public class Tree {

	public TreeNode createTree() {
		TreeNode root = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(11);
		TreeNode t6 = new TreeNode(6);
		TreeNode t7 = new TreeNode(7);
		TreeNode t8 = new TreeNode(8);
		TreeNode t9 = new TreeNode(9);
		root.setLeft(t2);
		root.setRight(t3);
		t2.setLeft(t4);
		t2.setRight(t5);
		t3.setLeft(t6);
		t3.setRight(t7);
		t4.setLeft(t8);
		t8.setLeft(t9);
		return root;
	}

	public TreeNode createTree2() {
		TreeNode root = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(-5);
		TreeNode t6 = new TreeNode(6);
		TreeNode t7 = new TreeNode(1);
		TreeNode t8 = new TreeNode(8);
		TreeNode t9 = new TreeNode(9);
		root.setLeft(t2);
		root.setRight(t3);
		t2.setLeft(t4);
		t2.setRight(t5);
		t3.setLeft(t6);
		t3.setRight(t7);
		t4.setLeft(t8);
		// t8.setLeft(t9);
		return root;
	}

	public TreeNode createTree3() {
		TreeNode root = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(2);
		TreeNode t4 = new TreeNode(3);
		TreeNode t5 = new TreeNode(4);
		TreeNode t6 = new TreeNode(4);
		TreeNode t7 = new TreeNode(3);
		root.setLeft(t2);
		root.setRight(t3);
		t2.setLeft(t4);
		t2.setRight(t5);
		t3.setLeft(t6);
		t3.setRight(t7);
		// t8.setLeft(t9);
		return root;
	}

}
