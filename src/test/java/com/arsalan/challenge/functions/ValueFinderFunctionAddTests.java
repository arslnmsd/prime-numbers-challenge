package com.arsalan.challenge.functions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.arsalan.challenge.generator.NumbersGenerator;

@SpringBootTest
public class ValueFinderFunctionAddTests {

	@Autowired
	ValueFinderFunction add;

	@Test
	public void addFunctionTest1Plus1() {
		NumbersGenerator mockNumGen = Mockito.mock(NumbersGenerator.class);
		Mockito.when(mockNumGen.getNthNumber(0)).thenReturn(1);
		int foundValue = add.findValue(mockNumGen, 0, 0);

		assertEquals(2, foundValue);
	}

	@Test
	public void addFunctionTest1Plus2() {
		NumbersGenerator mockNumGen = Mockito.mock(NumbersGenerator.class);
		Mockito.when(mockNumGen.getNthNumber(0)).thenReturn(1);
		Mockito.when(mockNumGen.getNthNumber(1)).thenReturn(2);
		int foundValue = add.findValue(mockNumGen, 0, 1);

		assertEquals(3, foundValue);
	}

}
