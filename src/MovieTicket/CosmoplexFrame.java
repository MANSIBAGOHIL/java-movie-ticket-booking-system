//package MovieTicket;

import java.net.URL;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class CosmoplexFrame extends JFrame
{
	JButton b1;
	JLabel lPic,label_screen;
	MyActionListener ml;
	CosmoplexFrame()
	{
		super("Cosmoplex Theatre");
		setLayout(null);
		setBounds(0,0,1200,900);
		
		ml = new MyActionListener(this);
		
		ImageIcon screen = new ImageIcon("IMG/0CINEMA.png");
		label_screen = new JLabel(screen);
		label_screen.setBounds(0,0,screen.getIconWidth(),screen.getIconHeight());
		add(label_screen);
		
		b1 = new JButton("Movie of the month: Bhoolbhulaiyaa 2");
		
		ImageIcon bb2 = new ImageIcon("IMG/bb2.jpg");
		lPic = new JLabel(bb2);
		lPic.setBounds(510,20,bb2.getIconWidth(),bb2.getIconHeight());
		lPic.setVisible(true);
		label_screen.add(lPic);
		
		b1.setBounds(230,420,790,60);
		
		Color customColor = new Color(220,190,145);
		Color customColor1 = new Color(220,118,135);
		getContentPane().setBackground(customColor);
		setForeground(Color.white);
		b1.setBackground(customColor1);
		
		Font f1 = new Font("Arial",Font.BOLD,40);
		b1.setFont(f1);
		

		
		b1.addActionListener(ml);
		label_screen.add(b1);
		
		label_screen.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
	}
}