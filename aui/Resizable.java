package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Resizable {

	@Test
	public void sample(){

		System.setProperty("webdriver.chrome.driver", "D://TestLeaf//Seleniium//drivers//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/resizable/");
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		WebElement item1= driver.findElementByXPath("//div[@id='resizable']/div[3]");
		
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(item1, 60, 60).build().perform();
	}
}