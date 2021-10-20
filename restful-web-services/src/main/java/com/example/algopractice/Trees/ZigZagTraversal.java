package com.example.algopractice.Trees;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class ZigZagTraversal {

	public static void main(String args[]) {
		Tree tree = new Tree();
		int max[] = new int[1];
		TreeNode root = tree.createTree();

		printZigZagTrav(root, 0);
	}

	public static void printZigZagTrav(TreeNode root, int count) {
		// TODO Auto-generated method stub

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		Vector<Vector<Integer>> res = new Vector<>();
		while (!queue.isEmpty()) {
			Vector<Integer> v = new Vector<>();
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode temp = queue.poll();
				if (temp.getLeft() != null) {
					queue.add(temp.getLeft());
				}
				if (temp.getRight() != null) {
					queue.add(temp.getRight());
				}
				v.add(temp.getData());

			}

			if (count == 0) {
				res.add(v);
			} else {
				Collections.reverse(v);
				res.add(v);
			}
			count = 1 - count;

		}

		for (int i = 0; i < res.size(); i++) {
			Vector<Integer> temp = res.get(i);
			for (Integer elem : temp) {
				System.out.print(elem);
			}
			System.out.println();

		}

	}
}
