package testNGParallelExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG2 {
  @Test
  public void f() 
  {
	  Reporter.log("f method",true);
  }
}
