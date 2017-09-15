package alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://TestLeaf//Softwares//Softwares//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input")).click();


		Alert imp = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(imp.getText());
		imp.sendKeys("Testleaf");
		imp.accept();
		
		boolean al = imp.getText().contains("Nice to see you around these parts Testleaf!");
		System.out.println("Is Text verified!! " + al);
		Thread.sleep(3000);
		imp.accept();
		driver.close();
	}

}
