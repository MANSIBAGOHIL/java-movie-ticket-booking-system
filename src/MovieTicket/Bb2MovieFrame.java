//package MovieTicket;

import java.net.URL;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class Bb2MovieFrame extends JFrame
{
	JLabel lPic,lName,lGenre,lLenght,lType,lLanguage,lAbout,lDiscribtion,lDiscribtion1,lDiscribtion2,lDiscribtion3,lAvailableShow;
	JLabel lCosmo,lInox,lGalaxy,lRajshree;
	Button bTickets;   //bCosmo,bInox,bGalaxy,bRajshree;
	
	MyActionListener al = new MyActionListener(this);
	
	Bb2MovieFrame()
	{
		super("Bhool Bhulaiyaa 2");
		this.setBounds(0, 0, 1200, 800);
		setLayout(null);
		
		Font f1 = new Font("Arial",Font.BOLD,35);
		Font f2 = new Font("SANS_SERIF",Font.PLAIN,32);
		Font f3 = new Font("Arial",Font.PLAIN,20);
		Font f4 = new Font("Arial",Font.BOLD,25);
	
		ImageIcon bb2 = new ImageIcon("IMG/bb2.jpg");
		lPic = new JLabel(bb2);
		lPic.setBounds(20,30,bb2.getIconWidth(),bb2.getIconHeight());
		lPic.setVisible(true);
		add(lPic);

		lName = new JLabel("Bhool Bhulaiyaa 2");
		lName.setBounds(300,30,300,50);
		lName.setFont(f2);
		add(lName);
		
		lGenre = new JLabel("Comedy, Horror");
		lGenre.setBounds(300,90,300,50);
		lGenre.setFont(f2);
		add(lGenre);		
		
		lType = new JLabel("2D");
		lType.setBounds(300,150,300,50);
		lType.setFont(f2);
		add(lType);
		
		lLenght = new JLabel("2h 23m");
		lLenght.setBounds(300,210,300,50);
		lLenght.setFont(f2);
		add(lLenght);		
		
		lLanguage = new JLabel("Hindi");
		lLanguage.setBounds(300,270,300,50);
		lLanguage.setFont(f2);
		add(lLanguage);	
		
		lAbout = new JLabel("About Movie:");
		lAbout.setBounds(600,30,500,50);
		lAbout.setFont(f1);
		add(lAbout);		
		
		lDiscribtion = new JLabel("Set within the sprawling halls of a haveli, Bhool");
		lDiscribtion.setBounds(600,80,500,40);
		lDiscribtion.setFont(f3);
		add(lDiscribtion);
		
		lDiscribtion1 = new JLabel("Bhulaiyaa 2 is a horror movie that is a sequel to the");
		lDiscribtion1.setBounds(600,130,500,40);
		lDiscribtion1.setFont(f3);
		add(lDiscribtion1);
		
		lDiscribtion2 = new JLabel("2007 movie of the same name.");
		lDiscribtion2.setBounds(600,180,500,40);
		lDiscribtion2.setFont(f3);
		add(lDiscribtion2);		
		
		lAvailableShow = new JLabel("Available in Following Cinemas:");
		lAvailableShow.setBounds(20,450,700,40);
		lAvailableShow.setFont(f1);
		add(lAvailableShow);	
		
		lCosmo = new JLabel("Cosmoplex");
		lCosmo.setBounds(20,535,200,50);
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
		
		bTickets = new Button("Book Tickets for Bhoolbhulaiyaa 2"); 
		bTickets.setBounds(850,680,330,50);
		bTickets.setFont(f3);
		
		bTickets.addActionListener(al);
		add(bTickets);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}