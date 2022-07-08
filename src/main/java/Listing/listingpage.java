


/**
 * 
 */
package Listing;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Lenovo
 *
 */
public class listingpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver river = new ChromeDriver();
		// river.manage().window().maximize();
		river.get("https://www.umrahme.com/home/en-sa");
		river.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		
		
		//pakaGE code
		river.findElement(By.id("select2-RouteCode-container")).click();	
		river.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Makkah Only Package" , Keys.ENTER);
		

		// date
		String date = "23";
		String month = "july";
		String year = "2022";
		river.findElement(By.id("StartDate")).click();

		while (true) {
			String monyear = river.findElement(By.xpath("/html/body/div[6]/div[1]/table/thead/tr[2]/th[2]")).getText();
			String arr[] = monyear.split(" ");
			String mon = arr[0];
			String yea = arr[1];
			if (mon.equalsIgnoreCase(month) && yea.equals(year))
			{System.out.print(" ");}
			else
				river.findElement(By.xpath("/html/body/div[6]/div[1]/table/thead/tr[2]/th[3]")).click();

			// picking date
			List<WebElement> allates = river.findElements(By.xpath("/html/body/div[6]/div[1]/table/tbody/tr/td"));

			for (WebElement ele : allates) {
				String dt = ele.getText();
				if (dt.equals(date)) {
					ele.click();
					break;
				}
			}

			break;
		}
		

		// stay in mecca
		WebElement element3 = river.findElement(By.id("meccaCityNight"));
		Select sel3 = new Select(element3);
		sel3.selectByIndex(7);
		WebElement elem3 = sel3.getFirstSelectedOption();
		//System.out.println("first element=" + elem3.getText());

//		List<WebElement> listOptions3 = sel3.getOptions();
//		for (WebElement webelements3 : listOptions3) {
//			System.out.println("options-" + webelements3.getText());
//
//		}
		
		
		// stay in madina
		WebElement element4 = river.findElement(By.id("madinaCityNight"));
		Select sel4 = new Select(element4);
		sel4.selectByIndex(7);
		WebElement elem4 = sel4.getFirstSelectedOption();
		//System.out.println("first element=" + elem4.getText());

//		List<WebElement> listOptions4 = sel4.getOptions();
//		for (WebElement webelements4 : listOptions4) {
//			System.out.println("options-" + webelements4.getText());
//		}

		
		//traveler adult
	
				river.findElement(By.xpath(".//span[@class='total-traveller']")).click();
				WebElement element10 = river.findElement(By.xpath(".//label[contains(.,'Adults')]/preceding-sibling::select"));
				element10.click();
				Select sel10 = new Select(element10);
				sel10.selectByIndex(3);
				
//				WebElement elem10 = sel10.getFirstSelectedOption();
//				System.out.println("first element=" + elem10.getText());
				
//				List<WebElement> listOptions10 = sel10.getOptions();
//				for (WebElement webelements10 : listOptions10) {
//					System.out.println("options-" + webelements10.getText());
//				}
				
			//children occupancy				
				
				WebElement child = river.findElement(By.xpath(".//select[@class='floating-select select-child']"));
				Select Child = new Select(child);
				Child.selectByIndex(1);
				for(int i=1;i<=1;i++) {
				int var=1;
				int xi=i;
				//System.out.println(" Nage "+1);
				//System.out.print("var="+var);
				System.out.println("enter "+i+"th childs age");
				Scanner scit = new Scanner(System.in);
				String b = scit.nextLine();
				
				String x="//ul[@class=\"age-wrap\"]/li["+xi+"]/select";
				WebElement element101= river.findElement(By.xpath(x));
				Select sel101 = new Select(element101);
				sel101.selectByValue(b);
				
				}
			river.findElement(By.xpath("//*[@id=\"frmHomeSearch\"]/div/div/div[5]/div[1]/p/i[2]")).click();
		
		// CountryOfResidence
		WebElement element6 = river.findElement(By.id("CountryOfResidence"));
		Select sel6 = new Select(element6);
		sel6.selectByValue("us");
		WebElement elem6 = sel6.getFirstSelectedOption();
		System.out.println("country of residency=" + elem6.getText());

//		 List<WebElement> listOptions6=sel6.getOptions();
//		 for(WebElement webelements6:listOptions6) {
//		 System.out.println("options-"+webelements6.getText());
//		 }
		
		
		// Nationality
		WebElement element7 = river.findElement(By.id("Nationality"));
		Select sel7 = new Select(element7);
		sel7.selectByValue("us");
		WebElement elem7 = sel7.getFirstSelectedOption();
		System.out.println("Nationality=" + elem7.getText());
		
//		 List<WebElement> listOptions7=sel7.getOptions();
//		 for(WebElement webelements7:listOptions7) {
//		 System.out.println("options-"+webelements7.getText());
//		 }
		 
		
		// Search button
				river.findElement(By.id("btnSearchPackage")).click();
				Thread.sleep(5000);
		river.quit();

	}

}
