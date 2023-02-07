//Задача 3. jUnit тестирование.
//1) создаем 3 класса-теста
//2) каждый из которых будет тестировать одну функцию калькулятора
//3) протестировать методы 3 наборами данных (используем Parametrize)
//4) написать 2 класса, в которых вы напишите тесты на Math библиотеку( любую функцию), объеденить их в Test Suite.
//5) добавить CalculatorTestListener, переопределить, метод который вызывается на успешное завершение теста и выводит на экран название нашего метода.

package by.academy.HW7;

import java.util.Arrays;

import org.junit.Assert;

import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

@RunWith(value = Parameterized.class)
public class CalculatorTest1 extends Assert{
	private int valueA;
	private int valueB;
	private int expected;

	public CalculatorTest1(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}
	@Parameterized.Parameters(name="{index}: max {0} or {1} = {2}")
	public static Iterable<Integer[]> dataForTest() {
		return Arrays.asList(
				new Integer[][] {   
					{ 2, 6, 6 }, 
					{ 18, 2, 18 }, 
					{ 13, 15, 28 },  });
	}

	@Test
	public void max() {
		System.out.println("@test max");
		assertEquals(expected, Math.max(valueA, valueB));
	}     
}
