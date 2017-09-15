package PlayElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://TestLeaf//Softwares//Softwares//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://testleaf.herokuapp.com/home.html ");
	
//		EditButton.editing(driver);
//		System.out.println(" Edit Button Results ----> ");
//		EditButton.editappend(driver);
//		EditButton.edittext(driver);
//		EditButton.editclear(driver);
//		EditButton.editboxdisable(driver);
//		
//		System.out.println(" Quit Button Results ----> ");
//		QuitButton.quit(driver);
//		QuitButton.quitlocation(driver);
//		QuitButton.pageheading(driver);
//		QuitButton.quitcolor(driver);
//		QuitButton.quithtwd(driver);
		
//		HyperLink.link(driver);
//		HyperLink.link2(driver);
//		HyperLink.link3(driver);
//		HyperLink.link4(driver);
//		HyperLink.heading(driver);
		
//		Image.link(driver);
//		Image.link2(driver);
		//BrokenLink.validateInvalidLinks(driver);
	}
	
	

}
