package com.example.algopractice.GeneralProblems;

public class NextPermutation {

	public static void main(String args[]) {
		int arr[] = { 1, 3, 5, 4, 2 };
		int len = arr.length;

		NextPermutation(arr, len);

	}

	private static void NextPermutation(int[] arr, int len) {
		// TODO Auto-generated method stub

		int k = len - 1;
		int i = len - 1;

		while (k >= 1 && arr[k - 1] > arr[k]) {
			k--;
		}
		k=k-1;
		while (arr[i] < arr[k]) {
			i--;
		}

		int temp = arr[i];
		arr[i] = arr[k];
		arr[k] = temp;

		int res[] = reverse(arr, k + 1, len);

		for(int elem:res)
		{
			System.out.println(elem);
		}
		
	}

	private static int[] reverse(int[] arr, int start, int len) {
		// TODO Auto-generated method stub
		int i = start;
		int j = len - 1;
		int temp;
		while (i < j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		return arr;
	}

}
