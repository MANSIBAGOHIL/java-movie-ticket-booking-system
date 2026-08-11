//package MovieTicket;

import java.awt.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;

public class WelcomeFrame extends Frame
{
	Label l1,l2,l3;
	JLabel label_screen;
	MenuBar mb1;
	Menu m1,m2,m3;
	MenuItem mi1,mi2,mTheatre,mMovie;
	Font f1,f2;
	
	MyActionListener ml = new MyActionListener(this);
	
	WelcomeFrame()
	{
		super("Online Movie Ticket Booking");
		setLayout(null);
		//getMaximizedBounds();
		setBounds(0,0,1200,900);
		//setBackground(Color.PINK);

		ImageIcon screen = new ImageIcon("IMG/Welcome_Frame.png");
		label_screen = new JLabel(screen);
		label_screen.setBounds(0,0,screen.getIconWidth(),screen.getIconHeight());
		label_screen.setVisible(true);
		add(label_screen);
		
		//Color customColor = new Color(36,118,135);
		//setForeground(customColor);

		//initialize 
		/*l1 = new Label("WELCOME TO");
		l2 = new Label("ONLINE MOVIE TICKET");
		l3 = new Label("BOOKING");*/
		mb1 = new MenuBar();
		m1 = new Menu("Movie");
		m2 = new Menu("Theatres");
		m3 = new Menu("Show timings");
		mi1 = new MenuItem("Today");
		mi2 = new MenuItem("Day");
		mTheatre = new MenuItem("Theatre name");
		mMovie = new MenuItem("Movie Name");
		
		/*l1.setBounds(450,300,500,100);
		l2.setBounds(330,400,600,100);
		l3.setBounds(500,500,500,100);*/
		
		f1 = new Font("Times",Font.BOLD,50);
		f2 = new Font("Times",Font.BOLD,15);
		
		//set Font
		/*l1.setFont(f1);
		l2.setFont(f1);
		l3.setFont(f1);
		
		add(l1);
		add(l2);
		add(l3);*/
		
		m1.setFont(f2);
		m2.setFont(f2);
		m3.setFont(f2);
		mi1.setFont(f2);
		mi2.setFont(f2);
		mTheatre.setFont(f2);
		mMovie.setFont(f2);
		
		mb1.add(m1);
		mb1.add(m2);
		mb1.add(m3);
		m3.add(mi1);
		m3.add(mi2);
		m1.add(mMovie);
		m2.add(mTheatre);
		
		setMenuBar(mb1);
		
		mi1.addActionListener(ml);
		mi2.addActionListener(ml);
		mTheatre.addActionListener(ml);
		mMovie.addActionListener(ml);
	
		addWindowListener(new WindowAdapter()
			{
				//use closing method Not Closed
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
	}
	public static void main(String args[])
	{
		WelcomeFrame mf = new WelcomeFrame();
		mf.setVisible(true);
	}
}