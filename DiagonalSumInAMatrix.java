package com.dsa;

public class DiagonalSumInAMatrix {

	// Brute Force..
	public static void calculateDiagonalSum(int[][] matrix) {

		int sum = 0;
		int len = matrix.length;

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (i == j) {
					sum += matrix[i][j];
				} else if (i + j == len - 1) {
					sum += matrix[i][j];
				}

			}

		}
		if (len % 2 != 0) {
			sum = sum - matrix[len / 2][len / 2];
		}
		System.out.println(sum);
	}

	// Optomized approach.. O(n)
	public static void calculateDiagonalSum2(int[][] matrix) {

		int sum = 0;
		int len = matrix.length;

		for (int i = 0; i < len; i++) {
			sum += matrix[i][i];
			sum += matrix[i][len - 1 - i];
		}
		if (len % 2 != 0) {
			sum = sum - matrix[len / 2][len / 2];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		calculateDiagonalSum2(matrix);
	}

}
