package by.academy.HW7;

import org.junit.Assert;
import org.junit.Test;

public class MathFunction1 extends Assert {

	@Test
	public void max() {
		System.out.println("@test max");
		assertEquals(3, Math.max(2, 3));
	}
}
