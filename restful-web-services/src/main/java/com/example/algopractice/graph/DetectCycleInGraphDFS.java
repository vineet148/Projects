package com.example.algopractice.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import com.example.algopractice.graph.GraphRepAdjMatrix;

class node {
	int current;
	int parent;

	public node(int current, int parent) {
		super();
		this.current = current;
		this.parent = parent;
	}

}

public class DetectCycleInGraphDFS {
	static Queue<Node> queue = new LinkedList<Node>();

	public static void main(String args[]) {
		int v = 5;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v + 1);
		GraphRepAdjMatrix.makeGraph(adj, v);
		GraphRepAdjMatrix.addEdge(adj, 1, 2);
		GraphRepAdjMatrix.addEdge(adj, 2, 3);
		GraphRepAdjMatrix.addEdge(adj, 2, 4);
		GraphRepAdjMatrix.addEdge(adj, 3, 4);
		GraphRepAdjMatrix.addEdge(adj, 4, 5);
		if(findCycleBFS(adj, v))
		{
			System.out.println("cycle exist");
		}else
		{
			System.out.println("cycle does not exist");
		}
		
	}

	private static boolean findCycleBFS(ArrayList<ArrayList<Integer>> adj, int v) {
		// TODO Auto-generated method stub
		Integer[] visited = new Integer[v + 1];
		ArrayList<Integer> BfsResult = new ArrayList<>();
		for (int i = 1; i < v + 1; i++) {

			for (int l = 0; l < v + 1; l++) {
				visited[l] = 0;

			}
			if (visited[i] == 0) {
				visited[i] = 1;
				queue.add(new Node(i, -1));
				if (CheckForCyclebfs(adj, visited)) {
					return true;
				}
			}
		}
		return false;
	}

	static boolean CheckForCyclebfs(ArrayList<ArrayList<Integer>> adj, Integer[] visited) {
		// TODO Auto-generated method stub
		Node node = null;
		while (queue.size() > 0) {
			node = queue.poll();

			ArrayList<Integer> arr = adj.get(node.current);

			for (int j : arr) {
				if (visited[j] == 0) {
					visited[j] = 1;
					queue.add(new Node(j, node.current));
				} else if (j != node.parent) {
					return true;
				}
			}

		}
		return false;
	}
}
