package quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
	JButton rules, back;
	JTextField tfname;
	Login(){
		getContentPane().setBackground(Color.WHITE); //in awt package
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));  //in jframe class
		JLabel image= new JLabel(i1);
		add(image);  // to add image on frame
		// swing gives us layouts to manage how you want components to be placed inside of the frame, but we can create our own layouts too
		setLayout(null); // to tell swing we don't want to use it's layouts
		image.setBounds(0,0,600,500); //left, top, length, width
		
		JLabel heading= new JLabel("Simple Minds");
		heading.setBounds(750,60,300,45);
		heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40)); //font family, font type, font size
		heading.setForeground(new Color(30, 144, 254)); // or Color.BLUE
		add(heading);
		
		JLabel name= new JLabel("Simple Minds");
		name.setBounds(825,150,300,20);
		name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18)); //font family, font type, font size
		name.setForeground(new Color(30, 144, 254)); // or Color.BLUE
		add(name);
		
		tfname= new JTextField();
		tfname.setBounds(742, 200, 300, 25); // without setBounds we cannot add it to te frame
		tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
		add(tfname);
		
		rules = new JButton("Rules");
		rules.setBounds(743, 270, 120, 25);
		rules.setBackground(new Color(30, 144, 254));
		rules.setForeground(Color.WHITE);
		rules.addActionListener(this);
		add(rules);
		
		back = new JButton("Back");
		back.setBounds(922, 270, 120, 25);
		back.setBackground(new Color(30, 144, 254));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		
		setSize(1200, 500); //by default only header
		setLocation(40,110); //by default location top-left
		setVisible(true);  // frame is by default hidden which is why we need to set it true
	}
	
	public void actionPerformed(ActionEvent ae) {   //override
		if(ae.getSource()==rules) {
			String name= tfname.getText(); // can get anything entered by the user
			setVisible(false);
			new Rules(name);
		}else if(ae.getSource()==back) {
			setVisible(false);
		}
	}
	
    public static void main(String[] args) {
    	new Login(); //anonymous object 
    }
}
