//package MovieTicket;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Screen4 extends JFrame
{
	JButton bd1,screen;
	JLabel l1;
	JToggleButton[] bseat = new JToggleButton[10];
	JToggleButton d0,d1,d2,d3,d4,d5,d6,d7,d8,d9;
	Font f1,f2;
	MyActionListener ml = new MyActionListener(this);
	
	Screen4()
	{
		super("Screen 4:");
		setLayout(null);
		setBounds(0,0,1200,900);
		getContentPane().setBackground(Color.GRAY);
		
		f1 = new Font("Arial",Font.PLAIN,20);
		f2 = new Font("Arial",Font.BOLD,20);

		bd1 = new JButton("   Continue Booking   ");
		bd1.setBounds(800,700,300,50);
		add(bd1);
		bd1.setFont(f1);
		bd1.addActionListener(ml);
		
		screen = new JButton("SCREEN");
		screen.setBounds(250,10,400,35);
		add(screen);
		screen.setBackground(Color.GREEN);
		screen.setFont(f1);
		screen.addActionListener(ml);

		l1 = new JLabel("Price: 300");
		l1.setBounds(50,10,150,50);
		add(l1);
		l1.setFont(f2);
		
		d0 = new JToggleButton("D0");
		d0.setBounds(400,100,100,50);
		add(d0);
			
		d1 = new JToggleButton("D1");
		d1.setBounds(600,100,100,50);
		add(d1);
		
		d2 = new JToggleButton("D2");
		d2.setBounds(100,250,100,50);
		add(d2);
		
		d3 = new JToggleButton("D3");
		d3.setBounds(250,250,100,50);
		add(d3);
		
		d4 = new JToggleButton("D4");
		d4.setBounds(850,250,100,50);
		add(d4);
		
		d5 = new JToggleButton("D5");
		d5.setBounds(1000,250,100,50);
		add(d5);
		
		d6 = new JToggleButton("D6");
		d6.setBounds(100,400,100,50);
		add(d6);
		
		d7 = new JToggleButton("D7");
		d7.setBounds(250,400,100,50);
		add(d7);
		
		d8 = new JToggleButton("D8");
		d8.setBounds(850,400,100,50);
		add(d8);
		
		d9 = new JToggleButton("D9");
		d9.setBounds(1000,400,100,50);
		add(d9);
		
		bseat[0] = d0;
		bseat[1] = d1;
		bseat[2] = d2;
		bseat[3] = d3;
		bseat[4] = d4;
		bseat[5] = d5;
		bseat[6] = d6;
		bseat[7] = d7;
		bseat[8] = d8;
		bseat[9] = d9;
		
		for (int i=0; i<10; i++)
		{
			bseat[i].addActionListener(ml);
			bseat[i].setFont(f1);
		}
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
	}	
}