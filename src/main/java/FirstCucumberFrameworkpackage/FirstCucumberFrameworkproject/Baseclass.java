package FirstCucumberFrameworkpackage.FirstCucumberFrameworkproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

	public static WebDriver driver;
	public static Properties prop;
	
	public static WebDriver getdriver() throws IOException {
		prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\RAJIB KUMAR SINGH\\eclipse-workspace\\FirstCucumberFrameworkproject\\src\\main\\java\\FirstCucumberFrameworkpackage\\FirstCucumberFrameworkproject\\global.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver= new ChromeDriver();
        
        driver.get(prop.getProperty("url"));
        
        return driver;
	}
}
