//package MovieTicket;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ConfirmBooking extends JFrame
{
	//Customer Details – name, email, phone no, age 
	JButton cb;	
	TextField tName,tEmail, tNo, tAge;
	Label lName,lEmail, lNo, lAge;
	Font f1;
	MyActionListener ml = new MyActionListener(this);
	ConfirmBooking()
	{
		super("Confirm Booking");
		setLayout(null);
		setBounds(0,0,1200,900);
		
		Color customColor1 = new Color(99,197,234);
		getContentPane().setBackground(customColor1);
		
		f1 = new Font("Arial",Font.BOLD,20);
		
		cb = new JButton("Confirm Booking");
		cb.setBounds(800,700,300,50);
		add(cb);
		cb.setFont(f1);
		cb.addActionListener(ml);
		
		lName = new Label("Enter Name:");
		lName.setBounds(100,200,150,50);
		add(lName);
		lName.setFont(f1);
		
		lEmail = new Label("Enter Email:");
		lEmail.setBounds(100,300,150,50);
		add(lEmail);
		lEmail.setFont(f1);
		
		lNo = new Label("Enter no:");
		lNo.setBounds(100,400,150,50);
		add(lNo);
		lNo.setFont(f1);
		
		lAge = new Label("Enter Age:");
		lAge.setBounds(100,500,150,50);
		add(lAge);
		lAge.setFont(f1);
		
		tName = new TextField("");
		tName.setBounds(300,200,300,50);
		add(tName);
		tName.setFont(f1);
		tName.addActionListener(ml);

		tEmail = new TextField("");
		tEmail.setBounds(300,300,300,50);
		add(tEmail);
		tEmail.setFont(f1);
		tEmail.addActionListener(ml);
		
		tNo = new TextField("");
		tNo.setBounds(300,400,300,50);
		add(tNo);
		tNo.setFont(f1);
		tNo.addActionListener(ml);
		
		tAge = new TextField("");
		tAge.setBounds(300,500,300,50);
		add(tAge);
		tAge.setFont(f1);
		tAge.addActionListener(ml);
		
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);		
	}
	
}