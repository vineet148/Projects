package com.example.algopractice.GeneralProblems;

import java.util.Comparator;

import javafx.util.Pair;

public class CompareObject implements Comparator<Pair> {

	@Override
	public int compare(Pair o1, Pair o2) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int x1 = Integer.parseInt(o1.getKey().toString());
		int x2 = Integer.parseInt(o2.getKey().toString());
		if (x1 > x2)
			return 1;
		else if (x1 < x2)
			return -1;

		return 1;

	}

}
