package practice_maven;

import org.testng.annotations.Test;

public class Sample4Test {
	@Test(groups = "regression")
public void createProduct3Test() 
{
	System.out.println("--product3 created successfully--");  
}

@Test(groups = "regression")
public void updateProduct3Test()
{
	  System.out.println("--Product3 updated--");
}
}
