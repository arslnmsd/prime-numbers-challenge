package com.arsalan.challenge.generator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = { "logging.level.root=WARN", "spring.main.banner-mode=off" })
public class FibonacciNumbersGeneratorTests {

	@Autowired
	FibonacciNumbersGenerator fibonacciNumberGenerator;

	@Test
	public void generate0thFibonacciNumberTest() {
		assertEquals(1, fibonacciNumberGenerator.getNthNumber(0));
	}

	@Test
	public void generate1stFibonacciNumberTest() {
		assertEquals(1, fibonacciNumberGenerator.getNthNumber(1));
	}

	@Test
	public void generate2ndFibonacciNumberTest() {
		assertEquals(2, fibonacciNumberGenerator.getNthNumber(2));
	}

	@Test
	public void generate4thFibonacciNumberTest() {
		assertEquals(5, fibonacciNumberGenerator.getNthNumber(4));
	}

	@Test
	public void generate46thFibonacciNumberTest() {
		assertThrows(IndexOutOfBoundsException.class, () -> {
			fibonacciNumberGenerator.getNthNumber(46);
		});
	}

	@Test
	public void generate50thFibonacciNumberTest() {
		assertThrows(IndexOutOfBoundsException.class, () -> {
			fibonacciNumberGenerator.getNthNumber(50);
		});
	}

}
