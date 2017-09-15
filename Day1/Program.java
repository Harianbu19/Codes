package Day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D://TestLeaf//Softwares//Softwares//drivers//chromedriver.exe");
ChromeDriver driver = new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.get("https://www.google.com");
Thread.sleep(3000);
List<WebElement> allLinks = driver.findElements(By.tagName("a"));
int count=allLinks.size();
System.out.println("No of links"+  count);
for(int i=0;i<count;i++)
{

System.out.println(allLinks.get(i).getText()); 
System.out.println(allLinks.get(i).getAttribute("href"));

}

	}

}
