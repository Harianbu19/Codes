package PlayElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Image {

	public static void link(WebDriver driver) throws InterruptedException{
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[4]/a/img")).click();
		driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/img")).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}
	public static void link2(WebDriver driver){
		boolean image = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img")) != null;
		if(!image){
		System.out.println("Image is not broken");	
		}
		else{
			System.out.println("Image is broken");
		}
	}
	public static void keyboardclick(WebDriver driver){
		
	}
}

