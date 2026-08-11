//package MovieTicket;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Screen2 extends JFrame
{
	JButton bb1,screen;
	JLabel l1;
	JToggleButton[] bseat = new JToggleButton[10];
	JToggleButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	Font f1,f2;
	MyActionListener ml = new MyActionListener(this);
	
	Screen2()
	{
		super("Screen 2:");
		setLayout(null);
		setBounds(0,0,1200,900);
		getContentPane().setBackground(Color.GRAY);
		
		f1 = new Font("Arial",Font.PLAIN,20);
		f2 = new Font("Arial",Font.BOLD,20);

		bb1 = new JButton(" Continue Booking ");
		bb1.setBounds(800,700,300,50);
		add(bb1);
		bb1.setFont(f1);
		bb1.addActionListener(ml);
		
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
		
		b0 = new JToggleButton("B1");
		b0.setBounds(200,250,100,50);
		add(b0);
		
		b1 = new JToggleButton("B2");
		b1.setBounds(400,250,100,50);
		add(b1);
		b1.addActionListener(ml);
		
		b2 = new JToggleButton("B3");
		b2.setBounds(600,250,100,50);
		add(b2);
		
		b3 = new JToggleButton("B4");
		b3.setBounds(100,400,100,50);
		add(b3);
		
		b4 = new JToggleButton("B5");
		b4.setBounds(250,400,100,50);
		add(b4);
		
		b5 = new JToggleButton("B6");
		b5.setBounds(400,400,100,50);
		add(b5);
		b5.addActionListener(ml);
		
		b6 = new JToggleButton("B7");
		b6.setBounds(550,400,100,50);
		add(b6);
		
		b7 = new JToggleButton("B8");
		b7.setBounds(700,400,100,50);
		add(b7);
		
		b8 = new JToggleButton("B9");
		b8.setBounds(300,550,100,50);
		add(b8);
		
		b9 = new JToggleButton("B10");
		b9.setBounds(500,550,100,50);
		add(b9);
		
		bseat[0] = b0;
		bseat[1] = b1;
		bseat[2] = b2;
		bseat[3] = b3;
		bseat[4] = b4;
		bseat[5] = b5;
		bseat[6] = b6;
		bseat[7] = b7;
		bseat[8] = b8;
		bseat[9] = b9;
		
		
		for (int i=0; i<10; i++)
		{
			bseat[i].addActionListener(ml);
			bseat[i].setFont(f1);
		}
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
	}	
}