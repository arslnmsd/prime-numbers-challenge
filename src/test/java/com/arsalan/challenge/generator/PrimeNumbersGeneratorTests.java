package com.arsalan.challenge.generator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.arsalan.challenge.generator.PrimeNumbersGenerator;

@SpringBootTest(properties = { "logging.level.root=WARN", "spring.main.banner-mode=off" })
public class PrimeNumbersGeneratorTests {

	@Autowired
	PrimeNumbersGenerator primeNumberGenerator;

	@Test
	public void generate0thPrimeNumberTest() {
		assertEquals(2, primeNumberGenerator.getNthNumber(0));
	}

	@Test
	public void generate1stPrimeNumberTest() {
		assertEquals(3, primeNumberGenerator.getNthNumber(1));
	}

	@Test
	public void generate2ndPrimeNumberTest() {
		assertEquals(5, primeNumberGenerator.getNthNumber(2));
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
