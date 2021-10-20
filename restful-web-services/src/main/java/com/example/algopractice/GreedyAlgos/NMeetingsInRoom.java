package com.example.algopractice.GreedyAlgos;

import java.util.Collection;
import java.util.Comparator;
import java.util.Vector;

class Meeting{
	
	int start;
	int end;
	int pos;
	
	
	public Meeting(int start, int end, int pos) {
		super();
		this.start = start;
		this.end = end;
		this.pos = pos;
	}
	
	
}

class compareMeeting implements Comparator<Meeting>
{

	@Override
	public int compare(Meeting o1, Meeting o2) {
		// TODO Auto-generated method stub
		
		if(o1.end > o2.end)
		  return 1;
		else if(o1.end < o2.end)
			return -1;
		else if(o1.pos < o2.pos)
			return -1;
		
		return 1;
	}
	
}

public class NMeetingsInRoom {
	
	public static void main(String args[])
	{
		int N=6;
		int s[]= {1,3,0,5,8,5};
		int f[]= {2,4,6,7,9,9};
		
		int max=MaximunMeetings(s,f,N);
		System.out.println(max);
		
		
	}

	private static int MaximunMeetings(int[] s, int[] f, int n) {
		// TODO Auto-generated method stub
	
		Vector<Meeting> meetingsList=new Vector();
		Vector<Meeting> result=new Vector();
		for(int i=0;i<n;i++)
		{
			Meeting m=new Meeting(s[i],f[i],i+1);
			meetingsList.add(m);
		}
		
		java.util.Collections.sort(meetingsList, new compareMeeting());
		result.add(meetingsList.get(0));
		int minEndtime=meetingsList.get(0).end;
		for(Meeting m: meetingsList)
		{
		     if(m.start > minEndtime)
		     {
		       result.add(m);
		       minEndtime=m.end;
		     }
		   
		}
		
		return result.size();
	}
}
