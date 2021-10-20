package com.example.algopractice.GeneralProblems;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String args[]) {
		int numRows = 5;
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> row, pre = null;

		for (int i = 0; i < numRows; i++) {
			row = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					row.add(1);
				} else {
					row.add(pre.get(j - 1) + pre.get(j));
				}

			}
			pre=row;
			res.add(row);
		}
		
		for(int k=0;k< res.size() ;k++)
		{
			for(int elem: res.get(k))
			{
				System.out.print(elem+" ");
			}
			System.out.println();
			
		}

	}

}
