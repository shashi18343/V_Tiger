package practice_maven;

import org.testng.annotations.Test;

public class DetailsCreateNew {
  @Test
  public void create() {
	  
	  String BROWSER = System.getProperty("browser");
	//  String BROWSER = System.getProperty("chrome");   //will print "null"
	 // String BROWSER = "chrome";    prints chrome in console
	  String URL = System.getProperty("url");
	  String USERNAME = System.getProperty("username");
	  String PASSWORD = System.getProperty("password");
	  
	  System.out.println(BROWSER);
	  System.out.println(URL);
	  System.out.println(USERNAME);
	  System.out.println(PASSWORD);
  }
}
