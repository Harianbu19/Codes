package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Draggable {

	@Test
	public void sample(){
		
		System.setProperty("webdriver.chrome.driver", "D://TestLeaf//Seleniium//drivers//chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/droppable/");
	
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		WebElement droppable = driver.findElementById("draggable");
		WebElement draggable = driver.findElementById("droppable");
		Actions builder = new Actions(driver);
		builder.dragAndDrop(droppable, draggable).build().perform();
		
	}
}
