package listing;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class elementfind {
	public WebDriver driver;
	
	//package selection
	@FindBy(xpath = ".//span[@title='Select Destination']")
	private WebElement dest;

	public void destination() {
		System.out.println("this is destination");
		//is displayed and clickable
		dest.click();
	
		WebElement desti = driver.findElement(By.xpath(".//input[@class='select2-search__field']"));
		assertTrue(desti.isDisplayed(), "IS DISPLAYED");
		desti.sendKeys("Makkah Only Package",
				Keys.ENTER);
				
	}
	
//	@FindBy(xpath=)

	public elementfind(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		PageFactory.initElements(driver, this);

	}
}

//