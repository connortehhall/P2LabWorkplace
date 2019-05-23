package examples;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI extends JFrame {

	public GUI(String title)
	{
		super(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(300,300);
		
		this.getContentPane().setLayout(null);
		
		JButton addButton = new JButton("Add");
		addButton.setLocation(175,10);
		addButton.setSize(100,25);
		this.getContentPane().add(addButton);
	}
	
	public static void main(String[] args) 
	{
		GUI app = new GUI("Test");
		
		app.setVisible(true);
	}

}
