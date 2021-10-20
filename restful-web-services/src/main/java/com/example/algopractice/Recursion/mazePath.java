package com.example.algopractice.Recursion;

import java.util.ArrayList;

public class mazePath {

	public static void main(String args[]) {
		int mat[][] = new int[4][4];
		int i = 0, j = 0;

		int p = getMazePath(mat, i, j, 3);
		System.out.println(p);
		ArrayList<String> res1 = printMazePath(mat, i, j, 3);
		for (String s : res1) {
			System.out.println(s);
		}
	}

	private static int getMazePath(int[][] mat, int i, int j, int size) {
		// TODO Auto-generated method stub

		if (i == size && j == size) {
			return 1;
		} else if (i > size || j > size) {
			return 0;
		}

		int x1 = getMazePath(mat, i + 1, j, size);
		int x2 = getMazePath(mat, i, j + 1, size);
		return x1 + x2;

	}

	private static ArrayList<String> printMazePath(int[][] mat, int i, int j, int size) {
		// TODO Auto-generated method stub

		if (i == size && j == size) {
			ArrayList<String> res = new ArrayList<>();
			res.add("" + i + j);
			return res;
		} else if (i > size || j > size) {
			ArrayList<String> res = new ArrayList<>();
			return res;
		}

		ArrayList<String> res1 = printMazePath(mat, i + 1, j, size);
		ArrayList<String> res2 = printMazePath(mat, i, j + 1, size);
		ArrayList<String> finalRes = new ArrayList<>();

		for (String s : res1) {
			finalRes.add("" + i + j + "" + s);
		}

		for (String s : res2) {

			finalRes.add(s);

		}
		return finalRes;
	}

}
