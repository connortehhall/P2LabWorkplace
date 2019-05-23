package exercises;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exercise1 extends JFrame {
	
	public Exercise1(String title)
	{
		super(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500,70);
		this.getContentPane().setLayout(null);
		
		JButton button1 = new JButton("Button 1");
		button1.setLocation(20,10);
		button1.setSize(100,30);
		button1.setFont(new Font("Times", Font.PLAIN, 10));
		button1.setForeground(Color.BLUE);
		this.getContentPane().add(button1);
		
		JButton button2 = new JButton("Button 2");
		button2.setLocation(140,10);
		button2.setSize(100,30);
		button2.setFont(new Font("Arial", Font.PLAIN, 10));
		button2.setForeground(Color.RED);
		this.getContentPane().add(button2);
		
		JButton button3 = new JButton("Button 3");
		button3.setLocation(260,10);
		button3.setSize(100,30);
		button3.setFont(new Font("SansSerif", Font.PLAIN, 10));
		button3.setForeground(Color.GREEN);
		this.getContentPane().add(button3);
		
		JButton button4 = new JButton("Button 4");
		button4.setLocation(380,10);
		button4.setSize(100,30);
		button4.setFont(new Font("Courier", Font.PLAIN, 10));
		button4.setForeground(Color.YELLOW);
		this.getContentPane().add(button4);
	}

	public static void main(String[] args) 
	{
		Exercise1 window = new Exercise1("Exercise 1");
		
		window.setVisible(true);
	}

}
