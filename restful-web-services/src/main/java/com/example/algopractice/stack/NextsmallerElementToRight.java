package com.example.algopractice.stack;

import java.util.Collection;
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

import javafx.util.Pair;

public class NextsmallerElementToRight {

	public static void main(String args[]) {
		Pair<Integer,Integer> pair=new Pair<Integer, Integer>(1,2);
		
		int arr[] = { 1, 3, 2, 4, 5, 2, 1 };
		int len = arr.length;

		NextGreaterElemToRight(arr, len);

	}

	private static void NextGreaterElemToRight(int[] arr, int len) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();
		Stack<Integer> s = new Stack<>();
		v.add(-1);
		s.push(arr[len - 1]);

		for (int i = len - 2; i >= 0; i--) {
			{
				 System.out.println("for element"+arr[i]+"index"+i);
				if (arr[i] >= s.peek()) {

					v.add(s.peek());
					s.push(arr[i]);
					System.out.println("adding in case of greater ele top is" + s.peek());
				} else {
					while (arr[i] <= s.peek()) {
						int x = s.pop();
						System.out.println("popping" + x);
						if (s.empty()) {
							break;
						} else {
							continue;
						}
					}
					if (s.empty()) {
						v.add(-1);
						s.push(arr[i]);
						System.out.println("stack top for empty stack " + s.peek());
					} else if (arr[i] > s.peek()) {
						v.add(s.peek());
						s.push(arr[i]);
						System.out.println("adding element to top" + s.peek());

					}

				}

			}

		}
		
		for(int k=v.size()-1;k>=0;k--)
		{
			System.out.println("for k"+k+" "+v.get(k));
		}
	
	
	
	}

}