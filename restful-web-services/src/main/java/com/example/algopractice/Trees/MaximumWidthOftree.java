package com.example.algopractice.Trees;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode3 {

	int index;
	int data;
	TreeNode3 left;
	TreeNode3 right;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public TreeNode3(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode3 getLeft() {
		return left;
	}

	public void setLeft(TreeNode3 left) {
		this.left = left;
	}

	public TreeNode3 getRight() {
		return right;
	}

	public void setRight(TreeNode3 right) {
		this.right = right;
	}
}

class Tree3 {

	public TreeNode3 createTree() {
		TreeNode3 root = new TreeNode3(1);
		TreeNode3 t2 = new TreeNode3(2);
		TreeNode3 t3 = new TreeNode3(3);
		TreeNode3 t4 = new TreeNode3(4);
		TreeNode3 t5 = new TreeNode3(11);
		TreeNode3 t6 = new TreeNode3(6);
		TreeNode3 t7 = new TreeNode3(7);
		TreeNode3 t8 = new TreeNode3(8);
		TreeNode3 t9 = new TreeNode3(9);
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

	public static int findHeightofTree(TreeNode3 root) {
		// TODO Auto-generated method stub

		if (root == null) {
			return 0;
		}

		int left = findHeightofTree(root.getLeft());
		int right = findHeightofTree(root.getRight());

		if (left >= right) {
			return left + 1;
		} else {
			return right + 1;
		}

		// return 1+max(left, right);

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

public class MaximumWidthOftree {

	public static void main(String args[]) {

		Tree3 tree1 = new Tree3();
		TreeNode3 root = tree1.createTree();
		int h = tree1.findHeightofTree(root);
		System.out.println("height" + h);
		root.setIndex(1);
		Queue<TreeNode3> queue = new LinkedList<TreeNode3>();
		queue.add(root);
		findMaximumWidth(root, queue, h);

	}

	private static void findMaximumWidth(TreeNode3 root, Queue<TreeNode3> queue, int height) {
		// TODO Auto-generated method stub
		int count = 0;
		int max = 0;
		int min = 0;
		int max_diff = 0;
		int diff = 0;
		while (!queue.isEmpty()) {
			for (int i = 0; i < queue.size(); i++) {
				TreeNode3 node = queue.poll();

				if (i == 0) {
					min = node.getIndex();
				}

				if (i == queue.size() - 1) {
					max = node.getIndex();
					diff = max - min;
				}
				if (diff >= max_diff) {
					max_diff = diff;
				}
				System.out.println(node.getData());
				if (node.getLeft() != null) {
					TreeNode3 temp = node.getLeft();
					temp.setIndex(2 * (node.getIndex()));
					queue.add(temp);
				} else {
					TreeNode3 newNode = new TreeNode3(9999);
					newNode.setLeft(null);
					newNode.setRight(null);
					// node.setLeft(newNode);
					newNode.setIndex(2 * (node.getIndex()));
					queue.add(newNode);
				}
				if (node.getRight() != null) {
					TreeNode3 temp = node.getRight();
					temp.setIndex(2 * (node.getIndex()) + 1);
					queue.add(temp);
				} else {
					TreeNode3 newNode = new TreeNode3(9999);
					newNode.setLeft(null);
					newNode.setRight(null);
					//l node.setRight(newNode);
					newNode.setIndex(2 * (node.getIndex()) + 1);
					queue.add(newNode);
				}

			}

		}
		System.out.println(max_diff);

		LevelOrderTraversal.printLevelOrder(root);

	}

}
