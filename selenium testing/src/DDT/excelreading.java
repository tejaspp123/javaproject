package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFName;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;





public class excelreading {
  @Test(priority=1)
  public void getsheetname() throws IOException {
	  //step 1:create an instance of fileinputstream class and pass into its constructor file location
	  FileInputStream fis=new FileInputStream(".\\Testdata\\Book2.xlsx");
	  //create an instance of required workbook
	  XSSFWorkbook workbook=new XSSFWorkbook(fis);
	  //perform operation on sheet
	int  sheetcount=workbook.getNumberOfSheets();
	System.out.println("number of sheets:"+sheetcount);
	System.out.println("active sheet index:"+workbook.getActiveSheetIndex());
	for(int i=0;i<sheetcount;i++) {
		System.out.println(workbook.getSheetName(i));
	}
	//to get specific sheet
	workbook.getSheet("sheet1");
 }



@Test(priority=2)
public void getrowoperation() throws IOException {
	//step 1:create an instance of fileinputstream class and pass into its constructor file location
FileInputStream fis =new FileInputStream(".\\Testdata\\Book2.xlsx");
//create an instance of required workbook
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	//get a sheet
	 XSSFSheet sheet=workbook.getSheet("sheet1");
	 //get a row
	int rowCount = sheet.getLastRowNum();// in current how many rows are present, row count=actual count -1
		System.out.println("RowCount: " + rowCount);
		
		//get special row
	XSSFRow	row=sheet.getRow(0);
		
	 
}

@Test(priority=3)
	public void getcelloperation() throws IOException {
	//step 1:create an instance of fileinputstream class and pass into its constructor file locati
	FileInputStream fis=new FileInputStream(".\\Testdata\\Book2.xlsx");
	//step 2:create an instance of required workbook
    XSSFWorkbook workbook=new XSSFWorkbook(fis);
    
    //step3:getsheet
    XSSFSheet  sheet=workbook.getSheet("sheet1");
    
    //step4:getrow
   XSSFRow row=sheet.getRow(0);
// 5. cell operation
		System.out.println("Cell count in row-0: " + row.getLastCellNum());
		for (int i = 0; i < row.getLastCellNum(); i++) {
			System.out.print(row.getCell(i).getStringCellValue() + "\t");
   
	
		
	}
}

@Test(priority=4)
public void getdifferentcellvalues() throws IOException {
	//step 1:create an instance of fileinputstream class and pass into its constructor file locati
		FileInputStream fis=new FileInputStream(".\\Testdata\\Book2.xlsx");
		//step 2:create an instance of required workbook
	    XSSFWorkbook workbook=new XSSFWorkbook(fis);
	    
	    //step3:getsheet
	    XSSFSheet  sheet=workbook.getSheet("sheet1");
	    
	    //step4:getrow
	   XSSFRow row=sheet.getRow(0);
	// 5. cell operation
	   for(int i=0;i<row.getLastCellNum();i++) {
	  XSSFCell  cell=row.getCell(i);
	  switch(cell.getCellType()) {
	  case STRING:
		  System.out.println(cell.getStringCellValue());
		  break;
	  case NUMERIC:
		  System.out.println(cell.getNumericCellValue());
		  break;
	  case BOOLEAN:
		  System.out.println(cell.getBooleanCellValue());
		  break;
	  case BLANK:
		  break;
	  default:
			throw new RuntimeException("There is no support for this type of cell");
	  
	  
		  
	  }
	   }
			


}
}
	   