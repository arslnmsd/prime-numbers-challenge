package com.arsalan.challenge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PrimeNumbersGeneratorTests {

	@Autowired
	PrimeNumbersGenerator primeNumberGenerator;

	@Test
	public void generate0thPrimeNumberTest() {
		assertEquals(2, primeNumberGenerator.getNthPrime(0));
	}

	@Test
	public void generate1stPrimeNumberTest() {
		assertEquals(3, primeNumberGenerator.getNthPrime(1));
	}

	@Test
	public void generate2ndPrimeNumberTest() {
		assertEquals(5, primeNumberGenerator.getNthPrime(2));
	}

	@Test
	public void checkNumberIfPrimeForPrimeNumber2() {
		assertEquals(true, primeNumberGenerator.isPrime(2));
	}

	@Test
	public void checkNumberIfPrimeForPrimeNumber5() {
		assertEquals(true, primeNumberGenerator.isPrime(5));
	}

	@Test
	public void checkNumberIfPrimeForNonPrimeNumber4() {
		assertEquals(false, primeNumberGenerator.isPrime(4));
	}

	@Test
	public void checkNumberIfPrimeForNonPrimeNumber6() {
		assertEquals(false, primeNumberGenerator.isPrime(4));
	}

}
