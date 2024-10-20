import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven 
{

	//public static void main(String[] args) throws FileNotFoundException
	
		
		public ArrayList<String> getdata(String TestcasesName ) throws FileNotFoundException
		{
	
		ArrayList<String>a=new ArrayList<String>();
		
		FileInputStream fis= new FileInputStream("C:\\Users\\r847805\\Desktop\\Java_Selenium\\Data.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook();
	int	sheet=wb.getNumberOfSheets();
		
		for (int i = 0; i < sheet; i++)
		{

		if (wb.getSheetName(i).equalsIgnoreCase("user"))
				{
			XSSFSheet st=wb.getSheetAt(i);
			// identify testcase coloumn by scaaning the etire 1st row 
			Iterator <Row> rows=st.iterator();// sheet is the collection of rows
		Row firstrow	=rows.next();
		Iterator<Cell> ce=firstrow.cellIterator();
		int k=0;
		int column=0;
		while (ce.hasNext())
		{
			Cell value=ce.next();
			if (value.getStringCellValue().equalsIgnoreCase("Testcases"))
			{
				column=k;
			}
			k++;
		}
			
			System.out.println(column);
			
			//once column identifies then scan entire test case coulmn to identify purchase column
			while (rows.hasNext())
			{
				Row r=rows.next();
				if (r.getCell(column).getStringCellValue().equalsIgnoreCase("purchase"))
				{
					// after your grab purchase testcase  row =pull all the data of that row and feed it into test
					Iterator <Cell> cellvalue=r.cellIterator();
					while (cellvalue.hasNext()) 
					{
						//System.out.println(cellvalue.next().getStringCellValue());
					a.add(cellvalue.next().getStringCellValue());
						
					}
				// when we need to check value is string or integer	
					/*Cell c= cv.next();
					if(c.getCellTypeEnum()==CellType.STRING)
					{

					a.add(c.getStringCellValue());
					}
					else{

					a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
*/
					//}
					
				}
				
			}
			
			
			
				}
	

		}
		return a;
		

	}


		
	}


