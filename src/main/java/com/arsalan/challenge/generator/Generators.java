package com.arsalan.challenge.generator;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Generators {
	prime, fibonacci;

	public static String getValues() {
		return String.join("|", Stream.of(Generators.values()).map(g -> g.name()).collect(Collectors.toList()));
	}

}
