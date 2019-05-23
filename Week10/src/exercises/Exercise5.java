package exercises;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise5 extends JFrame {
	
	public Exercise5(String title)
	{
		super(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(200,220);
		this.getContentPane().setLayout(null);
		
		JLabel label = new JLabel();
		label.setBounds(20,20,160,25);
		this.getContentPane().add(label);
		
		JButton button = new JButton("Random Phrase");
		button.setBounds(20, 65, 160, 100);
		this.getContentPane().add(button);
		
		button.addActionListener(new ActionListener() 
		{
			String phrase[] = {"Hello World", "How's your day?", "What are you doing?", "Programming", "Uni studies!"};
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Random rand = new Random();
				int randomNumber = rand.nextInt(5);
				
				label.setText(this.phrase[randomNumber]);
			}
		});
	}

	public static void main(String[] args) 
	{
		Exercise5 window = new Exercise5("Exercise 5");
		
		window.setVisible(true);
	}

}
