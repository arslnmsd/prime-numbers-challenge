package com.arsalan.challenge.generator;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("prime")
public class PrimeNumbersGenerator implements NumbersGenerator {

	private static final List<Integer> knownPrimes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,
			47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163,
			167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277,
			281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409,
			419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541);

	@Override
	public int getNthNumber(int i) {
		int candidate, count;

		if (i < knownPrimes.size())
			return knownPrimes.get(i);
		int lastKnownPrime = knownPrimes.get(knownPrimes.size() - 1);
		for (candidate = lastKnownPrime, count = 0; count <= i; candidate++) {
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
