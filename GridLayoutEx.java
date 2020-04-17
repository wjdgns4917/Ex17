package com.me;

import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GridLayoutEx extends JFrame{
	
	public GridLayoutEx() {
		setTitle("�׸��巹�̾ƿ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid=new GridLayout(0,2);
		
		grid.setVgap(5);
		grid.setHgap(10);
		
		Container c=getContentPane();
		c.setLayout(grid);
		
		c.add(new JLabel("�̸�"));
		c.add(new TextField(""));
		
		c.add(new JLabel("�й�"));
		c.add(new TextField(""));
		
		c.add(new JLabel("�а�"));
		c.add(new TextField(""));
		
		c.add(new JLabel("����"));
		c.add(new TextField(""));
		
		c.add(new JLabel("����"));
		c.add(new TextField(""));
		
		c.add(new JLabel("����"));
		c.add(new TextField(""));
		
		setSize(500, 300);
		setLocation(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}
