package com.example.algopractice.GeneralProblems;

public class RotateImage {

	public static void main(String args[]) {
		int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int size = mat.length;

		System.out.println("before rotation");
		printMatrix(mat, size);
		for (int i = 0; i < size; i++) {
			for (int j = i; j < mat[i].length; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;

			}
		}

		System.out.println("after transpose");
		printMatrix(mat, size);

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < mat[i].length/2; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[i][mat[i].length - 1 - j];
				mat[i][mat[i].length - 1 - j] = temp;
			}
		}
		
		System.out.println("final rotated matrix");
		printMatrix(mat, size);

	}

	private static void printMatrix(int[][] mat, int size) {
		// TODO Auto-generated method stub

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(" " + mat[i][j]);
			}
			System.out.println("\n");
		}

	}

}
