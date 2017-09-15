package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnscuessfulLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.gecko.driver", "D://TestLeaf//Seleniium//drivers//geckodriver_32bit.exe");
//		
//		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D://TestLeaf//Seleniium//drivers//chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("harimhks@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("asd");
		driver.findElement(By.id("u_0_q")).click();
		String Note= driver.findElement(By.xpath("//*[@id='content']/div/div/div[1]/span/div/div[1]/div[2]/span")).getText();
		System.out.println(Note);
		Thread.sleep(3000);
		driver.quit();
		

	}

}
