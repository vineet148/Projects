package com.example.algopractice.Trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.Map.Entry;

class NodeLevel {

	TreeNode treeNode;
	int level;

	public NodeLevel(TreeNode treeNode, int level) {
		super();
		this.treeNode = treeNode;
		this.level = level;
	}

	public TreeNode getTreeNode() {
		return treeNode;
	}

	public void setTreeNode(TreeNode treeNode) {
		this.treeNode = treeNode;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}

public class TopViewOfBinryTree {

	public static void main(String args[]) {
		Tree tree1 = new Tree();
		TreeNode root = tree1.createTree();
		Queue<NodeLevel> queue = new LinkedList<NodeLevel>();
		queue.add(new NodeLevel(root, 0));
		TopView(root, queue);
		Queue<NodeLevel> queue2 = new LinkedList<NodeLevel>();
		queue2.add(new NodeLevel(root, 0));
		BottomView(root, queue2);
	}

	private static void BottomView(TreeNode root, Queue<NodeLevel> queue) {
		// TODO Auto-generated method stub
		Map<Integer, TreeNode> map = new TreeMap<Integer, TreeNode>();
		if (root == null)
			return;

		while (!queue.isEmpty()) {

			NodeLevel nodeLevel = queue.poll();
			TreeNode node = nodeLevel.getTreeNode();
			int level = nodeLevel.getLevel();
			map.put(level, node);
		
			if (node.getLeft() != null) {
				queue.add(new NodeLevel(node.getLeft(), level - 1));
			}
			if (node.getRight() != null) {
				queue.add(new NodeLevel(node.getRight(), level + 1));
			}
		}

		System.out.println("Bottom View of tree");
		for (Entry<Integer, TreeNode> set : map.entrySet()) {

			System.out.print(set.getValue().getData());
		}

	}

	private static void TopView(TreeNode root, Queue<NodeLevel> queue) {
		// TODO Auto-generated method stub

		Map<Integer, TreeNode> map = new TreeMap<Integer, TreeNode>();
		if (root == null)
			return;

		while (!queue.isEmpty()) {

			NodeLevel nodeLevel = queue.poll();
			TreeNode node = nodeLevel.getTreeNode();
			int level = nodeLevel.getLevel();
			if (map.get(level) == null) {
				map.put(level, node);
			}
			if (node.getLeft() != null) {
				queue.add(new NodeLevel(node.getLeft(), level - 1));
			}
			if (node.getRight() != null) {
				queue.add(new NodeLevel(node.getRight(), level + 1));
			}
		}

		System.out.println("Top View of tree");
		for (Entry<Integer, TreeNode> set : map.entrySet()) {

			System.out.print(set.getValue().getData());
		}

	}
}