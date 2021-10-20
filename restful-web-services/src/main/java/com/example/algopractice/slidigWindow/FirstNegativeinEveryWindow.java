package com.example.algopractice.slidigWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class FirstNegativeinEveryWindow {

	public static void main(String arg[]) {
		int arr[] = { -1, -2, 3, 4, -5, 6, 9, 10 };
		int k = 3;
		int len = arr.length;

		fistNegative(arr, k, len);

	}

	private static void fistNegative(int[] arr, int k, int len) {
		// TODO Auto-generated method stub
		int i = 0, j = 0;
		int firstNegative = 0;
		int flag = 0;
		Queue<Integer> queue = new LinkedList<>();
		ArrayList<Integer> result = new ArrayList();
		while (j < len) {
			if (arr[j] < 0) {
				queue.add(arr[j]);
			}

			if (j - i + 1 < k) {

				j++;
			} else if (j - i + 1 == k) {

				if (!queue.isEmpty()) {

					if (arr[i] == queue.peek()) {
						System.out.println("from "+(i+1)+"to the index "+(j+1)+"negative element"
								+queue.peek());
						result.add(queue.peek());
						queue.poll();
					}
					else {
						//System.out.println("arr ele in else"+arr[i]);
						System.out.println("from "+(i+1)+"to the index "+(j+1)+"negative element"
								+queue.peek());						
						result.add(queue.peek());
					}
						
				} else{
					System.out.println("from "+(i+1)+"to the index "+(j+1)+"negative element"
							+0);
					result.add(0);
				}
				i++;
				j++;
			}

			for (Integer e : result) {
			}
		}
	}

}
