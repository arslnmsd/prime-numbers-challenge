package com.arsalan.challenge;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class PrintSumOfPrimeNumbersTests {
	@Autowired
	private PrintSumOfPrimeNumbers printSumOfPrimeNumbers;

	@Test
	void creates3x3Array() {
		int n = 3;
		int[][] array = printSumOfPrimeNumbers.createNxNArray(n);
		Assert.isTrue(array.length == 3, "Array length of first dimension is not satisfied");
		Assert.isTrue(array[n - 1].length == 3, "Array length of second dimension is not satisfied");
	}

	@Test
	void creates3x4Array() {
		int n = 3;
		int[][] array = printSumOfPrimeNumbers.createNxNArray(n);
		Assert.isTrue(array.length == 3, "Array length of first dimension is not satisfied");
		Assert.isTrue(array[n - 1].length != 4, "Array length of second dimension is not satisfied");
	}

	@Test
	void fillValueTest() {
		int value = 4;
		int[][] array = printSumOfPrimeNumbers.createNxNArray(6);
		printSumOfPrimeNumbers.setValueAtArrayLocation(array, 0, 0, value);
		Assert.isTrue(array[0][0] == 4, "Value is not same");
	}

}
