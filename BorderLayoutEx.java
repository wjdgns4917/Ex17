package com.me;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutEx extends JFrame {
	public BorderLayoutEx() {
		setTitle("보더레이아웃");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new BorderLayout(30,20));
		
		c.add(new JButton("cal"),BorderLayout.NORTH);
		c.add(new JButton("sub"),BorderLayout.SOUTH);
//		c.add(new JButton("mul"),BorderLayout.CENTER);
		
		JPanel sub1=new JPanel();
		sub1.setLayout(new FlowLayout());
		sub1.add(new JCheckBox("apple"));
		sub1.add(new JCheckBox("banana"));
		sub1.add(new JCheckBox("kiwi"));
		
		sub1.setBackground(Color.blue);
		c.add(sub1,BorderLayout.CENTER);
		
//		c.add(new JCheckBox("apple"),BorderLayout.CENTER);
//		c.add(new JCheckBox("banana"),BorderLayout.CENTER);
//		c.add(new JCheckBox("kiwi"),BorderLayout.CENTER);
		
		setSize(500, 300);
		setVisible(true);	
	}
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}
