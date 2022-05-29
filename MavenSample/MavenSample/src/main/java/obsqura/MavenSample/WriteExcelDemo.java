package obsqura.MavenSample;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelDemo {

	public static void main(String[] args) {
		XSSFWorkbook workbook = new XSSFWorkbook(); 
        
        //Create a blank sheet
        XSSFSheet sheet = workbook.createSheet("Students");
            
        ArrayList<String> studentList = new ArrayList();
        studentList.add("Student Name");
        studentList.add("Amrita");
        studentList.add("Reshma");
        studentList.add("Suchitra");
        studentList.add("Vidya");
        studentList.add("Sruthi");
        
        
        for (int counter = 0; counter < studentList.size(); counter++) 
        { 		      
            
        	 Row row = sheet.createRow(counter);
        	 Cell cell = row.createCell(0);
        	 cell.setCellValue(studentList.get(counter));        			
        }  
        
        try
        {
            //Write the workbook in file system
        	File file = new File("ObsqueraStudents.xlsx");
            FileOutputStream out = new FileOutputStream(file);
            workbook.write(out);
            out.close();
            System.out.println("Students.xlsx written successfully on disk.");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

	}

}
