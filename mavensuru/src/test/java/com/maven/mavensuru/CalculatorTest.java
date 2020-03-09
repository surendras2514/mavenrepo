package com.maven.mavensuru;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class CalculatorTest {
	
	Calculator calc;
	
	@Before
	public void before()
	{
		System.out.println("before");
		calc=new Calculator();
	}

	@Test
	public void testDivide() {
		calc=new Calculator();
		assertEquals(2,calc.divide(10, 5));		
	}
	
	@Test
	public void add() {
		assertEquals("Result",11, calc.add(1, 9));
	}

}
