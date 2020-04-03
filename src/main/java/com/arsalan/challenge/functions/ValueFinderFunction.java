package com.arsalan.challenge.functions;

import com.arsalan.challenge.generator.NumbersGenerator;

@FunctionalInterface
public interface ValueFinderFunction {

	Integer findValue(NumbersGenerator g, Integer r, Integer c);

}
