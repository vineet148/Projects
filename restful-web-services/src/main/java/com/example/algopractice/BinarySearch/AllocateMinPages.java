package com.example.algopractice.BinarySearch;

import java.util.PriorityQueue;
import java.util.Vector;


public class AllocateMinPages {

	public static void main(String args[]) {
	
	
		int arr[] = { 10, 20, 30, 40 };
		int s = 2;
		int len = arr.length;
		int res = AllocateMin(arr, len, s);
		System.out.println("minimum allocation is"+res);

	}

	private static int AllocateMin(int[] arr, int len, int s) {
		// TODO Auto-generated method stub

		int res = 0;
		if (arr.length < s) {
			res = -1;

		}

		int max = -1;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += arr[i];
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		int low = max;
		int high = sum;
		int mid = -1;
		while (low <= high) {


			mid = (low + high) / 2;
			System.out.println(mid);
			if (isValid(arr, len, mid, s)) {
				res = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
				
			}

		}

		return res;
	}

	private static boolean isValid(int[] arr, int len, int mid, int s) {
		// TODO Auto-generated method stub
		int count = 1;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum =sum + arr[i];
			if (sum > mid) {
				count++;
				sum=0;
				sum = arr[i];
			}
		
		}
		
		
		if (count > s) {
			return false;

	}

		return true;
	}

}
