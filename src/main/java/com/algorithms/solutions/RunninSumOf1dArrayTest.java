package com.algorithms.solutions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RunninSumOf1dArrayTest {
	
	@Test
	public void runninSumOf1dArrayTest() {
		int[] items =  new int[]{1,2,3,4};
		int[] expected =  new int[]{1,3,6,10};
		
		RunningSumOf1dArray runningSumOf1dArray = new RunningSumOf1dArray();
		int[] result = runningSumOf1dArray.runningSum(items);
		assertEquals(expected[0], result[0]);
		assertEquals(expected[1], result[1]);
		assertEquals(expected[2], result[2]);
		assertEquals(expected[3], result[3]);
	}
}
