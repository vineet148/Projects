package com.example.algopractice.BinarySearch;

public class SearchRowWiseAndColumnWiseInSortedArr {

	public static void main(String args[]) {
		int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 45 }, { 32, 33, 39, 50 } };
		int r = 4;
		int c = 4;
		int key = 37;
		SearchRowAndColwise(arr, r, c, key);
	}

	private static void SearchRowAndColwise(int[][] arr, int r, int c, int key) {
		// TODO Auto-generated method stub

		int i = 0;
		int j = c - 1;

		while (i <= r && j >= 0) {

			int mid = arr[i][j];
			if (key < mid) {
				j--;
			} else if (key > mid) {
				i++;
			} else if (key == mid) {
				System.out.println("key found at row" + i + "and at column" + j);
				return;
			}
		}
		System.out.println("not found");

	}
}
