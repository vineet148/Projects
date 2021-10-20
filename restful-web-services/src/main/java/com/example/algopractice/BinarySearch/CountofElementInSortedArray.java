package com.example.algopractice.BinarySearch;
import com.example.algopractice.BinarySearch.FindFirstAndLastOccuranceInArray;
public class CountofElementInSortedArray {

	public static void main(String arg[]) {
		int arr[] = { 1, 2, 3, 3,3,3,4 ,4, 5,5,5, 6, 7, 8, 9 };
		int key = 5;
		int len = arr.length;
		FindFirstAndLastOccuranceInArray f1=new FindFirstAndLastOccuranceInArray();
		int x=f1.fistFirstOccurance(arr, key, len);
		int y=f1.LastOccurance(arr, key, len);
		int count=(y-x)+1;
		System.out.println("count of element"+count);
		

	}

}
