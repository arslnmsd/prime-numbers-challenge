package com.arsalan.challenge;

import org.springframework.stereotype.Service;

import com.arsalan.challenge.functions.ValueFinderFunction;
import com.arsalan.challenge.generator.NumbersGenerator;

@Service
public class PrintFancyMatrix {

	public void main(int rows, int columns, NumbersGenerator generator, ValueFinderFunction valueFinderFunction) {
		int[][] array = createRxCArray(rows, columns);
		fillArray(array, generator, valueFinderFunction);
		print2DArray(array);

	}

	void fillArray(int[][] array, NumbersGenerator generator, ValueFinderFunction valueFinderFunction) {
		int rows = array.length;
		int columns = array[rows - 1].length;

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < columns; c++) {
				array[r][c] = valueFinderFunction.findValue(generator, r, c);
			}
		}
	}

	int[][] createRxCArray(int rows, int columns) {
		return new int[rows][columns];
	}

	@Deprecated
	int[][] createNxNArray(int n) {
		return new int[n][n];
	}

	void print2DArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

}
