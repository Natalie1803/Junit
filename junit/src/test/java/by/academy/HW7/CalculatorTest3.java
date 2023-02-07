package by.academy.HW7;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class CalculatorTest3 extends Assert{
	private int valueA;
	private int valueB;
	private int expected;
	
	public CalculatorTest3(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}
	
	@Parameterized.Parameters(name="{index}: divide {0} / {1} = {2}")
	public static Iterable<Integer[]> dataForTest() {
		return Arrays.asList(
				new Integer[][] { 
					{ 1, 1, 1 }, 
					{ 4, 2, 2 }, 
					{ 7, 8, 15 }, 
					});
	}

	@Test
	public void divideTest() {
		System.out.println("@test divideTest");
		assertEquals(expected, valueA/valueB);
	}

}
