package wrapper;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrapper implements Wrappers{

	public RemoteWebDriver driver;
	public int i=1;

	public void invokeApp(String browser, String url) throws Exception {

		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}

	}

	public void enterById(String idValue, String data) throws Exception {
		try {
			driver.findElementById(idValue).clear();
			driver.findElementById(idValue).sendKeys(data);	
			System.out.println("The data: "+data+" entered successfully in field :"+idValue);
		} catch (Exception e) {
			System.err.println("The data: "+data+" could not be entered in the field :"+idValue);
		}
		finally {
			takeSnap();
		}
	}
	public void enterByName(String nameValue, String data) throws Exception {
		try {
			driver.findElementByName(nameValue).clear();
			driver.findElementByName(nameValue).sendKeys(data);	
			System.out.println("The data: "+data+" entered successfully in field :"+nameValue);
		} catch (Exception e) {
			System.err.println("The data: "+data+" could not be entered in the field :"+nameValue);
		}
		finally {
			takeSnap();
		}

	}

	public void enterByXpath(String xpathValue, String data) throws Exception {
		try {
			driver.findElementByXPath(xpathValue).clear();
			driver.findElementByXPath(xpathValue).sendKeys(data);	
			System.out.println("The data: "+data+" entered successfully in field :"+xpathValue);
		} catch (Exception e) {
			System.err.println("The data: "+data+" could not be entered in the field :"+xpathValue);
		}
		finally {
			takeSnap();
		}
	}

	public boolean verifyTitle(String title) {
		boolean bReturn = false;
		try{
			if (driver.getTitle().equalsIgnoreCase(title)){
				System.out.println("The title of the page matches with the value :"+title);
				bReturn = true;
			}else
				System.err.println("The title of the page:"+driver.getTitle()+" did not match with the value :"+title);

		}catch (Exception e) {
			System.err.println("The title did not match");
		}
		finally {
			takeSnap();
		}
		return bReturn;
	}

	public void verifyTextById(String id, String text) {
		String sText = driver.findElementById(id).getText();
		if (driver.findElementById(id).getText().trim().equalsIgnoreCase(text)){
			System.out.println("The text: "+sText+" matches with the value :"+text);
		}else{
			System.err.println("The text: "+sText+" did not match with the value :"+text);
		}
	}

	public void verifyTextByXpath(String xpath, String text) {
		String sText = driver.findElementByXPath(xpath).getText();
		if (driver.findElementByXPath(xpath).getText().trim().equalsIgnoreCase(text)){
			System.out.println("The text: "+sText+" matches with the value :"+text);
		}else{
			System.err.println("The text: "+sText+" did not match with the value :"+text);
		}
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		String sText = driver.findElementByXPath(xpath).getText();
		if (driver.findElementByXPath(xpath).getText().trim().contains(text)){
			System.out.println("The text: "+sText+" contains the value :"+text);

		}else{
			System.err.println("The text: "+sText+" did not contain the value :"+text);
		}
	}

	public void clickById(String id) throws Exception {
		try{
			driver.findElementById(id).click();
			System.out.println("The element with id: "+id+" is clicked.");
		} catch (Exception e) {
			System.err.println("The element with id: "+id+" could not be clicked.");
		}finally {
			takeSnap();
		}
	}

	public void clickByClassName(String classVal) throws Exception {
		try{
			driver.findElementByClassName(classVal).click();
			System.out.println("The element with id: "+classVal+" is clicked.");
		} catch (Exception e) {
			System.err.println("The element with id: "+classVal+" could not be clicked.");
		}finally {
			takeSnap();
		}
	}

	public void clickByName(String name) throws Exception {
		try{
			driver.findElementByName(name).click();
			System.out.println("The element with id: "+name+" is clicked.");
		} catch (Exception e) {
			System.err.println("The element with id: "+name+" could not be clicked.");
		}finally {
			takeSnap();
		}
	}

	public void clickByLink(String name) throws Exception {
		try{			
			driver.findElement(By.linkText(name)).click();
			System.out.println("The element with link name: "+name+" is clicked.");
		} catch (Exception e) {
			System.err.println("The element with link name: "+name+" could not be clicked.");
			throw new Exception("Stop the TESt");
		}finally {
			takeSnap();
		}

	}

	public void clickByLinkNoSnap(String name) throws Exception {
		try{
			driver.findElement(By.linkText(name)).click();
			System.out.println("The element with link name: "+name+" is clicked.");
		} catch (Exception e) {
			System.err.println("The element with link name: "+name+" could not be clicked.");
			throw new Exception("Stop the TESt");
		}
	}

	public void clickByXpath(String xpathVal) throws Exception {
		try{			
			driver.findElement(By.xpath(xpathVal)).click();
			System.out.println("The element : "+xpathVal+" is clicked.");
		} catch (Exception e) {
			System.err.println("The element with xpath: "+xpathVal+" could not be clicked.");
		}finally {
			takeSnap();
		}
	}

	public void clickByXpathNoSnap(String xpathVal) throws Exception {
		try{			
			driver.findElement(By.xpath(xpathVal)).click();
			System.out.println("The element : "+xpathVal+" is clicked.");
		} catch (Exception e) {
			System.err.println("The element with xpath: "+xpathVal+" could not be clicked.");
		}
	}

	public String getTextById(String idVal) {
		String bReturn = "";
		try{
			bReturn = driver.findElement(By.id(idVal)).getText();
			System.out.println(bReturn);
		} catch (Exception e) {
			System.err.println("The element with xpath: "+idVal+" could not be found.");
		}finally {
			takeSnap();
		}
		return bReturn;
	}

	public String getTextByXpath(String xpathVal) {
		String bReturn = "";
		try{
			bReturn = driver.findElement(By.xpath(xpathVal)).getText();
			System.out.println(bReturn);
		} catch (Exception e) {
			System.err.println("The element with xpath: "+xpathVal+" could not be found.");
		}finally {
			takeSnap();
		}
		return bReturn; 
	}

	public void selectVisibileTextById(String id, String value) throws Exception {
		try{
			new Select(driver.findElement(By.id(id))).selectByVisibleText(value);
			System.out.println("The element with id: "+id+" is selected with value :"+value);
		} catch (Exception e) {
			System.err.println("The value: "+value+" could not be selected.");
		}
		finally {
			takeSnap();
		}
	}

	public void selectIndexById(String id, int value) throws Exception {
		try{
			new Select(driver.findElement(By.id(id))).selectByIndex(value);;
			System.out.println("The element with id: "+id+" is selected with value :"+value);
		} catch (Exception e) {
			System.err.println("The value: "+value+" could not be selected.");
		}
		finally {
			takeSnap();
		}
	}

	public void switchToParentWindow() {
		try{
			Set<String> wHandles = driver.getWindowHandles();
			for (String wHandle : wHandles) {
				driver.switchTo().window(wHandle);
				break;
			}
		}catch (Exception e) {

		}
		finally {
			takeSnap();
		}
	}

	public void switchToLastWindow() {
		try {
			Set<String> wHandles = driver.getWindowHandles();
			for (String wHandle : wHandles) {
				driver.switchTo().window(wHandle);				
			}
		} catch (Exception e) {

		}
		finally {
			takeSnap();
		}
	}

	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();			
		} catch (Exception e) {

		}
	}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();		
		} catch (Exception e) {

		}
	}

	public String getAlertText() {
		String sText = "";
		try{
			sText = driver.switchTo().alert().getText();
		} catch(Exception e){

		}
		finally {
			takeSnap();
		}

		return sText;
	}

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
