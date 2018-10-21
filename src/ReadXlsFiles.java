import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXlsFiles {
	public static void main(String argsp[]) throws IOException{
		//To read data need to install ApachePOI
				
		String xlPath = "/Users/VishwanathKota/Documents/WorkSpace/TestData.xls";
		File src = new File(xlPath);
		FileInputStream stream = new FileInputStream(src);
		
		HSSFWorkbook wb = new HSSFWorkbook(stream);
		HSSFSheet sheet = wb.getSheetAt(0);
		/*
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());//get particular cell value
		System.out.println(sheet.getLastRowNum());//returns the number of rows used
		System.out.println(sheet.getRow(1).getLastCellNum());//columns count in a particular row
		*/
		
//		System.out.println(sheet.getRow(0).getCell(1).getNumericCellValue());
		
//		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		/*
		int columnCount = sheet.getRow(0).getLastCellNum();
		for(int j = 0 ; j < columnCount; j++){
			try {
				System.out.println(sheet.getRow(0).getCell(j).getStringCellValue());
			}
			catch(Exception e){
				System.out.println((int)sheet.getRow(0).getCell(j).getNumericCellValue());
			}
		}
		*/
		
		/*
		try{
			System.out.println((int)sheet.getRow(0).getCell(1).getNumericCellValue());
			
		}
		catch(Exception e){
			System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		}
		*/
		
		
//		int sheets = wb.getNumberOfSheets();
//		for(int i = 0; i < sheets; i++){
//			System.out.println(wb.getSheetName(i));
//		}
		
		
		//To write into excel
//		sheet.createRow(6).createCell(1).setCellValue("writingFromCode");
		sheet.createRow(6);
//		if (sheet.getRow(6) == null){
//			//used to check if the row is null then if it statisfy then only create the row.
//		}
		FileOutputStream fos = new FileOutputStream(src);
		wb.write(fos);
		fos.flush();
		System.out.println("completed");
		
	}
}
