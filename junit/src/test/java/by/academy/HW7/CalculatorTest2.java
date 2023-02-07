package by.academy.HW7;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class CalculatorTest2 extends Assert {
	private int valueA;
	private int valueB;
	private int expected;

	public CalculatorTest2(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}
	
	@Parameterized.Parameters(name="{index}: sum {0} and {1} = {2}")
	public static Iterable<Integer[]> dataForTest() {
		return Arrays.asList(
				new Integer[][] { 
					{ 1, 1, 2 }, 
					{ 2, 3, 5 }, 
					{ 7, 8, 15 }, 
					});
	}

	@Test
	public void sumTest() {
		System.out.println("@test sumTest");
		assertEquals(expected, valueA+valueB);
	}
}
