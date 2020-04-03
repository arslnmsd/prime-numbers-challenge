package com.arsalan.challenge.functions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.arsalan.challenge.generator.NumbersGenerator;

@SpringBootTest
public class ValueFinderFunctionMultiplyTests {

	@Autowired
	ValueFinderFunction multiply;

	@Test
	public void addFunctionTest1Multiply1() {
		NumbersGenerator mockNumGen = Mockito.mock(NumbersGenerator.class);
		Mockito.when(mockNumGen.getNthNumber(0)).thenReturn(1);
		int foundValue = multiply.findValue(mockNumGen, 0, 0);

		assertEquals(1, foundValue);
	}

	@Test
	public void addFunctionTest2Multiply2() {
		NumbersGenerator mockNumGen = Mockito.mock(NumbersGenerator.class);
		Mockito.when(mockNumGen.getNthNumber(0)).thenReturn(2);
		int foundValue = multiply.findValue(mockNumGen, 0, 0);

		assertEquals(4, foundValue);
	}

	@Test
	public void addFunctionTest1Multiply2() {
		NumbersGenerator mockNumGen = Mockito.mock(NumbersGenerator.class);
		Mockito.when(mockNumGen.getNthNumber(0)).thenReturn(1);
		Mockito.when(mockNumGen.getNthNumber(1)).thenReturn(2);
		int foundValue = multiply.findValue(mockNumGen, 0, 1);

		assertEquals(2, foundValue);
	}

}
