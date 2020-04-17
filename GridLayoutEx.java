package com.me;

import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GridLayoutEx extends JFrame{
	
	public GridLayoutEx() {
		setTitle("그리드레이아웃 샘플");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid=new GridLayout(0,2);
		
		grid.setVgap(5);
		grid.setHgap(10);
		
		Container c=getContentPane();
		c.setLayout(grid);
		
		c.add(new JLabel("이름"));
		c.add(new TextField(""));
		
		c.add(new JLabel("학번"));
		c.add(new TextField(""));
		
		c.add(new JLabel("학과"));
		c.add(new TextField(""));
		
		c.add(new JLabel("과목"));
		c.add(new TextField(""));
		
		c.add(new JLabel("과목"));
		c.add(new TextField(""));
		
		c.add(new JLabel("과목"));
		c.add(new TextField(""));
		
		setSize(500, 300);
		setLocation(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}
