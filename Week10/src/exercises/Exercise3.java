package exercises;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ScrollPaneConstants;

public class Exercise3 extends JFrame {

	public Exercise3(String title)
	{
		super(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(380,300);
		this.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Film list");
		label.setBounds(10,10,280,25);
		this.getContentPane().add(label);
		
		String movies[] = {"Test", "Test", "Test"};
		JList<String> list = new JList<String>(movies);
		list.setBounds(10,35,135,260);
		this.getContentPane().add(list);
		
		JTextField textField = new JTextField();
		textField.setBounds(155,35,135,25);
		this.getContentPane().add(textField);
		
		String ratings[] = {"Good", "OK", "Bad", "Really Bad"};
		JComboBox<String> rate = new JComboBox<String>(ratings);
		rate.setBounds(155,70,135,25);
		this.getContentPane().add(rate);
		
		JScrollPane scroll = new JScrollPane(list,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(10,35,135,230);
		this.getContentPane().add(scroll);
	}
	
	public static void main(String[] args) 
	{
		Exercise3 window = new Exercise3("Exercise 3");
		
		window.setVisible(true);
	}

}
