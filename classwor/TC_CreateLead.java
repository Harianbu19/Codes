package testcases;

import wrapper.GenericWrapper;

public class CreatLead{	

	public static void main(String[] args) throws Exception {
		
		GenericWrapper cl = new GenericWrapper();
		cl.invokeApp("chrome", "http://www.leaftaps.com/control/main");
		cl.enterById("username", "DemoSalesManager");
		cl.enterById("password", "crmsfa");
		cl.clickByClassName("decorativeSubmit");
		cl.clickByLink("CRM/SFA");
		cl.clickByLink("Leads");
		cl.clickByLink("Create Lead");
		cl.enterById("createLeadForm_companyName","sarath");
		cl.enterById("createLeadForm_firstName", "sarath");
		cl.enterById("createLeadForm_lastName", "kumar");		
		cl.enterById("createLeadForm_primaryEmail", "Sarath@testleaf.com");
		cl.enterById("createLeadForm_primaryPhoneNumber", "1234567890");
		cl.clickByName("submitButton");
	}	
}













