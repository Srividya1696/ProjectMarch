package org.facebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args)throws Exception {
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\org.facebook\\target\\excelWriteRead.xlsx");
		
		FileOutputStream f1 = new FileOutputStream(f);
		HSSFWorkbook work = new HSSFWorkbook();
		HSSFSheet sheet = work.createSheet("Students");	
		HSSFRow row = sheet.createRow(0);
		HSSFCell col = row.createCell(0);
		col.setCellValue("Abinaya");
		work.write(f);
		
		List<String> name = new ArrayList<String>();
		name.add("Pingu");
		name.add("Daisy");
		name.add("Richie");
		name.add("Noddy");
		for(int i=0;i<name.size();i++) {
			HSSFRow row1 = sheet.createRow(i+1);
			HSSFCell col1 = row1.createCell(0);
			col1.setCellValue(name.get(i));
		}
		work.write(f);
		work.close();
		
		FileInputStream f2 = new FileInputStream(f);
		HSSFWorkbook w1 = new HSSFWorkbook(f2);
		HSSFSheet s1 = w1.getSheet("Students");
		HSSFRow r1 = s1.getRow(2);
		HSSFCell c1 =r1.getCell(0);
		String data = c1.getStringCellValue();
		System.out.println(data);
		}
}
