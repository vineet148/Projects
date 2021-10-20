package com.example.algopractice.GeneralProblems;

public class sort0s1s2s {

	public static void main(String args[])
	{
		int arr[]= {0,1,1,0,1,2,1,2,0,0,0,1};
		int len=arr.length;
		int low=0,mid=0,high=len-1;
	     
		while(mid <= high)
		{
			switch(arr[mid])
			{
			case 0:  int temp=arr[mid];
			         arr[mid]=arr[low];
			         arr[low]=temp;
			         mid++;
			         low++;
			         break;
			 
			case 1:  mid++;
			         break;
			
			case 2: int temp2=arr[mid];
			        arr[mid]=arr[high];
			        arr[high]=temp2;
			        high--;
			        break;
			}
		}
		
		System.out.println("sorted array");
		for(int i=0;i< len;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}
	
}
