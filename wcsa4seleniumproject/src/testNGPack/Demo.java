package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void f() {
		// System.out.println("this is method of Demo class");
		Reporter.log("this is method of Demo class**", true);
	}

	@Test
	private void demo1() {
		Reporter.log("this is demo1 method", true);
	}

	@Test
	private void demo2() {
		int a = 10;
		int b = 2;
		int r = a / b;
		Reporter.log("this is demo2 method", true);
	 }
}
