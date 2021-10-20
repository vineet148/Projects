package com.example.algopractice.DP;

import java.util.Arrays;

public class KnapsackTopDown {
	static int W = 20;
	static int n = 4;
	static int wt[] = { 5, 4, 3, 10 };
	static int val[] = { 1, 2, 3, 4 };
	static int t[][] = new int[n + 1][W + 1];

	public static void main(String args[]) {

		findKnapSack();
	}

	private static void findKnapSack() {
		// TODO Auto-generated method stub
		for (int[] arr : t) {
			Arrays.fill(arr, -1);
		}

		KnapsackTopDown knapsacktopdown = new KnapsackTopDown();
		int max = knapsacktopdown.knapSacktopDown(wt, val, W, n);
		System.out.println(max);
	}

	private int knapSacktopDown(int[] wt, int[] val, int w, int n) {
		// TODO Auto-generated method stub

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < w; j++) {

				if (n == 0 || w == 0) {
					t[i][j] = 0;
				}

			}
		}

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < w + 1; j++) {
				if ((wt[i - 1]) <= j) {
					t[i][j] = max(val[i - 1] + t[i - 1][j - wt[i - 1]], t[i - 1][j]);
				} else {
					t[i][j] = t[i - 1][j];
				}

			}
		}
		return t[n][w];

	}

	private static int max(int i, int j) {

		if (i >= j) {
			return i;
		} else {
			return j;

		}
	}
}
