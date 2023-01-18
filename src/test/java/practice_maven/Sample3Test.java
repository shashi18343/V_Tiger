package practice_maven;

import org.testng.annotations.Test;

public class Sample3Test {
  @Test(groups = "smoke")
  public void createProduct3Test() 
  {
	System.out.println("--product2 created successfully--");  
  }
  
  @Test(groups = "smoke")
  public void updateProduct3Test()
  {
	  System.out.println("--Product2 updated--");
  }
}
