package com.dsa;

public class SpiralMatrix {

	public static void printSpiralMatrix(int[][] matrixArr) {
		int startingRow = 0;
		int endingRow = matrixArr.length - 1;
		int startingColumn = 0;
		int endingColumn = matrixArr[0].length - 1;

		while (startingRow <= endingRow && startingColumn <= endingColumn) {

			for (int i = 0; i < endingRow; i++) {
				System.out.print(matrixArr[startingRow][i] + " ");
			}

			for (int i = startingRow; i < endingRow; i++) {
				if (startingRow == endingRow) {
					break;
				}
				System.out.print(matrixArr[i][endingColumn] + " ");
			}
			for (int i = endingColumn; i > 0; i--) {
				System.out.print(matrixArr[endingRow][i] + " ");
			}
			for (int i = endingRow; i > startingRow + 1; i--) {
				if (startingColumn == endingColumn) {
					break;
				}
				System.out.print(matrixArr[i][startingColumn] + " ");
			}
			startingRow++;
			endingRow--;
			startingColumn++;
			endingColumn--;

		}

	}

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		printSpiralMatrix(matrix);
	}

}
