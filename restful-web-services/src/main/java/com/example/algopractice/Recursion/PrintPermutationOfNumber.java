package com.example.algopractice.Recursion;

public class PrintPermutationOfNumber {

	public static void main(String args[]) {
		int n = 4;
		int r = 2;
		Integer boxes[] = new Integer[n];
		for(int i=0;i<n;i++)
		{
			boxes[i]=0;
			
		}
	
		printPerm(boxes, 1, 2);
	}

	private static void printPerm(Integer[] boxes, int currentItem, int totalItems) {
		// TODO Auto-generated method stub

		
		if (currentItem > totalItems) {
			for (int e : boxes) {
				System.out.print(e);
			}
			System.out.println();

			return;
		}

		for (int i = 0; i < boxes.length; i++) {
			if (boxes[i] == 0) {
				boxes[i] = currentItem;
				printPerm(boxes, currentItem + 1, totalItems);
				boxes[i] = 0;
			}

		}

	}

}
