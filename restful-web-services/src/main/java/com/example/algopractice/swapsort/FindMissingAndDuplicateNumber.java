package com.example.algopractice.swapsort;

import java.util.Vector;

public class FindMissingAndDuplicateNumber {

	static int arr[] = { 2,3,1,8,2,3,5,1 };

	public static void main(String args[]) {

		findMissingAndDuplicate();

	}

	private static void findMissingAndDuplicate() {
		// TODO Auto-generated method stub
		int len = arr.length;
		int j=0;
		while(j< len)
		{
			if (arr[j] != arr[arr[j] - 1]) {
				swap(j, arr[j] - 1);
			}
			else
			{
			   j++;	
			}
		}

		for (int i = 0; i < len; i++) {
			System.out.println(arr[i]);
		}

		Vector<Integer> vmissing = new Vector<>();
		Vector<Integer> vrepeat = new Vector<>();
		int flag = 0;
		for (int i = 0; i < len; i++) {
			if (arr[i] != i + 1) {
				flag = 1;
				if (arr[i] == arr[arr[i] - 1]) {
					vrepeat.add(arr[i]);
				}
				vmissing.add(i + 1);
			}

		}
		if (flag == 0) {
			System.out.println("nothing missing and repeating");
		} else {
			System.out.println("missing");
			for (int i = 0; i < vmissing.size(); i++) {
				System.out.println(vmissing.get(i));
			}
			System.out.println("repeating");
			for (int i = 0; i < vrepeat.size(); i++) {
				System.out.println(vrepeat.get(i));
			}
		}

	}

	private static void swap(int i, int j) {
		// TODO Auto-generated method stub

		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;

	}
}
