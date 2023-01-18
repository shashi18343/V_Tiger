package practice_maven;

import org.testng.annotations.Test;

public class Sample2Test
{
  @Test(groups = "regression")
  public void createProduct2Test() 
  {
	System.out.println("--product created successfully--");  
  }
  
  @Test(groups = "smoke")
  public void updateProduct2Test()
  {
	  System.out.println("--Product updated--");
  }
}
