package com.example.algopractice.Recursion;

public class TargetSubSetSum {

	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5};
		int target=10;
		
		subSetSum(arr,0,"",0,target);
		
	}

	private static void subSetSum(int[] arr,int idx, String subset, int currentSum, int target) {
		// TODO Auto-generated method stub
		
		if(idx==arr.length)
		{
			if(currentSum==target)
			{
				System.out.println(subset+".");
			}
			
			return;
		}
		
		subSetSum(arr,idx+1,subset+arr[idx],currentSum+arr[idx],target);
		subSetSum(arr,idx+1,subset,currentSum,target);		
	}
	
}
