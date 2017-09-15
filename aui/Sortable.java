package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sortable {
	@Test
	public void sample(){

		System.setProperty("webdriver.chrome.driver", "D://TestLeaf//Seleniium//drivers//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/sortable/");
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));

		WebElement item1 = driver.findElementByXPath("//ul[@id='sortable']/li[1]");
		//		TO GET LOCATION OF target item
		//		int item4 = driver.findElementByXPath("//ul[@id='sortable']/li[4]").getLocation().getY();
		//		System.out.println(item4);
		//		WebElement item4 = driver.findElementByXPath("//ul[@id='sortable']/li[4]");


		Actions builder = new Actions(driver);
		builder.dragAndDropBy(item1, 0, 140).release().build().perform();
	}
}
