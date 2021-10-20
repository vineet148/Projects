package com.example.algopractice.slidigWindow;

public class MaximumOfAllSubarray {

	public static void main(String args[]) {

		int arr[] = { 1, 211, 3, 4, 5, 1216, 7, 8 };
		int k = 3;
		int len = arr.length;
		findSubArrayMax(arr, k, len);

	}

	private static void findSubArrayMax(int[] arr, int k, int len) {
		// TODO Auto-generated method stub

		int i = 0, j = 0, count = 0;
		int finalCount = 0;
		int temp[] = null;
		int result[] = null;
		while (j < len) {
			if (j - i + 1 < k) {

				temp[count++] = arr[j];
				j++;
			} else if (j - i + 1 == k) {
				temp[count] = arr[j];
				int x = findMax(temp);
				result[finalCount++] = x;
				temp
				i++;
				j++;

			}
		}
	}

	private static int findMax(int[] temp) {
		// TODO Auto-generated method stub

		int max = 0;
		for (int e : temp) {
			if (e > max) {
				max = e;
			}
		}
		return max;
	}

}
