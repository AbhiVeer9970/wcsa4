package testNGParallelExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG1 {
  @Test
  public void i()
  {
	  Reporter.log("i method",true);
  }
}
