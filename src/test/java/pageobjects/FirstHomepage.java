package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstHomepage {

	public WebDriver driver;
	
	public FirstHomepage(WebDriver driver) {
		this.driver=driver;
	}
	
	By search= By.xpath("//input[@type='search']");
	
	public WebElement getsearch() {
		return driver.findElement(search);
	}
	
	
}
