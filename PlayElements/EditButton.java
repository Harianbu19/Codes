package PlayElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditButton {
	
	public static void editing(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a/img")).click();
		driver.findElement(By.id("email")).sendKeys("asd@gmail.com");
}
	public static void editappend(WebDriver driver){
		driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(4) > div > div > input[type='text']")).sendKeys("hari \t");
	}
	public static void edittext(WebDriver driver){
		String text = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/input")).getAttribute("value");
		System.out.println(">>The default text is = " + text);

	}
	public static void editclear(WebDriver driver){
		driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(10) > div > div > input[type='text']")).clear();
	}
	public static void editboxdisable(WebDriver driver) throws InterruptedException{
		WebElement X= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
		if(X.isEnabled()){
			System.out.println(">>Text box is enabled");
		}
		else{
			System.out.println(">>Text box is disabled");
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='text-2']/a/img")).click();
	}
}

