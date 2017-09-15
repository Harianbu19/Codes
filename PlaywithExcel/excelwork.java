package PlaywithExcel;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelwork {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//FileInputStream fs = new FileInputStream(FilePath);
		XSSFWorkbook NB = new XSSFWorkbook();
		XSSFSheet NS = NB.createSheet("classwork");
		int i = 0;
		int j = 0;
		XSSFCell NR = NS.createRow(++i).createCell(++j);
		
		CellStyle style = NB.createCellStyle();
		for (Row row : NS) {
				if(row.getRowNum()==0){
				row.createCell(0).setCellValue("S.NO");
				row.createCell(1).setCellValue("Name");
				row.createCell(2).setCellValue("Password");
				row.createCell(3).setCellValue("Result");				
			}
			if(row.getRowNum()==1){
				row.createCell(0).setCellValue("1");
				row.createCell(1).setCellValue("hari");
				row.createCell(2).setCellValue("QWE");
				row.createCell(3).setCellValue("Pass");		
				style.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
			}
			if(row.getRowNum()==2){
				row.createCell(0).setCellValue("2");
				row.createCell(1).setCellValue("ben");
				row.createCell(2).setCellValue("rty");
				row.createCell(3).setCellValue("Inprogress");
				style.setFillBackgroundColor(IndexedColors.ORANGE.getIndex());
			}
			if(row.getRowNum()==3){
				row.createCell(0).setCellValue("3");
				row.createCell(1).setCellValue("selenium");
				row.createCell(2).setCellValue("asd");
				row.createCell(3).setCellValue("blocked");
				style.setFillBackgroundColor(IndexedColors.RED.getIndex());
			}
		}
		FileOutputStream fo = new FileOutputStream ("D:\\TestLeaf\\Seleniium\\drivers\\Excel\\classwork.xlsx");
		NB.write(fo);
		System.out.println("completed");

	}

}
