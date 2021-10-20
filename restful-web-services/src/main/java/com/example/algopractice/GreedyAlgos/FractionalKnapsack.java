package com.example.algopractice.GreedyAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;


class CompareObjects implements Comparator<Object1> {

	@Override
	public int compare(Object1 o1, Object1 o2) {
		// TODO Auto-generated method stub
		if (o1.valuePerWeight > o2.valuePerWeight)
			return -1;
		else if (o1.valuePerWeight < o2.valuePerWeight)
			return 1;

		return 1;

	}

}

class Object1 {
	int value;
	int weight;
	int valuePerWeight;

	public Object1(int value, int weight, int valuePerWeight) {
		super();
		this.value = value;
		this.weight = weight;
		this.valuePerWeight = valuePerWeight;
	}

}



public class FractionalKnapsack {

	public static void main(String args[]) {
		int values[] = { 60, 100, 120 };
		int weight[] = { 10, 20, 30 };
		int N = 3;
		int W = 50;
		Integer[] valueperWeight = new Integer[N];

		ArrayList<Object1> objList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int k = values[i] / weight[i];
			valueperWeight[i] = k;
			objList.add(new Object1(values[i], weight[i], k));
		}

		fractionalKnapsack1(values, weight, valueperWeight,objList, N, W);

	}

	private static void fractionalKnapsack1(int[] values, int[] weight, Integer[] valueperWeight, ArrayList<Object1> objList, int n, int w) {
		// TODO Auto-generated method stub

		int maxValue=0;
		java.util.Collections.sort(objList, new CompareObjects());
		for(int j=0;j<objList.size();j++)
		{
		   
		  if(w-objList.get(j).weight >=0)
		  {
			  maxValue+=objList.get(j).value;
			  w-=objList.get(j).weight;
		  }else
		  {
			  maxValue+=w*valueperWeight[j];
		  }
			
		}
		
		System.out.println("Max value is"+maxValue);
		
	}
}
