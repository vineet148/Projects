package com.example.algopractice.DP;

import java.util.Arrays;

public class KnapsackMemoization {
	static int W = 20;
	static int n = 4;
	static int wt[] = { 5, 4, 3, 10 };
	static int val[] = { 1, 2, 3, 4 };
	static int t[][] = new int[n + 1][W + 1];

	public static void main(String args[]) {
     int x=10;
     String y=wt.toString().split(",")[0];
     System.out.println(y);
		
		
		findKnapSack();
	}

	private static void findKnapSack() {
		// TODO Auto-generated method stub
		for (int[] arr : t) {
			Arrays.fill(arr, -1);
		}

		KnapsackMemoization knapsackMemoization = new KnapsackMemoization();
		int max = knapsackMemoization.knapSackRecursion(wt, val, W, n);
		System.out.println(max);
	}

	private int knapSackRecursion(int[] wt, int[] val, int w, int n) {
		// TODO Auto-generated method stub

		if (n == 0 || w == 0) {
			return 0;
		}

		if (t[n][w] != -1) {

			return t[n][w];
		}

		if ((wt[n - 1]) <= w) {
			t[n][w] = max(val[n - 1] + knapSackRecursion(wt, val, (w - wt[n - 1]), n - 1),
					knapSackRecursion(wt, val, w, n - 1));
		} else {
			t[n][w] = knapSackRecursion(wt, val, w, n - 1);
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
