package com.example.algopractice.GeneralProblems;

import java.util.ArrayList;
import java.util.Arrays;

import javafx.util.Pair;

public class MergeIntervals {

	public static void main(String args[]) {
		Pair p1 = new Pair(1, 3);
		Pair p2 = new Pair(8, 10);
		Pair p3 = new Pair(2, 6);
		Pair p4 = new Pair(9, 9);
		Pair p5 = new Pair(15, 18);
		Pair p6=new Pair(2,9);
		Pair[] arr = { p1, p2, p3, p4, p5,p6};

		Arrays.sort(arr, new CompareObject());

		int len = arr.length;
		MergePairArray(arr, len);

	}

	private static void MergePairArray(Pair[] arr, int len) {
		// TODO Auto-generated method stub

		Pair temp = arr[0];
		Pair tempPair;
		ArrayList<Pair> result = new ArrayList<>();
		int i;
		for ( i = 1; i < len; i++) {
			int key = (int) arr[i].getKey();
			int val = (int) arr[i].getValue();
			if (key < (int) temp.getValue() && val > (int)temp.getValue() ) {
				tempPair = new Pair(temp.getKey(), val);
				temp = tempPair;
			} else {
				result.add(temp);
				temp = arr[i];
				
			}

		}
		result.add(temp);
				
		for (int j = 0; j < result.size(); j++) {
			System.out.println(result.get(j));
		}

	}

}
