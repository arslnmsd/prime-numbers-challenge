package com.arsalan.challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrintSumOfPrimeNumbers {

	@Autowired
	private PrimeNumbersGenerator primeNumbersGenerator;

	public void main(String[] args) {
		try {
			int n;
			if (args.length > 0) {
				n = Integer.valueOf(args[0]);
				int[][] array = createNxNArray(n);
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						int valueToFill = primeNumbersGenerator.getNthPrime(i) + primeNumbersGenerator.getNthPrime(j);
						setValueAtArrayLocation(array, i, j, valueToFill);
					}
				}
				print2DArray(array);
			} else {
				System.out.println("Please provide a number argument ");
			}

		} catch (NumberFormatException nfe) {
			System.out.println("first argument is not a number");
		}
	}

	public void setValueAtArrayLocation(int[][] array, int i, int j, int value) {
		array[i][j] = value;
	}

	public int[][] createNxNArray(int n) {
		return new int[n][n];
	}

	public void print2DArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

}
