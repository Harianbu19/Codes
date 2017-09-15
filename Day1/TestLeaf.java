package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeaf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://TestLeaf//Seleniium//drivers//chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//*[@id='login']/p[3]/input")).click();
		String Welcome=driver.findElement(By.tagName("h2")).getText();
		System.out.println(Welcome);
		driver.findElement(By.xpath("//*[@id='label']/a")).click();
		String Note= driver.getTitle();
		System.out.println(Note);
		Thread.sleep(3000);
		

	}

}
