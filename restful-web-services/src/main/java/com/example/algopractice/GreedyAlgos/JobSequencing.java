package com.example.algopractice.GreedyAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class CompareJobs implements Comparator<Job> {

	@Override
	public int compare(Job o1, Job o2) {
		// TODO Auto-generated method stub
		if (o1.profit > o2.profit)
			return -1;
		else if (o1.profit < o2.profit)
			return 1;

		return 1;

	}

}

class Job {
	int id;
	int deadline;
	int profit;

	public Job(int id, int deadline, int profit) {
		super();
		this.id = id;
		this.deadline = deadline;
		this.profit = profit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDeadline() {
		return deadline;
	}

	public void setDeadline(int deadline) {
		this.deadline = deadline;
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

}

public class JobSequencing {

	public static void main(String args[]) {
		ArrayList<Job> jobList = new ArrayList<>();

		Job job1 = new Job(6, 2, 80);
		Job job2 = new Job(3, 6, 70);
		Job job3 = new Job(4, 6, 65);
		Job job4 = new Job(2, 5, 60);
		Job job5 = new Job(5, 4, 25);
		Job job6 = new Job(8, 2, 22);
		Job job7 = new Job(1, 4, 20);
		Job job8 = new Job(7, 2, 10);

		jobList.add(job1);
		jobList.add(job2);
		jobList.add(job3);
		jobList.add(job4);
		jobList.add(job5);
		jobList.add(job6);
		jobList.add(job7);
		jobList.add(job8);

		jobSeq(jobList);
	}

	private static void jobSeq(ArrayList<Job> jobList) {
		// TODO Auto-generated method stub
		Collections.sort(jobList, new CompareJobs());
		int mxDeadline=0;
		for(int k=0;k < jobList.size();k++)
		{
			 if(jobList.get(k).getDeadline() > mxDeadline)
			 mxDeadline=jobList.get(k).getDeadline();
		}
		int n=mxDeadline;
		Integer[] seq1 = new Integer[n + 1];
		for (int i = 0; i < n; i++) {
			seq1[i + 1] = -1;
		}
		for (int j = 0; j < jobList.size(); j++) {

			int deadline = jobList.get(j).getDeadline();
			int id = jobList.get(j).getId();

			for(int k=deadline; k>0;k-- )
			{
				if (seq1[k] == -1)
				{
					seq1[k]=id;
					break;
				}
			}
		}
		
		
		for(int l=1;l< seq1.length;l++)
		{
			System.out.println(l+" -->"+seq1[l]);
		}

	}
}
