//package MovieTicket;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GalaxyCinemaFrame extends JFrame
{
	JButton b1;
	JLabel lPic,label_screen;
	MyActionListener ml;
	GalaxyCinemaFrame()
	{
		super("Galaxy Cinema Theatre");
		setLayout(null);
		setBounds(0,0,1200,900);
		
		ml = new MyActionListener(this);
		
		ImageIcon screen = new ImageIcon("IMG/0CINEMA.png");
		label_screen = new JLabel(screen);
		label_screen.setBounds(0,0,screen.getIconWidth(),screen.getIconHeight());
		add(label_screen);
		
		b1 = new JButton("Most awaited MOVIE: KGF 2");
		
		b1.setBounds(280,450,650,60);
		
		ImageIcon kgf2 = new ImageIcon("IMG/kgf2.jpg");
		lPic = new JLabel(kgf2);
		lPic.setBounds(500,30,kgf2.getIconWidth(),kgf2.getIconHeight());
		lPic.setVisible(true);
		label_screen.add(lPic);
		
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