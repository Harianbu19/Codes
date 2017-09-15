package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flipkart {
	@Test
	public void sample() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "D://TestLeaf//Seleniium//drivers//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

		WebElement first = driver.findElementByXPath("//span[contains(text(),'Electronics')]");
		WebElement second = driver.findElementByXPath("//span[contains(text(),'Smart Watches')]");

		Actions builder = new Actions(driver);
		builder.moveToElement(first).build().perform();
		Thread.sleep(3000);
		builder.click(second).build().perform();

	}

}
