package com.arsalan.challenge.generator;

public interface NumbersGenerator {

	default int getNthNumber(int i) {
		return i + 1;
	}
	
	

}
