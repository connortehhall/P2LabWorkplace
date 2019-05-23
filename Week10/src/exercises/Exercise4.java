package exercises;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exercise4 extends JFrame {
	
	public Exercise4(String title)
	{
		super(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(140,160);
		this.getContentPane().setLayout(null);
		
		JButton button1 = new JButton("Press Me");
		button1.setBounds(20, 20, 100, 100);
		this.getContentPane().add(button1);
		
		button1.addActionListener(new ActionListener() 
		{
			private int pressed = 1;

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println("Button pressed: " + this.pressed + " times");
				this.pressed  += 1;
			}
		});
	}

	public static void main(String[] args) 
	{
		Exercise4 window = new Exercise4("Exercise 4");
		
		window.setVisible(true);
	}

}
