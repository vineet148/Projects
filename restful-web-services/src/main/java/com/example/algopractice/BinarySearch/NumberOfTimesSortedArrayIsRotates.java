package com.example.algopractice.BinarySearch;

public class NumberOfTimesSortedArrayIsRotates {

	public static void main(String args[]) {
		int arr[] = { 6,9,8,7,1,2, 3, 4, 5 };
		int len = arr.length;
		int x = NoOfTimesSortedArrayisRotated(arr, len);
		System.out.println(x);
		System.out.println("vinee".eq .substring(0,"vinee".length()-2));
	}

	private static int NoOfTimesSortedArrayisRotated(int[] arr, int len) {
		// TODO Auto-generated method stub

		int low = 0, mid = 0;
		int high = len - 1;
		int result = 0;
		while (low <= high) {
			
			if (low == high) {		
				result= low;
				break;
				
			}

			mid = (low + high)/2;
			
			if ((arr[mid] <= arr[mid - 1]) && (arr[mid] <= arr[mid + 1])) {
				result=mid;
				break;
			}

			
			/*  if (mid < high && arr[mid+1] < arr[mid]) { 
				  result=mid+1;
				  	break;
			  }
			  
			  // Check if mid itself is minimum element 
			  if (mid > low && arr[mid] < arr[mid- 1])
			  {
				  result= mid;
				  break;
			  }
*/
			if (arr[mid] > arr[low]) {
				low = mid + 1;
			} else if (arr[mid] < arr[high]) {
				high = mid - 1;
			}

		}

		return result;
	}
}
