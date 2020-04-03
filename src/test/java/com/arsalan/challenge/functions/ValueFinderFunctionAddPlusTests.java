package com.arsalan.challenge.functions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.arsalan.challenge.generator.NumbersGenerator;

@SpringBootTest
public class ValueFinderFunctionAddPlusTests {

	@Autowired
	ValueFinderFunction addPlus;

	@Test
	public void addFunctionTest1Plus1() {
		int r = 1, c = 1;
		NumbersGenerator mockNumGen = Mockito.mock(NumbersGenerator.class);
		Mockito.when(mockNumGen.getNthNumber(r + c + 1)).thenReturn(1);
		int foundValue = addPlus.findValue(mockNumGen, r, c);

		assertEquals(1, foundValue);
	}

	@Test
	public void addFunctionTest2Plus2() {
		int r = 2, c = 2;
		NumbersGenerator mockNumGen = Mockito.mock(NumbersGenerator.class);
		Mockito.when(mockNumGen.getNthNumber(r + c + 1)).thenReturn(4);
		int foundValue = addPlus.findValue(mockNumGen, r, c);

		assertEquals(4, foundValue);
	}

}
