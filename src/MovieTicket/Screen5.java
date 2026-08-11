//package MovieTicket;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Screen5 extends JFrame
{
	JButton be1,screen;
	JLabel l1;
	JToggleButton[] bseat = new JToggleButton[10];
	JToggleButton e0,e1,e2,e3,e4,e5,e6,e7,e8,e9;
	Font f1,f2;
	MyActionListener ml = new MyActionListener(this);
	
	Screen5()
	{
		super("Screen 5:");
		setLayout(null);
		setBounds(0,0,1200,900);
		getContentPane().setBackground(Color.GRAY);
		
		f1 = new Font("Arial",Font.PLAIN,20);
		f2 = new Font("Arial",Font.BOLD,20);

		be1 = new JButton("    Continue Booking    ");
		be1.setBounds(800,700,300,50);
		add(be1);
		be1.setFont(f1);
		be1.addActionListener(ml);
		
		screen = new JButton("SCREEN");
		screen.setBounds(250,10,400,35);
		add(screen);
		screen.setBackground(Color.GREEN);
		screen.setFont(f1);
		screen.addActionListener(ml);

		l1 = new JLabel("Price: 350");
		l1.setBounds(50,10,150,50);
		add(l1);
		l1.setFont(f2);

		e0 = new JToggleButton("E0");
		e0.setBounds(350,100,100,50);
		add(e0);
			
		e1 = new JToggleButton("E1");
		e1.setBounds(500,100,100,50);
		add(e1);
		
		e2 = new JToggleButton("E2");
		e2.setBounds(100,250,100,50);
		add(e2);
		
		e3 = new JToggleButton("E3");
		e3.setBounds(250,250,100,50);
		add(e3);
		
		e4 = new JToggleButton("E4");
		e4.setBounds(600,250,100,50);
		add(e4);
		
		e5 = new JToggleButton("E5");
		e5.setBounds(750,250,100,50);
		add(e5);
		
		e6 = new JToggleButton("E6");
		e6.setBounds(670,400,100,50);
		add(e6);
		
		e7 = new JToggleButton("E7");
		e7.setBounds(180,400,100,50);
		add(e7);
		
		e8 = new JToggleButton("E8");
		e8.setBounds(350,550,100,50);
		add(e8);
		
		e9 = new JToggleButton("E9");
		e9.setBounds(500,550,100,50);
		add(e9);
		
		bseat[0] = e0;
		bseat[1] = e1;
		bseat[2] = e2;
		bseat[3] = e3;
		bseat[4] = e4;
		bseat[5] = e5;
		bseat[6] = e6;
		bseat[7] = e7;
		bseat[8] = e8;
		bseat[9] = e9;
		
		for (int i=0; i<10; i++)
		{
			bseat[i].addActionListener(ml);
			bseat[i].setFont(f1);
		}
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
	}	
}