//package MovieTicket;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.util.*;
import java.lang.*;

//set classpath=commons-collections4-4.1.jar;poi-3.17.jar;poi-ooxml-3.17.jar;poi-ooxml-schemas-3.17.jar;xmlbeans-2.6.0.jar;.;

import java.util.Iterator;  
import org.apache.poi.ss.usermodel.Row;  
 

import java.io.File;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MyActionListener implements ActionListener
{
	ArrayList<String> seatId = new ArrayList<String>(); 
	static int rowCount=0;
	static int columnCount=0;
	static int price=0;
	static int total=0;
	String str="";
	static String str1="";
	static String str2="";
	static String str3="";
	static String str4="";
	int n1=0,n2=0;
	WelcomeFrame wf;
	CinemaListFrame cf;
	MovieListFrame mf;
	RWorldFrame rf;
	CosmoplexFrame csf;
	RajshreeFrame rjf;
	GalaxyCinemaFrame gcf;
	DhaakadMovieFrame df;
	Kgf2MovieFrame kf;
	JayeshbhaiMovieFrame jf;
	Bb2MovieFrame bb2;
	ShowsDhaakadFrame sd;
	Showsbb2Frame sm1;
	ShowsKGF2Frame kgf;
	ShowsJJFrame sm4;
	Screen1 st1;
	Screen2 st2;
	Screen3 s3;
	Screen4 s4;
	Screen5 s5;
	//Screen6 s6;
	ConfirmBooking cb;
	
	MyActionListener(WelcomeFrame w)
	{
		this.wf = w;
	}
	MyActionListener(CinemaListFrame c)
	{
		this.cf = c;
	}
	MyActionListener(MovieListFrame m)
	{
		this.mf = m;
	}
	MyActionListener(RWorldFrame r)
	{
		this.rf = r;
	}
	MyActionListener(CosmoplexFrame cs)
	{
		this.csf = cs;
	}
	MyActionListener(RajshreeFrame rs)
	{
		this.rjf = rs;
	}
	MyActionListener(GalaxyCinemaFrame gf)
	{
		this.gcf = gf;
	}
	MyActionListener(DhaakadMovieFrame d)
	{
		this.df = d;
	}	
	MyActionListener(Kgf2MovieFrame k)
	{
		this.kf = k;
	}	
	MyActionListener(JayeshbhaiMovieFrame j)
	{
		this.jf = j;
	}
	MyActionListener(Bb2MovieFrame b)
	{
		this.bb2 = b;
	}
	MyActionListener(Showsbb2Frame b)
	{
		this.sm1 = b;
	}
	MyActionListener(ShowsKGF2Frame k)
	{
		this.kgf = k;
	}
	MyActionListener(ShowsDhaakadFrame s)
	{
		this.sd = s;
	}
	MyActionListener(ShowsJJFrame j)
	{
		this.sm4 = j;
	}
	MyActionListener(Screen1 w)
	{
		this.st1 = w;
	}
	MyActionListener(Screen2 w)
	{
		this.st2 = w;
	}
	MyActionListener(Screen3 w)
	{
		this.s3 = w;
	}
	MyActionListener(Screen4 s)
	{
		this.s4 = s;
	}
	MyActionListener(Screen5 s)
	{
		this.s5 = s;
	}
	MyActionListener(ConfirmBooking c)
	{
		this.cb = c;
	}
	
	
	public void readExcel(ArrayList<String> compareBtn,int sheetIndex)
	{
		try 
		{
			FileInputStream inputStream = new FileInputStream(new File("TicketInfoData.xlsx"));
			
			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		
			XSSFSheet spreadsheet = workbook.getSheetAt(sheetIndex);

			int rowNo=spreadsheet.getLastRowNum();
			
			int colNo=spreadsheet.getRow(1).getLastCellNum();
			
			for(int r=0; r<rowNo; r++)
			{
				
				XSSFRow row = spreadsheet.getRow(r);
				
				for(int c=0; c<colNo; c++ )
				{
					XSSFCell cell = row.getCell(c);
					System.out.println(cell.getStringCellValue());
					compareBtn.add(cell.getStringCellValue());
				}	
			}
			inputStream.close();
		}
		catch(Exception b)
		{
			System.out.println(b);
		}
	}
	
	
	public void compareA(ArrayList<String> compareBtn)
	{
			for(int i = 0; i < compareBtn.size(); i++) 
			{   
				for(int k = 0; k < 10; k++)
				{
					if(compareBtn.get(i).equals(this.st1.bseat[k].getText()))
					{
						this.st1.bseat[k].setEnabled(false);
					}
				}
				System.out.print(compareBtn.get(i)+"\n");
			}
		
	}	
	
	public void compareB(ArrayList<String> compareBtn)
	{
			for(int i = 0; i < compareBtn.size(); i++) 
			{   
				for(int k = 0; k < 10; k++)
				{
					if(compareBtn.get(i).equals(this.st2.bseat[k].getText()))
					{
						this.st2.bseat[k].setEnabled(false);
					}
				}
				System.out.print(compareBtn.get(i)+"\n");
			}
		
	}	
	
	public void compareC(ArrayList<String> compareBtn)
	{
			for(int i = 0; i < compareBtn.size(); i++) 
			{   
				for(int k = 0; k < 10; k++)
				{
					if(compareBtn.get(i).equals(this.s3.bseat[k].getText()))
					{
						this.s3.bseat[k].setEnabled(false);
					}
				}
				System.out.print(compareBtn.get(i)+"\n");
			}
		
	}	
	
	public void compareD(ArrayList<String> compareBtn)
	{
			for(int i = 0; i < compareBtn.size(); i++) 
			{   
				for(int k = 0; k < 10; k++)
				{
					if(compareBtn.get(i).equals(this.s4.bseat[k].getText()))
					{
						this.s4.bseat[k].setEnabled(false);
					}
				}
				System.out.print(compareBtn.get(i)+"\n");
			}
		
	}	
	
	public void compareE(ArrayList<String> compareBtn)
	{
			for(int i = 0; i < compareBtn.size(); i++) 
			{   
				for(int k = 0; k < 10; k++)
				{
					if(compareBtn.get(i).equals(this.s5.bseat[k].getText()))
					{
						this.s5.bseat[k].setEnabled(false);
					}
				}
				System.out.print(compareBtn.get(i)+"\n");
			}
		
	}	
	
	public static void writeExcel(ArrayList<String> seatName,int sheetIndex)
	{
		try
		{
			FileInputStream inputStream = new FileInputStream(new File("TicketInfoData.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			
			XSSFSheet spreadsheet = workbook.getSheetAt(sheetIndex);

			int rowCount=spreadsheet.getLastRowNum();
			
			for(String rowData:seatName)
			{
				XSSFRow row = spreadsheet.createRow(++rowCount);
				
				XSSFCell cell = row.createCell(columnCount);
				cell.setCellValue((String)rowData);
			}	
			inputStream.close();

			FileOutputStream out = new FileOutputStream(new File("TicketInfoData.xlsx"));
	  
			workbook.write(out);
			out.close();
		}
		catch(Exception b)
		{
			System.out.println(b);
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Theatre name"))
		{
			cf = new CinemaListFrame();
			this.cf.setVisible(true);
			//this.wf.setVisible(false);
		}
		if(e.getActionCommand().equals("Movie Name"))
		{
			mf = new MovieListFrame();
			this.mf.setVisible(true);
			//this.wf.setVisible(false);
		}
		if(e.getActionCommand().equals("Today"))
		{
			jf = new JayeshbhaiMovieFrame();
			this.jf.setVisible(true);
			this.wf.setVisible(false);
		}
		if(e.getActionCommand().equals("Dhaakad"))
		{
			df = new DhaakadMovieFrame();
			this.df.setVisible(true);
			this.mf.setVisible(false);
		}
		if(e.getActionCommand().equals("K.G.F: Chapter 2"))
		{
			kf = new Kgf2MovieFrame();
			this.kf.setVisible(true);
			this.mf.setVisible(false);
		}
		if(e.getActionCommand().equals("Jayeshbhai Jordaar"))
		{
			jf = new JayeshbhaiMovieFrame();
			this.jf.setVisible(true);
			this.mf.setVisible(false);
		}
		if(e.getActionCommand().equals("Bhool Bhulaiyaa 2"))
		{
			bb2 = new Bb2MovieFrame();
			this.bb2.setVisible(true);
			this.mf.setVisible(false);
		}
		if(e.getActionCommand().equals("R World INOX"))
		{
			rf = new RWorldFrame();
			this.rf.setVisible(true);
			this.cf.setVisible(false);
		}
		if(e.getActionCommand().equals("Cosmoplex"))
		{
			csf = new CosmoplexFrame();
			this.csf.setVisible(true);
			this.cf.setVisible(false);
		}
		if(e.getActionCommand().equals("Rajshree"))
		{
			rjf = new RajshreeFrame();
			this.rjf.setVisible(true);
			this.cf.setVisible(false);
		}
		if(e.getActionCommand().equals("Galaxy Cinema"))
		{
			gcf = new GalaxyCinemaFrame();
			this.gcf.setVisible(true);
			this.cf.setVisible(false);
		}
		if(e.getActionCommand().equals("Book Tickets"))
		{
			sd = new ShowsDhaakadFrame();
			this.sd.setVisible(true);
			this.df.setVisible(false);
		}
		if(e.getActionCommand().equals("Book Tickets for KGF 2"))
		{
			kgf = new ShowsKGF2Frame();
			this.kgf.setVisible(true);
			this.kf.setVisible(false);
		}
		if(e.getActionCommand().equals("Book Tickets for Bhoolbhulaiyaa 2"))
		{
			sm1 = new Showsbb2Frame();
			this.sm1.setVisible(true);
			this.bb2.setVisible(false);
		}
		if(e.getActionCommand().equals("Book Tickets for Jayeshbhai Jordaar"))
		{
			sm4 = new ShowsJJFrame();
			this.sm4.setVisible(true);
			this.jf.setVisible(false);
		}
		if(e.getActionCommand().equals("BACK"))
		{
			wf = new WelcomeFrame();
			this.wf.setVisible(true);
			this.mf.setVisible(false);
		}
		if(e.getActionCommand().equals("Block buster: Dhaakad"))
		{
			df = new DhaakadMovieFrame();
			this.df.setVisible(true);
			this.rf.setVisible(false);
		}
		if(e.getActionCommand().equals("Movie of the month: Bhoolbhulaiyaa 2"))
		{
			bb2 = new Bb2MovieFrame();
			this.bb2.setVisible(true);
			this.csf.setVisible(false);
		}
		
		if(e.getActionCommand().equals("Most awaited MOVIE: KGF 2"))
		{
			kf = new Kgf2MovieFrame();
			this.kf.setVisible(true);
			this.gcf.setVisible(false);
		}
		if(e.getActionCommand().equals("1:00"))
		{

			st1 = new Screen1();
			this.st1.setVisible(true);
			//this.sd.setVisible(false);
			readExcel(seatId,0);
			compareA(seatId);
		}
		if(e.getActionCommand().equals("02:00"))
		{

			st2 = new Screen2();
			this.st2.setVisible(true);
			//this.sd.setVisible(false);
			readExcel(seatId,1);
			compareB(seatId);
		}
		if(e.getActionCommand().equals("4:30"))
		{

			s3 = new Screen3();
			this.s3.setVisible(true);
			//this.sd.setVisible(false);
			readExcel(seatId,2);
			compareC(seatId);
		}
		if(e.getActionCommand().equals("7:25"))
		{

			st2 = new Screen2();
			this.st2.setVisible(true);
			//this.sd.setVisible(false);
			readExcel(seatId,1);
			compareB(seatId);
		}
		if(e.getActionCommand().equals("6:15"))
		{

			s5 = new Screen5();
			this.s5.setVisible(true);
			//this.sd.setVisible(false);
			readExcel(seatId,4);
			compareE(seatId);
		}
		if(e.getActionCommand().equals("2:45"))
		{

			s3 = new Screen3();
			this.s3.setVisible(true);
			//this.sd.setVisible(false);
			readExcel(seatId,2);
			compareC(seatId);
		}
		if(e.getActionCommand().equals("6:30"))
		{

			s5 = new Screen5();
			this.s5.setVisible(true);
			//this.sd.setVisible(false);
			readExcel(seatId,4);
			compareE(seatId);
		}
		
		if(e.getActionCommand().equals("11:50"))
		{

			s4 = new Screen4();
			this.s4.setVisible(true);
			//this.sm4.setVisible(false);
			readExcel(seatId,3);
			compareD(seatId);
		}
		if(e.getActionCommand().equals("5:30"))
		{

			s5 = new Screen5();
			this.s5.setVisible(true);
			//this.sm4.setVisible(false);
			readExcel(seatId,4);
			compareE(seatId);
		}
		if(e.getActionCommand().equals("6:30"))
		{

			s3 = new Screen3();
			this.s3.setVisible(true);
			//this.sm4.setVisible(false);
			readExcel(seatId,2);
			compareC(seatId);
		}
		if(e.getActionCommand().equals("11:55"))
		{

			s3 = new Screen3();
			this.s3.setVisible(true);
			//this.bb2.setVisible(false);
			readExcel(seatId,2);
			compareC(seatId);
		}
		if(e.getActionCommand().equals("3:30"))
		{

			st1 = new Screen1();
			this.st1.setVisible(true);
			//this.bb2.setVisible(false);
			readExcel(seatId,0);
			compareA(seatId);
		}
		if(e.getActionCommand().equals("7:00"))
		{

			st2 = new Screen2();
			this.st2.setVisible(true);
			//this.bb2.setVisible(false);
			readExcel(seatId,1);
			compareB(seatId);
		}
		if(e.getActionCommand().equals("8:00"))
		{

			s4 = new Screen4();
			this.s4.setVisible(true);
			//this.bb2.setVisible(false);
			readExcel(seatId,3);
			compareD(seatId);
		}
		if(e.getActionCommand().equals("7:15"))
		{

			s5 = new Screen5();
			this.s5.setVisible(true);
			//this.bb2.setVisible(false);
			readExcel(seatId,4);
			compareE(seatId);
		}
		if(e.getActionCommand().equals("7:40"))
		{

			st1 = new Screen1();
			this.st1.setVisible(true);
			//this.bb2.setVisible(false);
			readExcel(seatId,0);
			compareA(seatId);
		}
		if(e.getActionCommand().equals("6:10"))
		{
			st2 = new Screen2();
			this.st2.setVisible(true);
			//this.sd.setVisible(false);
			readExcel(seatId,1);
			compareB(seatId);
			
		}
		if(e.getActionCommand().equals("6:30"))
		{
			s4 = new Screen4();
			this.s4.setVisible(true);
			//this.sd.setVisible(false);
			readExcel(seatId,3);
			compareB(seatId);
			
		}
		if(e.getActionCommand().equals("11:10"))
		{

			s3 = new Screen3();
			this.s3.setVisible(true);
			//this.kf.setVisible(false);
			readExcel(seatId,2);
			compareC(seatId);
		}
		if(e.getActionCommand().equals("11:00"))
		{

			s4 = new Screen4();
			this.s4.setVisible(true);
			//this.sm4.setVisible(false);
			readExcel(seatId,3);
			compareD(seatId);
		}
		if(e.getActionCommand().equals("4:45"))
		{

			st2 = new Screen2();
			this.st2.setVisible(true);
			//this.kf.setVisible(false);
			readExcel(seatId,1);
			compareB(seatId);
		}
		if(e.getActionCommand().equals("5:20"))
		{

			s3 = new Screen3();
			this.s3.setVisible(true);
			//this.kf.setVisible(false);
			readExcel(seatId,2);
			compareC(seatId);
		}
		if(e.getActionCommand().equals("12:30"))
		{

			s5 = new Screen5();
			this.s5.setVisible(true);
			//this.kf.setVisible(false);
			readExcel(seatId,4);
			compareE(seatId);
		}
		if(e.getActionCommand().equals("9:30"))
		{

			s3 = new Screen3();
			this.s3.setVisible(true);
			//this.kf.setVisible(false);
			readExcel(seatId,2);
			compareC(seatId);
		}



		if(e.getActionCommand().equals("10:10"))
		{

			s3 = new Screen3();
			this.s3.setVisible(true);
			//this.sd.setVisible(false);
			readExcel(seatId,2);
			compareC(seatId);
		}
		if(e.getActionCommand().equals("4:15"))
		{
			s3 = new Screen3();
			this.s3.setVisible(true);
			//this.sd.setVisible(false);
			readExcel(seatId,2);
			compareC(seatId);
		}
		if(e.getActionCommand().equals("5:10"))
		{
			s4 = new Screen4();
			this.s4.setVisible(true);
			//this.sd.setVisible(false);
			readExcel(seatId,3);
			compareD(seatId);
		}
		if(e.getActionCommand().equals("7:20"))
		{
			s5 = new Screen5();
			this.s5.setVisible(true);
			//this.sd.setVisible(false);
			readExcel(seatId,4);
			compareE(seatId);
		}
			
		if(e.getActionCommand().equals("Continue Booking"))
		{
			MyActionListener.writeExcel(seatId,0);
			cb = new ConfirmBooking();
			this.cb.setVisible(true);
			this.st1.setVisible(false);
			total = price*300;
		}
		if(e.getActionCommand().equals(" Continue Booking "))
		{
			MyActionListener.writeExcel(seatId,1);
			cb = new ConfirmBooking();
			this.cb.setVisible(true);
			this.st2.setVisible(false);
			total = price*350;
		}
		if(e.getActionCommand().equals("  Continue Booking  "))
		{
			MyActionListener.writeExcel(seatId,2);
			cb = new ConfirmBooking();
			this.cb.setVisible(true);
			this.s3.setVisible(false);
			total = price*400;

		}
		if(e.getActionCommand().equals("   Continue Booking   "))
		{
			MyActionListener.writeExcel(seatId,3);
			cb = new ConfirmBooking();
			this.cb.setVisible(true);
			this.s4.setVisible(false);
			total = price*300;

		}
		if(e.getActionCommand().equals("    Continue Booking    "))
		{
			MyActionListener.writeExcel(seatId,4);
			cb = new ConfirmBooking();
			this.cb.setVisible(true);
			this.s5.setVisible(false);
			total = price*350;

		}
		
		
		if(e.getActionCommand().equals("Confirm Booking"))
		{
			str1=this.cb.tName.getText();
			str2=this.cb.tAge.getText();
			str3=this.cb.tNo.getText();
			str4=this.cb.tEmail.getText();
			
			try{
			n1 = Integer.parseInt(this.cb.tNo.getText());
			n2 = Integer.parseInt(this.cb.tAge.getText());
			//if(n1==)
			}
			catch(NumberFormatException n)
			{
				JOptionPane.showMessageDialog(null,"Please enter digits in age and number","Warning",JOptionPane.WARNING_MESSAGE);
			}
			
				System.out.println("end");
			if((this.cb.tName.getText()).equals(""))
			{
				JOptionPane.showMessageDialog(null,"Name is empty, please fill details","Warning",JOptionPane.WARNING_MESSAGE);
				System.out.println("entered");
			}
			if((this.cb.tAge.getText()).equals(""))
			{
				JOptionPane.showMessageDialog(null,"Age is empty, please fill details","Warning",JOptionPane.WARNING_MESSAGE);
				System.out.println("entered");
			}
			if((this.cb.tEmail.getText()).equals(""))
			{
				JOptionPane.showMessageDialog(null,"Email is empty, please fill details","Warning",JOptionPane.WARNING_MESSAGE);
				System.out.println("entered");
			}
			if((this.cb.tNo.getText()).equals(""))
			{
				JOptionPane.showMessageDialog(null, "Number is empty, please fill details","Warning",JOptionPane.WARNING_MESSAGE);
				System.out.println("entered");
			}

			if(!(str1).equals("") && !(str2).equals("") && !(str3).equals("") && !(str4).equals("")) //this.cb.tName.getText()!="" && this.cb.tAge.getText()!="" && this.cb.tEmail.getText()!="" && this.cb.tNo.getText()!=""	
			{
				JOptionPane.showMessageDialog(null,"Your tickets has been booked!"+"\n"+"Name:"+this.cb.tName.getText()+"\n"+"Age:"+this.cb.tAge.getText()+"\n"+"Email:"+this.cb.tEmail.getText()+"\n"+"Number:"+this.cb.tNo.getText()+"\n"+"Amount to be paid:"+total+"\n","CONFIRMED",JOptionPane.INFORMATION_MESSAGE);
			}	
		}
	
		if(e.getActionCommand().equals("A0"))
		{
			str = "A0";
			
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("A0 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("A1"))
		{
			str = "A1";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("A1 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("A2"))
		{
			str = "A2";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("A2 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("A3"))
		{
			str = "A3";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("A3 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("A4"))
		{
			str = "A4";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("A4 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("A5"))
		{
			str = "A5";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("A5 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("A6"))
		{
			str = "A6";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("A6 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("A7"))
		{
			str = "A7";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("A7 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("A8"))
		{
			str = "A8";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("A8 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("A9"))
		{
			str = "A9";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("A9 - selected=" + selected + "\n");
		}
		
		
		if(e.getActionCommand().equals("B0"))
		{
			str = "B0";
			
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("B0 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("B1"))
		{
			str = "B1";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("B1 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("B2"))
		{
			str = "B2";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("B2 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("B3"))
		{
			str = "B3";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("B3 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("B4"))
		{
			str = "B4";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("B4 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("B5"))
		{
			str = "B5";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("B5 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("B6"))
		{
			str = "B6";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("B6 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("B7"))
		{
			str = "B7";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("B7 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("B8"))
		{
			str = "B8";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("B8 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("B9"))
		{
			str = "B9";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("B9 - selected=" + selected + "\n");
		}		
		
		
		if(e.getActionCommand().equals("C0"))
		{
			str = "C0";
			
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("C0 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("C1"))
		{
			str = "C1";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("C1 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("C2"))
		{
			str = "C2";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("C2 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("C3"))
		{
			str = "C3";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("C3 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("C4"))
		{
			str = "C4";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("C4 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("C5"))
		{
			str = "C5";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("C5 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("C6"))
		{
			str = "C6";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("C6 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("C7"))
		{
			str = "C7";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("C7 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("C8"))
		{
			str = "C8";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("C8 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("C9"))
		{
			str = "C9";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("C9 - selected=" + selected + "\n");
		}

		if(e.getActionCommand().equals("D0"))
		{
			str = "D0";
			
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("D0 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("D1"))
		{
			str = "D1";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("D1 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("D2"))
		{
			str = "D2";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("D2 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("D3"))
		{
			str = "D3";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("D3 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("D4"))
		{
			str = "D4";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("D4 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("D5"))
		{
			str = "D5";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("D5 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("D6"))
		{
			str = "D6";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("D6 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("D7"))
		{
			str = "D7";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("D7 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("D8"))
		{
			str = "D8";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("D8 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("D9"))
		{
			str = "D9";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("D9 - selected=" + selected + "\n");
		}
		
		
		if(e.getActionCommand().equals("E0"))
		{
			str = "E0";
			
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("E0 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("E1"))
		{
			str = "E1";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("E1 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("E2"))
		{
			str = "E2";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("E2 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("E3"))
		{
			str = "E3";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("E3 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("E4"))
		{
			str = "E4";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("E4 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("E5"))
		{
			str = "E5";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("E5 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("E6"))
		{
			str = "E6";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("E6 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("E7"))
		{
			str = "E7";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("E7 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("E8"))
		{
			str = "E8";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("E8 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("E9"))
		{
			str = "E9";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("E9 - selected=" + selected + "\n");
		}		
	

		if(e.getActionCommand().equals("F0"))
		{
			str = "F0";
			
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("F0 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("F1"))
		{
			str = "F1";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("F1 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("F2"))
		{
			str = "F2";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("F2 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("F3"))
		{
			str = "F3";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("F3 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("F4"))
		{
			str = "F4";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("F4 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("F5"))
		{
			str = "F5";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("F5 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("F6"))
		{
			str = "F6";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("F6 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("F7"))
		{
			str = "F7";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("F7 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("F8"))
		{
			str = "F8";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("F8 - selected=" + selected + "\n");		
		}
		if(e.getActionCommand().equals("F9"))
		{
			str = "F9";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
			{
				seatId.add(str);
				price++;
			}	
			else
			{
				seatId.remove(str);
				price--;
			}
			System.out.println("F9 - selected=" + selected + "\n");
		}

	}

}
		
