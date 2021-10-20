package com.example.algopractice.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import javafx.util.Pair;

public class ShortestPathBSF {

	static Queue<Integer> queue1 = new LinkedList<Integer>();
     static PriorityQueue<Pair<Integer,Integer>> pqueue=new PriorityQueue<>();
    
	public static void main(String args[]) {
		int v = 5;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
		  ArrayList<ArrayList< Pair<Integer,Integer> >> adjWeighted=
		    		 new ArrayList<ArrayList<Pair<Integer,Integer>>>(v+1);

		GraphRepAdjMatrix.makeGraph(adj, v);
		GraphRepAdjMatrix.addEdge(adj, 0, 1);
		GraphRepAdjMatrix.addEdge(adj, 1, 2);
		GraphRepAdjMatrix.addEdge(adj, 1, 3);
		GraphRepAdjMatrix.addEdge(adj, 2, 3);
		GraphRepAdjMatrix.addEdge(adj, 3, 4);
		GraphRepAdjMatrix.addEdge(adj, 2, 4);

		//shortestPath(adj,v);

		GraphRepAdjMatrix.makeGraphWeighted(adjWeighted, v);
		GraphRepAdjMatrix.addEdgeUndirectedWeighted(adjWeighted,0,1,2);
		GraphRepAdjMatrix.addEdgeUndirectedWeighted(adjWeighted,1,2,3);
		GraphRepAdjMatrix.addEdgeUndirectedWeighted(adjWeighted,1,3,2);
		GraphRepAdjMatrix.addEdgeUndirectedWeighted(adjWeighted,2,3,4);
		GraphRepAdjMatrix.addEdgeUndirectedWeighted(adjWeighted,3,4,6);
		GraphRepAdjMatrix.addEdgeUndirectedWeighted(adjWeighted,2,4,1);
		
		
		shortestPathDjistra(adjWeighted,v);
		
		
	}

	private static void shortestPathDjistra(ArrayList<ArrayList<Pair<Integer, Integer>>> adjWeighted, int v) {
		// TODO Auto-generated method stub

		Integer[] distance=new Integer[v+1];
		for(int i=0;i< distance.length;i++)
		{
			distance[i]=9999;
			
		}
		int src=0;
		pqueue.add(new Pair(0,0));
		distance[src]=0;
		
		while(pqueue.size()>0)
		{
		Pair elem=pqueue.poll();
		ArrayList< Pair<Integer,Integer>> p=adjWeighted.get((int) elem.getValue());
		for(Pair p1: p)
		{
			if(distance[(int) p1.getValue()] > distance[(int) elem.getValue()]+1 )
			{
				distance[(int) p1.getValue()]=distance[(int) elem.getValue()]+1;
				pqueue.add(new Pair(distance[(int) p1.getValue()],p1.getKey()));
			}
		
		}
			
		}
		System.out.println(distance[3]);

	}

	private static void shortestPath(ArrayList<ArrayList<Integer>> adj, int v) {
		// TODO Auto-generated method stub
		
		Integer[] distance=new Integer[v+1];
		for(int i=0;i< distance.length;i++)
		{
			distance[i]=9999;
			
		}
		
		int src=0;
		queue1.add(src);
		distance[src]=0;
		while(queue1.size()>0)
		{
			int elem=queue1.poll();
			for(int i: adj.get(elem))
			{
				if(distance[i] > distance[elem]+1)
				{
					distance[i]=distance[elem]+1;
					queue1.add(i);
				}
			}
		}
		
		System.out.println(distance[3]);
	}

}
