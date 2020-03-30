package com.arsalan.challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HubbadoChallengeApplication implements CommandLineRunner {

	@Autowired
	private PrintSumOfPrimeNumbers printSumOfPrimeNumbers;

	public static void main(String[] args) {
		SpringApplication.run(HubbadoChallengeApplication.class, args);
	}

	@Override
	public void run(String... args) {
		printSumOfPrimeNumbers.main(args);
	}

}
