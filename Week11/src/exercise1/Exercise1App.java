package exercise1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exercise1App extends JFrame {
	
	private Exercise1Panel view;
	
	public Exercise1App(String title)
	{
		super(title);
		
		this.view = new Exercise1Panel();
		this.getContentPane().add(this.view);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200,100);
		this.getContentPane().setLayout(null);
		
		this.view.getCheckBox().addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				eventHandleCheckBox();
			}
		});
	}
	
	private void eventHandleCheckBox()
	{
		if (this.view.getCheckBox().isSelected())
		{
			this.view.getTextField().setEnabled(true);
		}
		else
		{
			this.view.getTextField().setEnabled(false);
		}
	}
	
	public static void main(String[] args) 
	{
		Exercise1App frame = new Exercise1App("Check Box Enable");
		frame.setVisible(true);
	}

}
