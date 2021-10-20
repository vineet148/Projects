package com.example.algopractice.Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class VerticalOrderTrav {

	public static void main(String args[]) {

		Tree tree1 = new Tree();
		TreeNode root = tree1.createTree();
		HashMap<Integer, List<TreeNode>> map = new HashMap<>();
		int count = 0;
		List<TreeNode> list = new ArrayList<TreeNode>();
		verticalOrder(root, count, map);
		Map<Integer, List<TreeNode>> tmap = new TreeMap<>(map);
		for (Entry<Integer, List<TreeNode>> set : tmap.entrySet()) {
			System.out.println("At level  "+set.getKey());

			for(TreeNode node: set.getValue())
			{
				
				System.out.print(node.getData()+" ");
			}
			System.out.println();
		}
	}

	private static void verticalOrder(TreeNode root, int count, HashMap<Integer, List<TreeNode>> map) {
		// TODO Auto-generated method stub

		if (root == null) {
			return;
		}

		if (map.get(count) != null) {
			List<TreeNode> li = map.get(count);
			li.add(root);
			map.put(count, li);
		} else if (map.get(count) == null) {
			List<TreeNode> li = new ArrayList<>();
			li.add(root);
			map.put(count, li);
		}

		verticalOrder(root.getLeft(), count - 1, map);
		verticalOrder(root.getRight(), count + 1, map);
	}

}
