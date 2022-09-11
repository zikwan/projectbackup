package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReader {
	static XSSFWorkbook workbook;

	public static void main(String[] args) throws IOException {
	
	}
	public static Object[][] getdata() {
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\DataDrivenTestingDemo.xlsx");
			 workbook = new XSSFWorkbook(file);
		}
	catch (Exception e) {
		e.printStackTrace();
	}
			// workbook 
			
			XSSFSheet sheet = workbook.getSheet("Sheet1");
				int rowcount = sheet.getLastRowNum();
				int colcount = sheet.getRow(0).getLastCellNum();
				
				Object[][] data = new Object[rowcount][colcount];  
				
				for (int i=0;i<rowcount;i++)
				{
					for (int j=0;j<colcount;j++) 

					{
					 data[i][j]= sheet.getRow(i+1).getCell(j).toString();
						
					}
		}
		return data;
	}
}
	


