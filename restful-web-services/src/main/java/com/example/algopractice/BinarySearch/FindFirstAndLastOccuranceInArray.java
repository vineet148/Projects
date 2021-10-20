package com.example.algopractice.BinarySearch;

import com.example.algopractice.Methods;

public class FindFirstAndLastOccuranceInArray implements Methods {

	public static void main(String arg[]) {
		int arr[] = { 1, 2, 3, 3, 4, 5, 6, 7, 8, 9 };
		int key = 3;
		int len = arr.length;

		fistFirstOccurance(arr, key, len);
		LastOccurance(arr, key, len);

	}

	 static int fistFirstOccurance(int[] arr, int key, int len) {
		// TODO Auto-generated method stub

		int low = 0, high = len - 1;
		int result = 0;
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;

			if (arr[mid] == key) {
				high = mid - 1;
				result = mid;
			} else if (arr[mid] > key) {
				high = mid - 1;
			} else if (arr[mid] < key) {
				low = mid + 1;
			}

		}
		return result;

	}

	 static int LastOccurance(int[] arr, int key, int len) {
		// TODO Auto-generated method stub

		int low = 0, high = len - 1;
		int result = 0;
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;

			if (arr[mid] == key) {
				low = mid + 1;
				result = mid;
			} else if (arr[mid] > key) {
				high = mid - 1;
			} else if (arr[mid] < key) {
				low = mid + 1;
			}

		}

		return result;
	}
}
