package com.example.algopractice.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.example.algopractice.graph.GraphRepAdjMatrix;

public class BFS {
	static Queue<Integer> queue = new LinkedList<Integer>();

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
		findBFS(adj, v);
	}

	private static void findBFS(ArrayList<ArrayList<Integer>> adj, int v) {
		// TODO Auto-generated method stub
		Integer[] visited = new Integer[v + 1];
		ArrayList<Integer> BfsResult = new ArrayList<>();
		int startNode = 2;


		for (int i = 1; i < v + 1; i++) {

			for (int l = 0; l < v + 1; l++) {
				visited[l] = 0;

			}
			if (visited[i] == 0) {
				visited[i]=1;
				queue.add(i);
				bfs(adj, visited, BfsResult);
				System.out.println("bfs for i"+i);
				for (int k = 0; k < BfsResult.size(); k++) {
					System.out.print(BfsResult.get(k));
				}
			}
			System.out.println("\n");
			BfsResult.clear();
		}
		
		/*
		queue.add(1);
		visited[1]=1;
		bfs(adj,visited,BfsResult);
*/
		

	}

	static void bfs(ArrayList<ArrayList<Integer>> adj, Integer[] visited, ArrayList<Integer> bfsResult) {
		// TODO Auto-generated method stub
		int elem=-1;
		
		while(queue.size()> 0)
		{
		 elem = queue.poll();

		 bfsResult.add(elem);
		ArrayList<Integer> arr = adj.get(elem);

		for (int j : arr) {
			if (visited[j] == 0) {
			  visited[j]=1;
              queue.add(j);			
			}
		}
	
		}
	}
}
