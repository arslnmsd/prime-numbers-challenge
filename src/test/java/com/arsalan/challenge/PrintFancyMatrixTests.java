package com.arsalan.challenge;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.arsalan.challenge.functions.ValueFinderFunction;
import com.arsalan.challenge.generator.NumbersGenerator;

@SpringBootTest(properties = { "logging.level.root=WARN", "spring.main.banner-mode=off" })
class PrintFancyMatrixTests {
	@Autowired
	private PrintFancyMatrix printFancyMatrix;

	@Test
	void creates3x3Array() {
		int r = 3, c = 3;
		int[][] array = printFancyMatrix.createRxCArray(r, c);
		assertEquals(array.length, r, "Array length of first dimension is not satisfied");
		assertEquals(array[r - 1].length, c, "Array length of second dimension is not satisfied");
	}

	@Test
	void creates3x4Array() {
		int r = 3, c = 4;
		int[][] array = printFancyMatrix.createRxCArray(r, c);
		assertEquals(array.length, r, "Array length of first dimension is not satisfied");
		assertEquals(array[r - 1].length, c, "Array length of second dimension is not satisfied");
	}

	@Test
	void fillArrayWithValuesTest() {
		NumbersGenerator mockNumGen = Mockito.mock(NumbersGenerator.class);
		ValueFinderFunction valueFinder = Mockito.mock(ValueFinderFunction.class);

		Mockito.when(mockNumGen.getNthNumber(0)).thenReturn(1);
		Mockito.when(mockNumGen.getNthNumber(1)).thenReturn(2);

		Mockito.when(valueFinder.findValue(mockNumGen, 0, 0)).thenReturn(1);
		Mockito.when(valueFinder.findValue(mockNumGen, 0, 1)).thenReturn(2);
		Mockito.when(valueFinder.findValue(mockNumGen, 1, 0)).thenReturn(3);
		Mockito.when(valueFinder.findValue(mockNumGen, 1, 1)).thenReturn(4);

		int[][] array = new int[2][2];

		printFancyMatrix.fillArray(array, mockNumGen, valueFinder);

		assertEquals(array[0][0], 1, "Matrix cell 0,0 has unexpected value");
		assertEquals(array[0][1], 2, "Matrix cell 0,1 has unexpected value");
		assertEquals(array[1][0], 3, "Matrix cell 1,0 has unexpected value");
		assertEquals(array[1][1], 4, "Matrix cell 1,1 has unexpected value");

	}

}
