package com.example.algopractice.graph;

import java.util.ArrayList;

import javafx.util.Pair;

public class GraphRepAdjMatrix {

	 public static void main(String args[]) {
		 int v=5;
	     ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v+1);
	     ArrayList<ArrayList< Pair<Integer,Integer> >> adjWeighted=
	    		 new ArrayList<ArrayList<Pair<Integer,Integer>>>(v+1);

	     makeGraph(adj,v);   
	     addEdge(adj,1,2);
	     addEdge(adj,2,3);
	     addEdge(adj,2,4);
	     addEdge(adj,3,4);
	     addEdge(adj,5,1);
	     	     
	     
	     printAdj(adj); 		 
	 }

	static void makeGraph(ArrayList<ArrayList<Integer>> adj, int v) {
		// TODO Auto-generated method stub
		

		for(int i=1;i<=v+1;i++)
	     {
	    	 adj.add(new ArrayList<Integer>());
	    	 
	     }
	    
	}
	static void makeGraphWeighted(ArrayList<ArrayList<Pair<Integer,Integer>>> adj, int v) {
		// TODO Auto-generated method stub
		

		for(int i=1;i<=v+1;i++)
	     {
	    	 adj.add(new ArrayList<Pair<Integer,Integer>>());
	    	 
	     }
	    
	}


	static void printAdj(ArrayList<ArrayList<Integer>> adj) {
		// TODO Auto-generated method stub
		
		for(int i=1;i< adj.size();i++)
		{
			System.out.println("Adjaceny List for "+i);
			for(int j=0;j< adj.get(i).size();j++)
			{
				System.out.print("->"+adj.get(i).get(j));
			}
			System.out.println();
		}
		
	}

	 static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j) {
		// TODO Auto-generated method stub
		
		adj.get(i).add(j);
		adj.get(j).add(i);
		
	} 

	 static void addEdgeDirected(ArrayList<ArrayList<Integer>> adj, int i, int j) {
		// TODO Auto-generated method stub
		
		adj.get(i).add(j);
		
	} 
	 static void addEdgeDirectedWeighted(ArrayList<ArrayList<Pair<Integer,Integer>>> adj, int i, int j,int w) {
		// TODO Auto-generated method stub
		
		adj.get(i).add(new Pair(j,w));
		
	}
	 static void addEdgeUndirectedWeighted(ArrayList<ArrayList<Pair<Integer,Integer>>> adj, int i, int j,int w) {
		// TODO Auto-generated method stub
		
		adj.get(i).add(new Pair(j,w));
		adj.get(j).add(new Pair(i,w));
		
	} 

	
}
