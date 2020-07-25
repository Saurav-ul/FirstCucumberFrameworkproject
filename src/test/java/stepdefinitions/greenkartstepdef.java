package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import FirstCucumberFrameworkpackage.FirstCucumberFrameworkproject.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.FirstHomepage;


public class greenkartstepdef extends Baseclass{
	
		public WebDriver driver;
		FirstHomepage fh;

	 	@Given("^User is on Greenkart home page$")
	    public void user_is_on_greenkart_home_page() throws Throwable {
	 		driver= Baseclass.getdriver();
	        
	    }

	    @When("^User search for \"([^\"]*)\"$")
	    public void user_search_for_something(String strArg1) throws Throwable {
	        fh= new FirstHomepage(driver);
	        fh.getsearch().sendKeys(strArg1);
	        Thread.sleep(3000);
	    }

	    @Then("^\"([^\"]*)\" details are displayed$")
	    public void something_details_are_displayed(String strArg1) throws Throwable {
	    	String str=driver.findElement(By.cssSelector("h4.product-name")).getText();
	    	if (str.equals(strArg1)){
	    		System.out.println("Matched");
	    	}
	    }
}
