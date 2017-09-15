package classwor;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import wrappers.Genericwrappers;


public class TC_Login extends Genericwrappers{
	@Parameters({"URL","UN","pwd"})
	@BeforeMethod
	public void Login(String URL,String UN,String pwd) throws Exception{
		invokeApp("chrome", URL);
		enterById("username", UN);
		enterById("password", pwd);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
	}
	@AfterMethod
	public void logout(){
		closeBrowser();
	}


}
