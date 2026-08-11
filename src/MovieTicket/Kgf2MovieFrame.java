//package MovieTicket;

import java.net.URL;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class Kgf2MovieFrame extends JFrame
{
	JLabel lPic,lName,lGenre,lLenght,lType,lLanguage,lAbout,lDiscribtion,lDiscribtion1,lDiscribtion2,lDiscribtion3,lDiscribtion4;
	JLabel lCosmo,lInox,lGalaxy,lRajshree,lAvailableShow;   
	Button bTickets;      //bCosmo,bInox,bGalaxy,bRajshree
	
	MyActionListener al = new MyActionListener(this);
	
	Kgf2MovieFrame()
	{
		super("K.G.F: Chapter 2");
		this.setBounds(0, 0, 1200, 800);
		setLayout(null);
		
		Font f1 = new Font("Arial",Font.BOLD,35);
		Font f2 = new Font("SANS_SERIF",Font.PLAIN,20);
		Font f3 = new Font("Arial",Font.PLAIN,20);
		Font f4 = new Font("Arial",Font.BOLD,25);
		
	
		ImageIcon kgf2 = new ImageIcon("IMG/kgf2.jpg");
		lPic = new JLabel(kgf2);
		lPic.setBounds(20,30,kgf2.getIconWidth(),kgf2.getIconHeight());
		lPic.setVisible(true);
		add(lPic);

		lName = new JLabel("K.G.F: Chapter 2");
		lName.setBounds(300,30,300,50);
		lName.setFont(f4);
		add(lName);
		
		lGenre = new JLabel("Action, Drama");
		lGenre.setBounds(300,90,300,50);
		lGenre.setFont(f4);
		add(lGenre);		
		
		lType = new JLabel("2D,IMAX 2D");
		lType.setBounds(300,150,300,50);
		lType.setFont(f4);
		add(lType);
		
		lLenght = new JLabel("2h 48m");
		lLenght.setBounds(300,210,300,50);
		lLenght.setFont(f4);
		add(lLenght);		
		
		lLanguage = new JLabel("Hindi,Telugu,Tamil,Kannaada");
		lLanguage.setBounds(300,270,300,50);
		lLanguage.setFont(f2);
		add(lLanguage);	
		
		lAbout = new JLabel("About Movie:");
		lAbout.setBounds(600,30,500,50);
		lAbout.setFont(f1);
		add(lAbout);		
		
		lDiscribtion = new JLabel("The blood-soaked land of Kolar Gold Fields has a");
		lDiscribtion.setBounds(600,80,500,40);
		lDiscribtion.setFont(f3);
		add(lDiscribtion);
		
		lDiscribtion1 = new JLabel("new overlord now, Rocky, whose name strikes fear in");
		lDiscribtion1.setBounds(600,130,500,40);
		lDiscribtion1.setFont(f3);
		add(lDiscribtion1);
		
		lDiscribtion2 = new JLabel("the heart of his foes. His allies look up to him as their");
		lDiscribtion2.setBounds(600,180,500,40);
		lDiscribtion2.setFont(f3);
		add(lDiscribtion2);		
		
		lDiscribtion3 = new JLabel("Savior, the government sees him as a threat, and his");
		lDiscribtion3.setBounds(600,230,500,40);
		lDiscribtion3.setFont(f3);
		add(lDiscribtion3);		
		
		lDiscribtion4 = new JLabel("enemies are clamouring for revenge.");
		lDiscribtion4.setBounds(600,280,500,40);
		lDiscribtion4.setFont(f3);
		add(lDiscribtion4);
		
		lAvailableShow = new JLabel("Available in Following Cinemas:");
		lAvailableShow.setBounds(20,450,700,40);
		lAvailableShow.setFont(f1);
		add(lAvailableShow);	
		
		lCosmo = new JLabel("Cosmoplex");
		lCosmo.setBounds(30,535,200,50);
		lCosmo.setFont(f4);
		add(lCosmo);		
		
		lGalaxy = new JLabel("Galaxy Cinema");
		lGalaxy.setBounds(300,535,200,50);
		lGalaxy.setFont(f4);
		add(lGalaxy);		
		
		lInox = new JLabel("R World INOX");
		lInox.setBounds(580,535,200,50);
		lInox.setFont(f4);
		add(lInox);		
		
		lRajshree = new JLabel("Rajshree");
		lRajshree.setBounds(860,535,200,50);
		lRajshree.setFont(f4);
		add(lRajshree);
		
		bTickets = new Button("Book Tickets for KGF 2");
		bTickets.setBounds(870,680,250,50);
		bTickets.setFont(f2);
		
		bTickets.addActionListener(al);
		add(bTickets);

		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}