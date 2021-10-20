package com.example.algopractice.GeneralProblems;

public class PowerofNumber {

	public static void main(String args[])
	{
		int x=5;
		int n=-10;
		
		if(n<0)
		{
		int n1=n*(-1);
		int res=power(x,n1);
	    double res2=1.0/res;
		System.out.println(res2);
	    }
		else 
		{
			int res=power(x,n);
			System.out.println(res);
		}
	}
	private static int power(int x, int n) {
		// TODO Auto-generated method stub
		
		if(n==0)
		{
			return 1;
		}
		
		if(n%2!=0)
		{
			 return x* power(x,n-1);
		}
		else if(n%2==0)
		{
          int x1=x*x;
          return power(x1,n/2);
			
		}
		
		return 1;
		
	}
	
}
