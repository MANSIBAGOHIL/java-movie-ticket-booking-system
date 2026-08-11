//package MovieTicket;
import java.net.URL;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MovieListFrame extends JFrame 
{
	JLabel lMovie1,lMovie2,lMovie3,lMovie4;
	JButton b1,bMovie1,bMovie2,bMovie3,bMovie4;
	MyActionListener ml = new MyActionListener(this);
	
	MovieListFrame() 
	{
		/*try 
		{
			ImageIcon bb2 = new ImageIcon(new URL("https://www.pinkvilla.com/imageresize/bb2_live_updates_main.jpg?width=752&format=jpg&t=pvorg"));
			jbMovie1 = new JButton(bb2);
        } 
		catch (IOException e) 
		{
        	System.out.println(e);
        }*/
		super("Movies");
		setLayout(null);
		this.setSize(1220,900);
		
		Font f = new Font("Arial",Font.BOLD,20);
		
		ImageIcon bb2 = new ImageIcon("IMG/bb2.jpg");
		lMovie1 = new JLabel(bb2);
		lMovie1.setBounds(40,140,bb2.getIconWidth(),bb2.getIconHeight());
		lMovie1.setVisible(true);
		
		
		ImageIcon kgf2 = new ImageIcon("IMG/kgf2.jpg");
		lMovie2 = new JLabel(kgf2);
		lMovie2.setBounds(330,140,kgf2.getIconWidth(),kgf2.getIconHeight());
		lMovie2.setVisible(true);
		
		
		ImageIcon dhkd = new ImageIcon("IMG/dhkd.jpg");
		lMovie3 = new JLabel(dhkd);
		lMovie3.setBounds(620,140,dhkd.getIconWidth(),dhkd.getIconHeight());
		lMovie3.setVisible(true);
		
		
		ImageIcon jj = new ImageIcon("IMG/jj.jpg");
		lMovie4 = new JLabel(jj);
		lMovie4.setBounds(910,140,jj.getIconWidth(),jj.getIconHeight());
		lMovie4.setVisible(true);
		
		b1 = new JButton("BACK");
		b1.setBounds(50,700,100,50);
		add(b1);
		b1.setFont(f);
		b1.addActionListener(ml);
		
		bMovie1 = new JButton("Bhool Bhulaiyaa 2");
		bMovie1.setBounds(40,530,250,40);
		
		
		bMovie2 = new JButton("K.G.F: Chapter 2");
		bMovie2.setBounds(330,530,250,40);
		
		
		bMovie3 = new JButton("Dhaakad");
		bMovie3.setBounds(620,530,250,40);

		bMovie4 = new JButton("Jayeshbhai Jordaar");
		bMovie4.setBounds(910,530,250,40);
		
		Color customColor = new Color(30,118,175);
		Color customColor1 = new Color(10,218,184);
		
		getContentPane().setBackground(customColor);
		setForeground(Color.white);

		Font f1 = new Font("Arial",Font.BOLD,20);
		
		bMovie1.setBackground(customColor1);
		bMovie1.setFont(f1);
		bMovie1.addActionListener(ml);

		bMovie2.setBackground(customColor1);
		bMovie2.setFont(f1);
		bMovie2.addActionListener(ml);

		bMovie3.setBackground(customColor1);
		bMovie3.setFont(f1);
		bMovie3.addActionListener(ml);

		bMovie4.setBackground(customColor1);
		bMovie4.setFont(f1);	
		bMovie4.addActionListener(ml);
		
		add(bMovie1);
		add(bMovie2);
		add(bMovie3);
		add(bMovie4);
		add(lMovie1);
		add(lMovie2);
		add(lMovie3);
		add(lMovie4);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }   
}