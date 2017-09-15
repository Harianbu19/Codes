package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://TestLeaf//Seleniium//drivers//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("harimhks@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("chithraanbu");
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='2n_9']"));
		//Alert imp = driver.switchTo().alert();
		//imp.accept();
		driver.close();

	}

}
