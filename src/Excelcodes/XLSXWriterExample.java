//set classpath=commons-collections4-4.1.jar;poi-3.17.jar;poi-ooxml-3.17.jar;poi-ooxml-schemas-3.17.jar;xmlbeans-2.6.0.jar;.;
import java.io.File;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TicketInfo
{
	String seat;
	
	TicketInfo(String a)  //, String b, String c
	{
		this.seat=a;
		//this.name=b;
		//this.marks=c;
	}
	public String toString()
	{
		return this.seat; //+","+this.name+","+this.marks;
	}
}
public class XLSXWriterExample {
  
    // any exceptions need to be caught
    public static void main(String[] args) throws Exception
    {
        // workbook object
        XSSFWorkbook workbook = new XSSFWorkbook();
  
        // spreadsheet object
        XSSFSheet spreadsheet = workbook.createSheet(" TicketInfo Data ");
  
        // creating a row object
        XSSFRow row;
  
        // This data needs to be written (Object[])
        Map<String, TicketInfo> bookedTicket = new TreeMap<String, TicketInfo>();
		
        bookedTicket.put("1", new TicketInfo("A0"));
        //bookedTicket.put("2", new TicketInfo("1"));
		//bookedTicket.put("3", new TicketInfo("2"));
		//bookedTicket.put("4", new TicketInfo("3"));
        
		
        Set<String> keyid = bookedTicket.keySet();
  
        int rowid = 0;
  
        // writing the data into the sheets...
		TicketInfo st[] = new TicketInfo[1];
        for (String key : keyid) {
  
            row = spreadsheet.createRow(rowid++);
			st[0] = bookedTicket.get(key);
            Object[] objectArr = st[0].toString().split(",");
            int cellid = 0;
  
			for (Object obj : objectArr) { //[0] [1] [2]
				Cell cell = row.createCell(cellid++);
				cell.setCellValue((String)obj);
            }
        }
  
        // .xlsx is the format for Excel Sheets...
        // writing the workbook into the file...
        FileOutputStream out = new FileOutputStream(new File("TicketInfoData.xlsx"));
  
        workbook.write(out);
        out.close();
    }
}