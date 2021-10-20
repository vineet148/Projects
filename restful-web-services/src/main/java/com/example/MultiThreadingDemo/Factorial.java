package com.example.MultiThreadingDemo;

public class Factorial {

	public static void main(String args[]) {
		Long x;

		x = print(55);
		System.out.println(x);

		long y;
		y=fib(9);
		System.out.println(y);
	}
	
	public static int[] SortArray(int[] arr)
	{
		if(arr.length == 0 || arr.length==1)
		{
			return arr;
		}
		int x=arr[arr.length-1];
		int[] tempArr=new int[arr.length-1];
		for(int i=0 ;i < arr.length-1 ;i++)
		{
			if(x <)
	
			
		}
		
	}

	public static long  fib(int n) {
		if (n <= 1)
		{
	    	return n;
		}

		  return fib(n - 1) + fib(n - 2);
 
	}

	public static long print(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		return n * print(n - 1);
	}
}
