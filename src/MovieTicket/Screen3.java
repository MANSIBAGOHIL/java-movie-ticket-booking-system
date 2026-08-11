//package MovieTicket;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Screen3 extends JFrame
{
	JButton bc1,screen;
	JLabel l1;
	JToggleButton[] bseat = new JToggleButton[10];
	JToggleButton c0,c1,c2,c3,c4,c5,c6,c7,c8,c9;
	Font f1,f2;
	MyActionListener ml = new MyActionListener(this);
	
	Screen3()
	{
		super("Screen 3:");
		setLayout(null);
		setBounds(0,0,1200,900);
		getContentPane().setBackground(Color.GRAY);
		
		f1 = new Font("Arial",Font.PLAIN,20);
		f2 = new Font("Arial",Font.BOLD,20);

		bc1 = new JButton("  Continue Booking  ");
		bc1.setBounds(800,700,300,50);
		add(bc1);
		bc1.setFont(f1);
		bc1.addActionListener(ml);
		
		screen = new JButton("SCREEN");
		screen.setBounds(250,10,400,35);
		add(screen);
		screen.setBackground(Color.GREEN);
		screen.setFont(f1);
		screen.addActionListener(ml);

		l1 = new JLabel("Price: 400");
		l1.setBounds(50,10,150,50);
		add(l1);
		l1.setFont(f2);

		c0 = new JToggleButton("C0");
		c0.setBounds(300,100,100,50);
		add(c0);
			
		c1 = new JToggleButton("C1");
		c1.setBounds(500,100,100,50);
		add(c1);
		
		c2 = new JToggleButton("C2");
		c2.setBounds(200,250,100,50);
		add(c2);
		
		c3 = new JToggleButton("C3");
		c3.setBounds(400,250,100,50);
		add(c3);
		
		c4 = new JToggleButton("C4");
		c4.setBounds(600,250,100,50);
		add(c4);
		
		c5 = new JToggleButton("C5");
		c5.setBounds(300,400,100,50);
		add(c5);
		
		c6 = new JToggleButton("C6");
		c6.setBounds(500,400,100,50);
		add(c6);
		
		c7 = new JToggleButton("C7");
		c7.setBounds(200,550,100,50);
		add(c7);
		
		c8 = new JToggleButton("C8");
		c8.setBounds(400,550,100,50);
		add(c8);
		
		c9 = new JToggleButton("C9");
		c9.setBounds(600,550,100,50);
		add(c9);
		
		bseat[0] = c0;
		bseat[1] = c1;
		bseat[2] = c2;
		bseat[3] = c3;
		bseat[4] = c4;
		bseat[5] = c5;
		bseat[6] = c6;
		bseat[7] = c7;
		bseat[8] = c8;
		bseat[9] = c9;
		
		for (int i=0; i<10; i++)
		{
			bseat[i].addActionListener(ml);
			bseat[i].setFont(f1);
		}
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
	}	
}