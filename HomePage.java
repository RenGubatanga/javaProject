package javaSwing1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class HomePage implements ActionListener{
	JFrame frame = new JFrame();
	
	
	JPanel panel_header = new JPanel();
	JPanel panel2 = new JPanel();
	
	JButton button_doctor = new JButton("Doctor");
	JButton button_schedule = new JButton("Schedule");
	JButton button_services = new JButton("services");
	JButton button_home = new JButton("home");
	
	ImageIcon image = new ImageIcon("448456029_7425023110943036_3664779315067943669_n-removebg-preview.png");
	JLabel label = new JLabel();
	
	HomePage(){
	
		frame.setSize(500,400);
		frame.setBounds(520, 200, 500, 400);
		frame.setResizable(false);
		frame.setLayout(null);
		
		label.setIcon(image);
		label.setBounds(0,200,400,170);
		
		panel_header.setBackground(new Color(243,224,147));
		panel_header.setPreferredSize(new Dimension(50,80));
		panel_header.setLayout(null);
		panel_header.setBounds(0, 0, 500, 90);
		
		//panel within panel_header
		panel2.setBackground(new Color(225, 224, 224));
		panel2.setBounds(110, 20,350, 40);
		panel2.setLayout(new FlowLayout());
		
		//add panel2 to header
		panel_header.add(panel2);
	
		button_doctor.addActionListener(this);
		button_schedule.addActionListener(this);
		button_services.addActionListener(this);
		button_home.addActionListener(this);
		
		//buttons add to panel2
		panel2.add(button_doctor);
		panel2.add(button_schedule);
		panel2.add(button_services);
		panel2.add(button_home);
		
		frame.add(label);
		frame.add(panel_header);
		frame.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button_services) {
			new ServicesWindow();
		}
		
	}
}
