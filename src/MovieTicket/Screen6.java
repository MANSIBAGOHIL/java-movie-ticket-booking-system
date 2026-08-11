//package MovieTicket;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*public class Screen6 extends JFrame
{
	JButton bf1;
	JLabel l1;
	JToggleButton[] bseat = new JToggleButton[10];
	JToggleButton f0,f1,f2,f3,f4,f5,f6,f7,f8,f9;
	Font f;
	MyActionListener ml = new MyActionListener(this);
	
	Screen6()
	{
		super("Screen 6:");
		setLayout(null);
		setBounds(0,0,1200,900);
		getContentPane().setBackground(Color.GRAY);
		
		f = new Font("Arial",Font.PLAIN,20);
		
		bf1 = new JButton("continue booking");
		bf1.setBounds(800,700,300,50);
		add(bf1);
		bf1.setFont(f);
		bf1.addActionListener(ml);
		
		l1 = new JLabel("Price: 400");
		l1.setBounds(200,800,300,50);
		add(l1);
		l1.setFont(f);
		
		f0 = new JToggleButton("F0");
		f0.setBounds(300,100,100,50);
		add(f0);
			
		f1 = new JToggleButton("F1");
		f1.setBounds(500,100,100,50);
		add(f1);
		
		f2 = new JToggleButton("F2");
		f2.setBounds(200,250,100,50);
		add(f2);
		
		f3 = new JToggleButton("F3");
		f3.setBounds(400,250,100,50);
		add(f3);
		
		f4 = new JToggleButton("F4");
		f4.setBounds(600,250,100,50);
		add(f4);
		
		f5 = new JToggleButton("F5");
		f5.setBounds(300,400,100,50);
		add(f5);
		
		f6 = new JToggleButton("F6");
		f6.setBounds(500,400,100,50);
		add(f6);
		
		f7 = new JToggleButton("F7");
		f7.setBounds(200,550,100,50);
		add(f7);
		
		f8 = new JToggleButton("F8");
		f8.setBounds(400,550,100,50);
		add(f8);
		
		f9 = new JToggleButton("F9");
		f9.setBounds(600,550,100,50);
		add(f9);
		
		bseat[0] = f0;
		bseat[1] = f1;
		bseat[2] = f2;
		bseat[3] = f3;
		bseat[4] = f4;
		bseat[5] = f5;
		bseat[6] = f6;
		bseat[7] = f7;
		bseat[8] = f8;
		bseat[9] = f9;
		
		for (int i=0; i<10; i++)
		{
			bseat[i].addActionListener(ml);
			bseat[i].setFont(f);
		}
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
	}	
}*/