package com.example.algopractice.BinarySearch;

public class SearchElememtInRotatedArray {

	public static void main(String args[]) {
		int arr[] = { 6, 9, 8, 7, 1, 2, 3, 4, 5 };
		int len = arr.length;
		int key = 2;
		int x = findElement(arr, len, key);
	}

	private static int findElement(int[] arr, int len, int key) {
		// TODO Auto-generated method stub

		int x1 = findMinelemIndex(arr, len);
		int l = BinarySearch(arr, 0, x1, key);
		int r = BinarySearch(arr, x1 + 1, len, key);
        System.out.println(l+" "+r);

        if(l!=-1)
        {
        	return l;
        			
        }else {
        	return r;
        }
	}

	private static int BinarySearch(int[] arr, int low, int high, int key) {
		// TODO Auto-generated method stub

		int mid = 0;
		int result = 0;
		while (low <= high) {

			mid = (low + high) / 2;

			if (arr[mid] == key) {
				result = mid;
				break;
			} else if (arr[mid] > key) {
				high = mid - 1;
			} else if (arr[mid] < key) {
				low = mid + 1;
			} else {
				result = -1;
			}

		}
		return result;
	}

	private static int findMinelemIndex(int[] arr, int len) {
		// TODO Auto-generated method stub

		int low = 0;
		int high = len - 1;
		int mid = 0;
		int min1 = 0;
		while (low <= high) {

			if (low == high) {
				min1 = low;
				break;
			}
			mid = (low + high) / 2;

			if ((arr[mid] <= arr[mid - 1]) && (arr[mid] <= arr[mid + 1])) {
				min1 = mid;
				break;
			}

			if (arr[mid] > arr[low]) {
				low = mid + 1;
			} else if (arr[mid] < arr[high]) {
				high = mid - 1;

			}

		}

		return min1;
	}
}
