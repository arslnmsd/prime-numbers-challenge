package com.arsalan.challenge;

import org.springframework.stereotype.Service;

@Service
public class PrimeNumbersGenerator {

	public int getNthPrime(int i) {
		int candidate, count;
		for (candidate = 2, count = 0; count <= i; candidate++) {
			if (isPrime(candidate)) {
				count++;
			}
		}
		return candidate - 1;
	}

	boolean isPrime(int num) {
		boolean prime = true;
		int limit = (int) Math.sqrt(num);

		for (int i = 2; i <= limit; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}

}
