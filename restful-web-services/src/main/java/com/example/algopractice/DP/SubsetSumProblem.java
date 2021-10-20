package com.example.algopractice.DP;

import java.util.Arrays;

public class SubsetSumProblem {
	static int W = 4;
	static int n = 4;
	static int wt[] = { 5, 4, 3, 10 };
	static boolean t[][] = new boolean[n + 1][W + 1];

	public static void main(String args[]) {

		findSubset();
	}

	private static void findSubset() {
		// TODO Auto-generated method stub
		SubsetSumProblem subsetSumProblem = new SubsetSumProblem();
		boolean max = subsetSumProblem.SubsetProblem(wt, W, n);
		System.out.println(max);
	}

	private boolean SubsetProblem(int[] wt, int w, int n) {
		// TODO Auto-generated method stub

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < w; j++) {

				if (i == 0) {
					t[i][j] = false;
				} else if (j == 0) {
					t[i][j] = true;
				}

			}
		}

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < w + 1; j++) {
				if ((	wt[i - 1]) <= j) {
					t[i][j] = (t[i-1][j - wt[i - 1]]) || (t[i - 1][j]);
				} else {
					t[i][j] = t[i - 1][j];
				}

			}
		}
		return t[n][w];

	}

}
