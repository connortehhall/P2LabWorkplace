package exercises;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Exercise2 extends JFrame {
	
	private int y = 10;
	
	public Exercise2(String title)
	{
		super(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(230,390);
		this.getContentPane().setLayout(null);
		
		for (int i = 1; i <= 10; i++)
		{
			JTextField text = new JTextField("Text box: " + i);
			text.setBounds(10, this.y, 100, 25);
			this.getContentPane().add(text);
			
			JButton button1 = new JButton("Button " + i);
			button1.setBounds(120, this.y, 100, 25);
			this.getContentPane().add(button1);
			
			this.y += 35;
		}
	}

	public static void main(String[] args) 
	{
		Exercise2 window = new Exercise2("Exercise 2");
		
		window.setVisible(true);
	}

}
