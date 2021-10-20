package com.example.algopractice.DP;

public class KnapsackRecursion {

	public static void main(String args[]) {
		int wt[] = { 5, 4, 3, 10};
		int val[] = { 1, 2, 3, 4 };
		int W = 20;
		int n = 4;
		
		int max = knapSackRecursion(wt, val, W, n);
		System.out.println(max);
	}

	private static int knapSackRecursion(int[] wt, int[] val, int w, int n) {
		// TODO Auto-generated method stub

		if (n == 0 || w == 0) {
			return 0;
		}

		if ((wt[n - 1]) <= w) {
			return max(val[n - 1] + knapSackRecursion(wt, val, (w - wt[n - 1]), n - 1),
					knapSackRecursion(wt, val, w, n - 1));
		} else {
			return knapSackRecursion(wt, val, w, n - 1);
		}
	}

	private static int max(int i, int j) {

		if (i >= j) {
			return i;
		} else {
			return j;

		}
	}
}
