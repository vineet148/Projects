package com.example.algopractice.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraphBfs {

	static Queue<Integer> queue = new LinkedList<Integer>();

	public static void main(String args[]) {
		int v = 5;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
		GraphRepAdjMatrix.makeGraph(adj, v);
		GraphRepAdjMatrix.addEdge(adj, 0, 1);
		GraphRepAdjMatrix.addEdge(adj, 1, 2);
		GraphRepAdjMatrix.addEdge(adj, 1, 3);
		GraphRepAdjMatrix.addEdge(adj, 2, 3);
		GraphRepAdjMatrix.addEdge(adj, 3, 4);
		GraphRepAdjMatrix.addEdge(adj, 2, 4);

		if (checkForBipartite(adj, v)) {
			System.out.println("bipartite");
		} else {
			System.out.println("not bipartite");
		}
	}

	private static boolean checkForBipartite(ArrayList<ArrayList<Integer>> adj, int v) {
		// TODO Auto-generated method stub

		Integer[] visited = new Integer[v];
		for (int l = 0; l < v; l++) {
			visited[l] = -1;

		}
		int s = 0;
		return bipartite(adj, visited,s);

		
	}

	private static boolean bipartite(ArrayList<ArrayList<Integer>> adj, Integer[] visited,int s) {
		// TODO Auto-generated method stub
		visited[s] = 1;
		queue.add(s);
		while (queue.size() > 0) {
			int item = queue.poll();
			ArrayList<Integer> arr = adj.get(item);
			for (int e : arr) {
				if (visited[e] == -1) {
					visited[e] = 1 - visited[item];
					queue.add(e);
				} else if (visited[e] == visited[item]) {
					return false;
				}

			}

		}
		return true;
	}
}
