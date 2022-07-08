package listing;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeSuite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class list {
	public static WebDriver driver; // global
	public static elementfind ele;

	@Test
	public void destinations() {
		ele.destination();
	}

	@BeforeSuite
	public void beforeSuite() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.umrahme.com/home/en-sa");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		ele = new elementfind(driver);
	}

	@AfterSuite
	public void afterSuite() {
		//driver.quit();
	}

}
