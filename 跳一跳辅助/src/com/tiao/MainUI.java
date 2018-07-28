package com.tiao;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MainUI extends JFrame {
	
	public JButton button_conn =new JButton("连接手机");
	public JButton button_start = new JButton("开始作弊");
	
	public JLabel icon = new JLabel("aaa");
	public JLabel icon2 = new JLabel("bbbb");
	
	public JScrollPane jScrollPane = new JScrollPane();
	public JTextArea area = new JTextArea();
	
	public ADB_Shell_Util adb_Shell_Util = new ADB_Shell_Util();
	Listener_Conn conn = new Listener_Conn();
	Listener_Start start = new Listener_Start();
	public MainUI() {
		
		//监听
		button_conn.addActionListener(conn);
		conn.setMainui(this);
		button_start.addActionListener(start);
		start.setMainui(this);
		//----
		adb_Shell_Util.setMainUI(this);
		
		this.setLayout(null);
		button_conn.setBounds(10, 50, 100, 40);
		button_start.setBounds(150, 50, 100, 40);
		icon.setBounds(10, 100, 150, 600);
		icon2.setBounds(170,100, 150, 600);
		jScrollPane.setViewportView(area);
		jScrollPane.setBounds(330, 100, 600, 600);
		
		icon.setBackground(Color.RED);
		icon2.setBackground(Color.GREEN);
		this.add(button_conn);
		this.add(button_start);
		this.add(icon);
		this.add(icon2);
		this.add(jScrollPane);
		this.setSize(1000, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.repaint();
	}
	public static void main(String[] args) {
		new MainUI();
	}

}
