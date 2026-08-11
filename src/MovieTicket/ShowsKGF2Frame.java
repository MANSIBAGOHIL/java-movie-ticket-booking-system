//package MovieTicket;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShowsKGF2Frame extends JFrame
{
	JLabel label_screen;
	JLabel ttl1,lthr1,lthr2,lthr3,lthr4;
	JButton bShow1,bShow2,bShow3,bShow4,bShow5,bShow6,bShow7,bShow8,bShow9;
	Font f1;
	MyActionListener ml = new MyActionListener(this);
	
	ShowsKGF2Frame()
	{
		super("Showtimings for KGF 2");
		setLayout(null);
		setBounds(0,0,1200,900);
		//getContentPane().setBackground(Color.GRAY);
		
		ImageIcon screen = new ImageIcon("IMG/Show_Timing.png");
		label_screen = new JLabel(screen);
		label_screen.setBounds(0,0,screen.getIconWidth(),screen.getIconHeight());

		add(label_screen);

		ttl1 = new JLabel("Showtimings for KGF 2 movie:");
		ttl1.setBounds(100,70,450,80);
		
		lthr1 = new JLabel("R World:");
		lthr1.setBounds(100,180,150,40);
		
		lthr2 = new JLabel("Cosmoplex:");
		lthr2.setBounds(100,320,140,40);
		
		lthr3 = new JLabel("Galaxy Cinema:");
		lthr3.setBounds(100,460,200,40);
		
		lthr4 = new JLabel("Rajshree:");
		lthr4.setBounds(100,600,200,40);
		
		bShow1 = new JButton("11:10");
		bShow1.setBounds(100,220,100,50);
		
		bShow2 = new JButton("4:45");
		bShow2.setBounds(270,220,100,50);
		
		bShow3 = new JButton("5:20");
		bShow3.setBounds(100,360,100,50);
		
		bShow4 = new JButton("12:30");
		bShow4.setBounds(100,500,100,50);
		
		bShow5 = new JButton("6:15");
		bShow5.setBounds(270,500,100,50);
		
		bShow6 = new JButton("5:10");
		bShow6.setBounds(100,640,100,50);
		
		bShow7 = new JButton("2:45");
		bShow7.setBounds(270,640,100,50);
		
		//bShow8 = new JButton("12:45");
		//bShow8.setBounds(440,220,100,50);
		
		//bShow9 = new JButton("7:35");
		//bShow9.setBounds(440,220,100,50);
		
		label_screen.add(ttl1);
		label_screen.add(lthr1);
		label_screen.add(lthr2);
		label_screen.add(lthr3);
		label_screen.add(lthr4);
		label_screen.add(bShow1);
		label_screen.add(bShow2);
		label_screen.add(bShow3);
		label_screen.add(bShow4);
		label_screen.add(bShow5);
		label_screen.add(bShow6);
		label_screen.add(bShow7);
		//label_screen.add(bShow8);
		//label_screen.add(bShow9);
		
		f1 = new Font("Times",Font.BOLD,25);
		ttl1.setFont(f1);
		lthr1.setFont(f1);
		lthr2.setFont(f1);
		lthr3.setFont(f1);
		lthr4.setFont(f1);
		bShow1.setFont(f1);
		bShow2.setFont(f1);
		bShow3.setFont(f1);
		bShow4.setFont(f1);
		bShow5.setFont(f1);
		bShow6.setFont(f1);
		bShow7.setFont(f1);
		//bShow8.setFont(f1);
		//bShow9.setFont(f1);
		
		bShow1.setBackground(Color.LIGHT_GRAY);
		bShow2.setBackground(Color.LIGHT_GRAY);
		bShow3.setBackground(Color.LIGHT_GRAY);
		bShow4.setBackground(Color.LIGHT_GRAY);
		bShow5.setBackground(Color.LIGHT_GRAY);
		bShow6.setBackground(Color.LIGHT_GRAY);
		bShow7.setBackground(Color.LIGHT_GRAY);
		//bShow8.setBackground(Color.LIGHT_GRAY);
		//bShow9.setBackground(Color.LIGHT_GRAY);
		
		bShow1.addActionListener(ml);
		bShow2.addActionListener(ml);
		bShow3.addActionListener(ml);
		bShow4.addActionListener(ml);
		bShow5.addActionListener(ml);
		bShow6.addActionListener(ml);
		bShow7.addActionListener(ml);
		//bShow8.addActionListener(ml);
		//bShow9.addActionListener(ml);
		
		lthr1.setOpaque(false);
		lthr2.setOpaque(false);
		lthr3.setOpaque(false);
		lthr4.setOpaque(false);
		ttl1.setOpaque(false);

		label_screen.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}