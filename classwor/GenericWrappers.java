package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericWrappers implements Wrappers{
	RemoteWebDriver driver;
	int i =1;


	public void takeSnap() {
		File srcFile1 = driver.getScreenshotAs(OutputType.FILE);
		File destFile1 = new File("./snaps/snap"+i+".jpeg");

		try {
			FileUtils.copyFile(srcFile1, destFile1);
		} catch (IOException e) {

			System.err.println("There was IO Exception while taking the SnapShot");
		}
		i++;

	}

	public void closeBrowser() {
		try {
			driver.close();
			System.out.println("Browser Closed");
		} catch (Exception e) {
			System.err.println("The browser:"+driver.getCapabilities().getBrowserName()+" could not be closed.");
		}
	}

	public void closeAllBrowsers() {
		try {
			driver.quit();
			System.out.println("Browser Closed");
		} catch (Exception e) {
			System.err.println("The browser:"+driver.getCapabilities().getBrowserName()+" could not be closed.");
		}
	}

}
