package com.example.algopractice.BinarySearch;
import java.lang.Math;
public class MinimumDiffElemInSortedArr {

	public static void main(String args[]) {

		
		int arr[] = { 1, 2, 3, 7, 8, 9 };
		int key = 4;
		int len = arr.length;

		binarySearchApprorach(arr, len, key);
		
		
		int x1 = findMindiffCeil(arr, len, key);

		int x2 = findMindiffFloor(arr, len, key);

		if (Math.abs(x1 - key) > Math.abs(key - x2)) {
			System.out.println(Math.abs(key - x2));
		} else {
			System.out.println(Math.abs(x1 - key));
		}
	
		}

	private static void binarySearchApprorach(int[] arr, int len, int key) {
		// TODO Auto-generated method stub
		int low = 0;
		int high = len - 1;
		int mid = 0;
		int res = 0;
		while (low <= high) {

			mid = low + (high - low) / 2;
			if (arr[mid] == key) {
				res = arr[mid];
				break;
			} else if (arr[mid] > key) {
				high = mid - 1;

			} else {
				low = mid + 1;
			}

		}

		
		if (Math.abs(arr[low] - key) > Math.abs(arr[high] - key)) {
			res = Math.abs(arr[high] - key);
		} else {
			res = Math.abs(arr[low] - key);
		}
		System.out.println(res);

	}

	private static int findMindiffFloor(int[] arr, int len, int key) {
		// TODO Auto-generated method stub

		int low = 0;
		int high = len - 1;
		int mid = 0;
		int res = 0;
		while (low <= high) {

			mid = low + (high - low) / 2;

			if (arr[mid] == key) {
				res = arr[mid];
				break;
			} else if (arr[mid] < key) {
				low = mid + 1;
				res = arr[mid];
			} else if (arr[mid] > key) {
				high = mid - 1;
			}

		}

		return res;
	}

	private static int findMindiffCeil(int[] arr, int len, int key) {
		// TODO Auto-generated method stub

		int low = 0;
		int high = len - 1;
		int mid = 0;
		int res = 0;
		while (low <= high) {
			mid = low + (high - low) / 2;

			if (arr[mid] == key) {
				res = arr[mid];
				break;
			} else if (arr[mid] < key) {
				low = mid + 1;
			} else if (arr[mid] > key) {
				high = mid - 1;
				res = arr[mid];
			}

		}

		return res;

	}
}
