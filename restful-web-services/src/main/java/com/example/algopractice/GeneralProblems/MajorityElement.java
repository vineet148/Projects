package com.example.algopractice.GeneralProblems;

public class MajorityElement {

	public static void main(String args[])
	{
		int arr[]= {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
		int len=arr.length;
		int count=0;
		int elem=0;
		
		for(int i=0;i< len;i++)
		{
			if(count==0)
			{
				elem=arr[i];

			}
			if(arr[i]==elem)
			{
				count++;
			}else
			{
				count-=1;
			}
			
		}
		
		System.out.println(elem+"is the majority element");
		
				
		
		
	}
	
}
