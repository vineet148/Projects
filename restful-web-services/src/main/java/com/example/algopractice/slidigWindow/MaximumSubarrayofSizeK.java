package com.example.algopractice.slidigWindow;

public class MaximumSubarrayofSizeK {

	public static void main(String args[])
	{
		
		int arr[]= {1,211,3,4,5,1216,7,8};
		int k=3;
		int len=arr.length;
	   findSubArraySum(arr,k,len);
	  
	   
	}

	private static void findSubArraySum(int[] arr, int k, int len) {
		// TODO Auto-generated method stub

		int i=0,j=0;
		int Max=0;
		int sum=0;
		while(j < len)
		{
			
			if(j-i+1 < k)
			{
				sum+=arr[j];
				j++;
			}
			else if(j-i+1 ==k)
			{
				sum+=arr[j];
				if(Max<sum)
				{
					Max=sum;
				}
				sum-=arr[i];
				i++;
				j++;
				
			}
		}
		System.out.println("Maximum is"+Max);
	}
}
