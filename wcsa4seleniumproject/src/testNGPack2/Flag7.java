package testNGPack2;

import org.testng.Assert;
import org.testng.DependencyMap;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
	@Test
	public void m1() {
		Assert.fail();
		Reporter.log("m1 method");
	}

	@Test(dependsOnMethods = "m1", alwaysRun = true)
	public void m2() {
		Reporter.log("m2 method");
	}

}
