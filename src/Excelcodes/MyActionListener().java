//package MovieTicket;

//import java.awt.*;
import java.awt.event.*;
//import java.io.*;
import javax.swing.*;
//import java.lang.*;

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


public class MyActionListener implements ActionListener
{
	String str="";
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
	Screen1Movie3 st1;
	Screen2Movie3 st2;
	
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
	MyActionListener(Screen1Movie3 w)
	{
		this.st1 = w;
	}
	MyActionListener(Screen2Movie3 w)
	{
		this.st2 = w;
	}
	
	
	
	public void actionPerformed(ActionEvent e)
	{
		
		st2 = new Screen2Movie3();
		st1 = new Screen1Movie3();

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
			//System.out.println("entered");
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
		if(e.getActionCommand().equals("1:00"))
		{

			st1 = new Screen1Movie3();
			this.st1.setVisible(true);
			this.sd.setVisible(false);
		}
		if(e.getActionCommand().equals("10:10"))
		{
			st2 = new Screen2Movie3();
			this.st2.setVisible(true);
			this.sd.setVisible(false);
			
		}
		/*if(st1.isDisplayable())
		{	System.out.println("450");
			for(int i=0;i<10;i++) 
			{
					System.out.println("7450");
			if(e.getSource() == this.st1.bseat[i]) 
				{
					//textfield.setText(textfield.getText().concat(String.valueOf(i)));
					System.out.println("selected");
				}
			}
			
			for(int i=0;i<20;i++)
			{
				System.out.println("entered");
			if(e.getSource() == this.st2.bseats[i]) 
				{
					//textfield.setText(textfield.getText().concat(String.valueOf(i)));
					System.out.println("selected");
				}
			}
		}*/
		
		if(e.getActionCommand().equals("A0"))
		{
			str = "A0";
			
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			System.out.println("A0 - selected=" + selected + "\n");
	
		
		}
		if(e.getActionCommand().equals("A1"))
		{
			str = "A1";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			System.out.println("A1 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("A2"))
		{
			str = "A2";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			System.out.println("A2 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("A3"))
		{
			str = "A3";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			System.out.println("A3 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("A4"))
		{
			str = "A4";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			System.out.println("A4 - selected=" + selected + "\n");
		}
		if(e.getActionCommand().equals("A5"))
		{
			str = "A5";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			System.out.println("A5 - selected=" + selected + "\n");			
		}
		if(e.getActionCommand().equals("A6"))
		{
			str = "A6";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			System.out.println("A6 - selected=" + selected + "\n");			
		}
		if(e.getActionCommand().equals("A7"))
		{
			str = "A7";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			System.out.println("A7 - selected=" + selected + "\n");			
		}
		if(e.getActionCommand().equals("A8"))
		{
			str = "A8";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			System.out.println("A8 - selected=" + selected + "\n");			
		}
		if(e.getActionCommand().equals("A9"))
		{
			str = "A9";
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			System.out.println("A9 - selected=" + selected + "\n");			
		}
		switch(str)
		{
			case "A0":
			{
				System.out.println(str);
				try
				{
					XSSFWorkbook workbook = new XSSFWorkbook();
					
					XSSFSheet spreadsheet = workbook.createSheet(" TicketInfo Data ");
 
					XSSFRow row;
  
					Map<String, TicketInfo> bookedTicket = new TreeMap<String, TicketInfo>();
		
					bookedTicket.put("1", new TicketInfo("A0"));
					//bookedTicket.put("2", new TicketInfo("1"));
					//bookedTicket.put("3", new TicketInfo("2"));
					//bookedTicket.put("4", new TicketInfo("3"));
        
		
					Set<String> keyid = bookedTicket.keySet();
			  
					int rowid = 0;
			  
					// writing the data into the sheets...
					TicketInfo st[] = new TicketInfo[1];
					for (String key : keyid) 
					{
			  
						row = spreadsheet.createRow(rowid++);
						st[0] = bookedTicket.get(key);
						Object[] objectArr = st[0].toString().split(",");
						int cellid = 0;
			  
						for (Object obj : objectArr) 
						{ //[0] [1] [2]
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
				catch(Exception b)
				{
					System.out.println(b);
				}
				break;
			}
			case "A1":
			{
				System.out.println(str);
				break;
			}
			case "A2":
			{
				System.out.println(str);
				break;
			}
			case "A3":
			{
				System.out.println(str);
				break;
			}
			case "A4":
			{
				System.out.println(str);
				break;
			}
		}
	}/*
	public void itemStateChanged(ItemEvent ae) 
	{   //e.getItem().toString()==this.mf.c1.getLabel()       e.getStateChange()==e.SELECTED
		if(ae.getItem().toString()==this.st1.b0.getLabel())
		{
			//al.add(e.getItem().toString());
			System.out.println("oS");
			//System.out.println(e.getItem().toString() +" is Selected");
		}	
	}*/	
}