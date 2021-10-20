package com.example.algopractice;

public class Test {

	public static void main(String args[])
	{
		
		Test t=new Test();
		
//		System.out.println(t.fun(10,10));
		System.out.println(t.fun2(9, 2));
	}

	private  int fun(int a, int b) {
		// TODO Auto-generated method stub
		
		if(b >0 && a >0)
		{
			return 13 + fun(0,0);
		}
		return a-b;

	
	}
	
	int fun2(int a,int b)
	{
		if(a> b)
		{
			if(a>2) 
			{
				if(a>3)
				{
					if(a>4)
					{
						return b;
					}
					return b-1;
				}
			}	
		}
		
		return 1;
	}
	
	int fun3(int a,int b)
	{
		int s;
		s=2;
		a=a+2;
		b=b+a;
		a=0;
		if(a)
		{
			return a;
		
		}else
		{
			a=a+s;
			b=b+a;
		}
		return a;
	
	}
	
}
