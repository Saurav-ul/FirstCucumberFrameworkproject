package testrunner;

import FirstCucumberFrameworkpackage.FirstCucumberFrameworkproject.Baseclass;
import io.cucumber.java.After;

public class gkhook extends Baseclass{

	@After("@Seltest")
	public void postrequisitetest() {
		//System.out.println("driver closed");
		driver.close();
	}
	
}
