package practice_maven;

import org.testng.annotations.Test;

public class Sample1Test {
  @Test(groups = "smoke")
  public void createCustomer1Test() 
  {
	System.out.println("--customer created successfully--");  
  }
  
  @Test(groups = "regression")
  public void updateCustomer1Test()
  {
	  System.out.println("--customer updated--");
  }
}
