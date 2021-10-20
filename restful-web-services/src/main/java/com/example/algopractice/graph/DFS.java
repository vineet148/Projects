package com.example.algopractice.graph;

import java.util.ArrayList;

import com.example.algopractice.graph.GraphRepAdjMatrix;

public class DFS {

	public static void main(String args[]) {
		int v = 5;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v + 1);
		GraphRepAdjMatrix.makeGraph(adj, v);
		GraphRepAdjMatrix.addEdge(adj, 1, 2);
		GraphRepAdjMatrix.addEdge(adj, 2, 3);
		GraphRepAdjMatrix.addEdge(adj, 2, 4);
		GraphRepAdjMatrix.addEdge(adj, 3, 4);
		GraphRepAdjMatrix.addEdge(adj, 4, 5);
		// GraphRepAdjMatrix.printAdj(adj);
		findDFS(adj, v);
	}

	private static void findDFS(ArrayList<ArrayList<Integer>> adj, int v) {
		// TODO Auto-generated method stub
		Integer[] visited = new Integer[v + 1];
		ArrayList<Integer> DfsResult = new ArrayList<>();
		int startNode = 2;
		for (int i = 0; i < v + 1; i++) {
			visited[i] = 0;
		}

		for (int i = 1; i < v + 1; i++) {

			if (visited[i] == 0)
				dfs(adj, i, visited, DfsResult);
			System.out.println("Result dfs for");
			for (int k = 0; k < DfsResult.size(); k++) {

				System.out.print(DfsResult.get(k));
			}
		}

		// dfs(adj, startNode, visited, DfsResult);
		/*
		 * System.out.println("Result dfs for"+i); for (int i = 0; i < DfsResult.size();
		 * i++) {
		 * 
		 * System.out.print(DfsResult.get(i)); }
		 */
	}

	static void dfs(ArrayList<ArrayList<Integer>> adj, int i, Integer[] visited, ArrayList<Integer> dfsResult) {
		// TODO Auto-generated method stub
		visited[i] = 1;
		dfsResult.add(i);
		ArrayList<Integer> arr = adj.get(i);
		for (int j : arr) {
			if (visited[j] == 0) {
				dfs(adj, j, visited, dfsResult);
			}else
			{
				System.out.println("cycle exist");
			}
		}
	}
}
