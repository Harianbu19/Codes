package classwor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TC_CreateContact extends TC_Login{
	
	
	@Test(dataProvider="ReadCreateContactExcel")
	public void createContact(String FN,String LN,String Currency) throws Exception{
		clickByLink("Contacts");
		clickByLink("Create Contact");
		enterById("firstNameField", FN);
		enterById("lastNameField", LN);
		selectVisibileTextById("createContactForm_preferredCurrencyUomId", Currency);
		clickByClassName("smallSubmit");
		verifyTextById("viewContact_firstName_sp", FN);
	}
	
	@DataProvider(name="ReadCreateContactExcel")
	public Object[][] getData() throws IOException{
		
		FileInputStream fis=new FileInputStream ("./ExcelWorkBook/Createcontact.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheetAt(0);
		int rowCount = ws.getLastRowNum();
		int columnCount = ws.getRow(0).getLastCellNum();
		
		Object[][] dd=new Object[rowCount][columnCount];
		for(int i=1;i<=rowCount;i++)
		{
			XSSFRow row=ws.getRow(i);
			for(int j=0;j<columnCount;j++)
			{
				XSSFCell cell=row.getCell(j);
				dd[i-1][j]=cell.getStringCellValue();
				}
		}
		
		return dd;
		
	}

}
