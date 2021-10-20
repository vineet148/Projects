package com.example.algopractice.graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopoSortingDFS {

	static Stack<Integer> stack = new Stack<>();

	public static void main(String args[]) {
		int v = 6;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
		GraphRepAdjMatrix.makeGraph(adj, v);
		GraphRepAdjMatrix.addEdgeDirected(adj, 5,2 );
		GraphRepAdjMatrix.addEdgeDirected(adj, 2,3);
		GraphRepAdjMatrix.addEdgeDirected(adj, 3,1);
		GraphRepAdjMatrix.addEdgeDirected(adj, 4, 1);
		GraphRepAdjMatrix.addEdgeDirected(adj, 4,0);
		GraphRepAdjMatrix.addEdgeDirected(adj, 5,0);
		// GraphRepAdjMatrix.printAdj(adj);
		findDFS(adj, v);
	}

	private static void findDFS(ArrayList<ArrayList<Integer>> adj, int v) {
		// TODO Auto-generated method stub
		Integer[] visited = new Integer[v];
		ArrayList<Integer> DfsResult = new ArrayList<>();
		int startNode = 2;
		for (int k = 0; k < v ; k++) {
			visited[k] = 0;
		}
		for (int i = 0; i < v; i++) {
			
			if (visited[i] == 0) {
				dfs(adj, i, visited, DfsResult);
			}
		}
		
		System.out.println("Topo sort is");
		while(stack.size()>0)
		{
			System.out.println(stack.pop());
		}

	}

	static void dfs(ArrayList<ArrayList<Integer>> adj, int i, Integer[] visited, ArrayList<Integer> dfsResult) {
		// TODO Auto-generated method stub
		visited[i] = 1;
		dfsResult.add(i);
		ArrayList<Integer> arr = adj.get(i);
		for (int j : arr) {
			if (visited[j] == 0) {
				dfs(adj, j, visited, dfsResult);
			}
		}
		stack.push(i);

	}
}
