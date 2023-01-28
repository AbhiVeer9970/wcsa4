package testNGParallelExecution;

import java.sql.Driver;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG3 {
	@Test
	public void today() throws InterruptedException {
		long threadId = Thread.currentThread().getId();

		Reporter.log("today method" + threadId + "is the thread", true);
	}
	@Test
	public void tomarrow() {
		long threadId = Thread.currentThread().getId();
		Reporter.log("tomarrow method" + threadId + "is the thread", true);
	}

}
