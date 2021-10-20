package com.example.algopractice.GeneralProblems;

public class SearchInSortedMatrix {

	public static void main(String args[])
	{
		int mat[][] = { { 1, 2, 3 },
				        { 4, 5, 6 }, 
				        { 7, 8, 9 }, 
				        };
		int size = mat.length;
		int key=4;
		
		int m=size;
		int n=mat[0].length;
		
		int low=0;
		int high=m*n-1;
		
		while(low <=high)
		{
			int mid=low+ (high-low)/2;
			int elem=mat[mid/n][mid%n];
			if(key < elem)
			{
				high=mid-1;
			}else if(key > elem)
			{
				low=mid+1;
			}
			else if(key==elem)
			{
				System.out.println("key found at("+mid/n+","+mid%n+")");
			    return;
			}
			
		}
		
		System.out.println("not found");
		
				
		
	}
	
}
