package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityClass {
	@Test(priority = 3)
	public void z() {
		Reporter.log("z", true);
	}

	@Test(priority = 2)
	public void m1() {
		Reporter.log("m1", true);
	}

	@Test(priority = -1)
	public void d1() {
		Reporter.log("d1", true);
	}

	@Test(priority = 4)
	public void j1() {
		Reporter.log("j1", true);
	}
}
