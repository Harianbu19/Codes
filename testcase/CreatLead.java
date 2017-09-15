package testcase;


import org.junit.Test;

import wrappers.Genericwrappers;


public class CreatLead extends Genericwrappers{	

	@Test
	public  void createlead() throws Exception {

		//Genericwrappers cl = new Genericwrappers();
		invokeApp("chrome", "http://www.leaftaps.com/control/main");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName","hari");
		enterById("createLeadForm_firstName", "hari");
		enterById("createLeadForm_lastName", "vignesh");		
		selectIndexById("createLeadForm_dataSourceId", 4);
		selectIndexById("createLeadForm_marketingCampaignId", 6);
		enterById("createLeadForm_primaryPhoneNumber", "0987456123");
		enterById("createLeadForm_primaryEmail", "hari@testleaf.com");
		clickByName("submitButton");	
		getTextById("viewLead_companyName_sp").trim().contains(null);
		
	}	
}













