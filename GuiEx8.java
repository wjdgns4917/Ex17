package com.me;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiEx8 extends JFrame{
	
	public GuiEx8() {
		
		setTitle("여러개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new BorderLayout(30,20));
		
		JPanel sub1=new JPanel();
		sub1.add(new JButton("열기"));
		sub1.add(new JButton("닫기"));
		sub1.add(new JButton("나가기"));
		sub1.setBackground(Color.gray);
		c.add(sub1,BorderLayout.NORTH);
		
		JPanel sub2=new JPanel();
		sub2.setLayout(null);
		
		int x=0,y=0;
		for (int i = 0; i < 10; i++) {
			x=(int)(Math.random()*250)+20;
			y=(int)(Math.random()*300)+100;
			JLabel l1=new JLabel("*");
			l1.setForeground(Color.red);
			l1.setLocation(x, y);
			l1.setSize(20,20);
			sub2.add(l1);
		}
		c.add(sub2,BorderLayout.CENTER);
		
//		JLabel l1=new JLabel("*");
//		l1.setForeground(Color.red);
//		l1.setLocation(100, 150);
//		l1.setSize(20,20);
//		sub2.add(l1);
//		c.add(sub2,BorderLayout.CENTER);
	
		JPanel sub3=new JPanel();
		sub3.add(new JButton("Word Input"));
		sub3.add(new JTextField("",15));
		sub3.setBackground(Color.yellow);
		c.add(sub3,BorderLayout.SOUTH);
		
		setSize(300, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GuiEx8();
	}
}
