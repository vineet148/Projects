package com.example.algopractice.stack;

import java.util.Collection;
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

import javafx.util.Pair;

public class StockSpanProblem {

	public static void main(String args[]) {
		int arr[] = { 1, 6, 2, 4, 5, 2, 1 };

		int len = arr.length;

		NextGreaterElemToLeft(arr,len);

	}

	private static void NextGreaterElemToLeft(int[] arr, int len) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();
		Stack<Pair<Integer,Integer>> s = new Stack<>();
	     Pair<Integer,Integer> p=new Pair<Integer, Integer>(0, arr[0]);
		v.add(-1);
		s.push(p);

		if (arr.length == 0) {
			System.out.println(-1);
			return;
		}

		for (int i = 1; i < len; i++) {
			{
				if (arr[i] < s.peek().getValue()) {
					v.add(s.peek().getKey());
					Pair<Integer,Integer> temp=new Pair<Integer, Integer>(i, arr[i]);
					s.push(temp);
					System.out.println("adding in case of greater ele top is" + s.peek());
				} else {
					while (s.size() > 0 && arr[i] > s.peek().getValue()) {
						 s.pop();
					}
					if (s.empty()) {
						v.add(-1);
						s.push(new Pair(i,arr[i]));
						System.out.println("stack top for empty stack " + s.peek());
					} else if (arr[i] < s.peek().getValue()) {
						v.add(s.peek().getKey());
						s.push(new Pair(i,arr[i]));
						System.out.println("adding element to top" + s.peek());

					}

				}

			}

		}


		Vector<Integer> res=new Vector<>();
		for (int k = 0;k <v.size();k++) {				   
			if(v.get(k) == -1)
			{
				res.add(1);
			}else
			{
				
				res.add(k-v.get(k));
			}
		
		}

			for(int k1=0;k1< res.size();k1++)
		{
				
			System.out.println(res.get(k1));
		}
	}

}