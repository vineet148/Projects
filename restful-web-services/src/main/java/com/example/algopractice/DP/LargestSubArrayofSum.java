package com.example.algopractice.DP;

public class LargestSubArrayofSum {

	public static void main(String args[]) {

		int arr[] = { -10, -5, -5, 4, 2, 2, 1, 1 };
		int k = 10;
		int len = arr.length;
		findMaxSubArrayForSum(arr, k, len);

	}

	private static void findMaxSubArrayForSum(int[] arr, int k, int len) {
		// TODO Auto-generated method stub

		int i = 0, j = 0, max = 0;
		int tempSum = 0;
		while (j < len) {
			tempSum += arr[j];
			if (tempSum < k) {
				j++;
			} else if (tempSum == k) {
				if (j - i + 1 > max) {
					max = j - i + 1;
				}
				j++;

			} else if (tempSum > k) {
				while (tempSum > k) {
					tempSum -= arr[i];
				    i++;
				}
				j++;
			}

		}
		
		System.out.println("largest length"+max);

	}
}
