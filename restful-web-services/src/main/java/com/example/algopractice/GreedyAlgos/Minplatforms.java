package com.example.algopractice.GreedyAlgos;

import java.util.Arrays;

public class Minplatforms {

	public static void main(String args[])
	{
		int start[]= {50,120,200,550,700,850};
		int dep[]= {500,550,600,700,900,1000};
		int N=6;
		System.out.println(minPaltform(start,dep,N));
	}

	private static int minPaltform(int[] start, int[] dep, int n) {
		// TODO Auto-generated method stub
		
		Arrays.sort(start);
		Arrays.sort(dep);
		
		int count=0;
		int platform=1;
		int res=1;
		int i=1;
		int minDep=dep[count];
		while(i < n )
		{
			minDep=dep[count];
			if(start[i] <= minDep)
			{
				platform++;
				i++;	
			}else if(start[i] > minDep)
			{
				count++;
				platform--;
			}
			
			if(res < platform)
			{
				res=platform;
			}
		}
		
		return res;
	}
}
