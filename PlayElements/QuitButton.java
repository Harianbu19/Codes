package PlayElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class QuitButton {
	public static void quit(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[2]/a/img")).click();
		driver.findElement(By.id("home")).click();		
	}
	public static void quitlocation(WebDriver driver){
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[2]/a/img")).click();
		Point location = driver.findElement(By.id("position")).getLocation();
		System.out.println(">>The position of button is = "  + location);
	}
	public static void quitcolor(WebDriver driver){
		String color = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(">>The color of button is : " + color);
	}
	public static void quithtwd(WebDriver driver){
		Dimension ht = driver.findElement(By.id("size")).getSize();
		System.out.println(">>The Height and Width is : " + ht);
		//driver.findElement(By.xpath("//*[@id='text-2']/a/img")).click();
	}
	public static void pageheading(WebDriver driver){
		String head = driver.findElement(By.tagName("h1")).getText();
		System.out.println(">>The Page Heading is : " + head);
		driver.findElement(By.xpath("//*[@id='text-2']/a/img")).click();
	}
}
