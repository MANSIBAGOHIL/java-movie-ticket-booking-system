//package MovieTicket;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class RWorldFrame extends JFrame
{
	JButton b1;
	JLabel lPic,label_screen;
	MyActionListener ml;
	RWorldFrame()
	{
		super("R World Theatre");
		setLayout(null);
		setBounds(0,0,1200,900);
		
		ml = new MyActionListener(this);
		
		ImageIcon screen = new ImageIcon("IMG/0CINEMA.png");
		label_screen = new JLabel(screen);
		label_screen.setBounds(0,0,screen.getIconWidth(),screen.getIconHeight());
		add(label_screen);
		
		b1 = new JButton("Block buster: Dhaakad");
		
		b1.setBounds(350,400,500,50);
		
		ImageIcon dhkd = new ImageIcon("IMG/dhkd.jpg");
		lPic = new JLabel(dhkd);
		lPic.setBounds(475,20,dhkd.getIconWidth(),dhkd.getIconHeight());
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
