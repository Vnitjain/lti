package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.example.demo.model.MathsOperation;

public class TestMyMathOperation
{
	MathsOperation mo=new MathsOperation();

	@Test
	public void testMe()
	{
		assertEquals(11, mo.add(5, 5));
			}
	
	@Test
	public void testCase2()
	{
		assertNotEquals(15, mo.add(3, 7));

	}
}
