package com.arsalan.challenge.functions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Functions {
	add, multiply, addPlus;

	public static String getValues() {
		return String.join("|", Stream.of(Functions.values()).map(f -> f.name()).collect(Collectors.toList()));
	}

}
