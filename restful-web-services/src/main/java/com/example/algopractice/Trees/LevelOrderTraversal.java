package com.example.algopractice.Trees;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class LevelOrderTraversal {

	public static void main(String args[]) {

		Tree tree1 = new Tree();
		TreeNode root = tree1.createTree();
		 printLevelOrder(root);
		System.out.println();
		
	}

	public static void printLevelOrder(TreeNode root) {
		// TODO Auto-generated method stub

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		Vector<Integer> v = new Vector<>();

		while (!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			v.add(temp.getData());
			if (temp.getLeft() != null) {
				queue.add(temp.getLeft());
			}
			if (temp.getRight() != null) {
				queue.add(temp.getRight());
			}
		}
		for (int e : v) {
			System.out.print(e + " ");

		}
	}

	public static void printLevelOrder(TreeNode3 root) {
		// TODO Auto-generated method stub

		Queue<TreeNode3> queue = new LinkedList<TreeNode3>();
		queue.add(root);
		Vector<TreeNode3> v = new Vector<>();

		while (!queue.isEmpty()) {
			TreeNode3 temp = queue.poll();
			v.add(temp);
			if (temp.getLeft() != null) {
				queue.add(temp.getLeft());
			}
			if (temp.getRight() != null) {
				queue.add(temp.getRight());
			}
		}
		for (TreeNode3 e : v) {
			System.out.println(e.getData() + " idex"+e.getIndex());

		}
	}

}