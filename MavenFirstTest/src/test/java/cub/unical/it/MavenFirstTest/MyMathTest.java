package cub.unical.it.MavenFirstTest;
import static junit.framework.Assert.assertEquals;

import org.junit.Test;


public class MyMathTest {
	@Test
	public void fibonacciTest1() {
		MyMath math = new MyMath();
		assertEquals(8, math.fibonacci(5));
		System.out.println("test1");
	}
	
	@Test
	public void fibonacciTest2() {
		MyMath math = new MyMath();
		assertEquals(1, math.fibonacci(0));
		System.out.println("test2");
		
	}
	

}
