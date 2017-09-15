package testcase;

import org.junit.Test;

import wrappers.Genericwrappers;

public class DeleteLead extends Genericwrappers{

	@Test
	
	public void deletelead() throws Exception {
		// TODO Auto-generated method stub
		//Genericwrappers cl = new Genericwrappers();
		invokeApp("chrome", "http://www.leaftaps.com/control/main");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Leads");
		clickByLink("Find Leads");
		enterByXpath("//*[@id='ext-gen248']","hari");
		enterByXpath("//*[@id='ext-gen250']", "vignesh");
		clickById("ext-gen334");
		clickByLink("26411");
		clickByClassName("subMenuButtonDangerous");
	}

}
