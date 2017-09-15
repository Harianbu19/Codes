package PlayElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HyperLink {

	public static void link(WebDriver driver) throws InterruptedException{
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[3]/a/img")).click();
		driver.findElement(By.linkText("Go to Home Page")).click();
		Thread.sleep(3000);
	}
	public static void link2(WebDriver driver) throws InterruptedException{
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[3]/a/img")).click();
		driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
		Thread.sleep(3000);
	}
//	public static void link3(WebDriver driver) throws InterruptedException{
//		driver.findElement(By.xpath("//*[@id='text-2']/a/img")).click();
//		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[3]/a/img")).click();
//		 broken = driver.findElement(By.linkText("Verify am I broken?")).click();
//		driver.navigate().back();
//		Thread.sleep(3000);
//	}
	public static void link4(WebDriver driver) throws InterruptedException{
 		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		List<WebElement> allLinks = driver.findElements(By.linkText("How many links are available in this page?"));
		System.out.println("Total Links : " + allLinks.size());
		for (int i = 0; i<=allLinks.size(); i++)
		{
			System.out.println("Link are : " + allLinks.get(i).getText());
		}
		//Dimension x = driver.findElement(By.linkText("How many links are available in this page?")).getSize();
		//System.out.println(x.get);
		//System.out.println(">>NO. of links are available in this page : " + x);
		//Thread.sleep(3000);
	}
	public static void heading(WebDriver driver){
		String head = driver.findElement(By.tagName("h1")).getText();
		System.out.println(">>The Page Heading is : " + head);
		driver.findElement(By.xpath("//*[@id='text-2']/a/img")).click();
	}
}
