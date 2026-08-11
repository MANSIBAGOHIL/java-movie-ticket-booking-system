//package MovieTicket;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;

public class CinemaListFrame extends JFrame
{
	JLabel lTheatre1,lTheatre2,lTheatre3,lTheatre4;
	JButton bTheatre1,bTheatre2,bTheatre3,bTheatre4;
	MyActionListener ml = new MyActionListener(this);
	
	CinemaListFrame()
	{
        super("Theatre");
		setLayout(null);
		setBounds(0,0,1200,900);
		
		ImageIcon ITheatre1 = new ImageIcon("IMG/R_World.png");
		ImageIcon ITheatre2 = new ImageIcon("IMG/cosmoplex.png");
		ImageIcon ITheatre3 = new ImageIcon("IMG/Rajshree.png");
		ImageIcon ITheatre4 = new ImageIcon("IMG/galaxy_cinema.png");
		
		lTheatre1 = new JLabel();
		lTheatre1.setIcon(ITheatre1);
		lTheatre1.setBounds(95,40,370,240);
		lTheatre1.setVisible(true);
		
		lTheatre2 = new JLabel();
		lTheatre2.setIcon(ITheatre2);
		lTheatre2.setBounds(630,40,370,240);
		lTheatre2.setVisible(true);
		
		lTheatre3 = new JLabel();
		lTheatre3.setIcon(ITheatre3);
		lTheatre3.setBounds(90,450,500,240);
		lTheatre3.setVisible(true);
		
		lTheatre4 = new JLabel();
		lTheatre4.setIcon(ITheatre4);
		lTheatre4.setBounds(630,450,500,240);
		lTheatre4.setVisible(true);
		
		bTheatre1 = new JButton("R World INOX");
		bTheatre2 = new JButton("Cosmoplex");
		bTheatre3 = new JButton("Rajshree");
		bTheatre4 = new JButton("Galaxy Cinema");
		
		bTheatre1.setBounds(145,290,300,40);
		bTheatre2.setBounds(670,290,300,40);
		bTheatre3.setBounds(150,700,300,40);
		bTheatre4.setBounds(650,700,360,40);
		
		Color customColor = new Color(79,163,165);
		//Color customColor = new Color(220,190,145);
		getContentPane().setBackground(customColor);
		//Color customColor1 = new Color(36,118,135);
		//Color customColor1 = new Color(220,118,135);
		//getContentPane().setBackground(customColor);
		
		Color customColor1 = new Color (195,107,132);
		bTheatre1.setBackground(customColor1);
		bTheatre2.setBackground(customColor1);
		bTheatre3.setBackground(customColor1);
		bTheatre4.setBackground(customColor1);
		
		Font f1 = new Font("Arial",Font.BOLD,25);
		bTheatre1.setFont(f1);
		bTheatre2.setFont(f1);
		bTheatre3.setFont(f1);
		bTheatre4.setFont(f1);
		
		bTheatre1.addActionListener(ml);
		bTheatre2.addActionListener(ml);
		bTheatre3.addActionListener(ml);
		bTheatre4.addActionListener(ml);
		
		add(bTheatre1);
		add(bTheatre2);
		add(bTheatre3);
		add(bTheatre4);
		add(lTheatre1);
		add(lTheatre2);
		add(lTheatre3);
		add(lTheatre4);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
    }   
}