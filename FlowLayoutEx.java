package com.me;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame {
	
	public FlowLayoutEx() {
		setTitle("flowlayout sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 50));
		
		c.add(new JButton("add"));
		c.add(new JButton("add"));
		c.add(new JButton("add"));
		c.add(new JButton("add"));
		c.add(new JButton("add"));
		c.add(new JButton("add"));
		
		setSize(300, 300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}
