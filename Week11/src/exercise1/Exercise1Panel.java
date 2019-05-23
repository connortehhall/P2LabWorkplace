package exercise1;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercise1Panel extends JPanel {
	
	private JCheckBox checkBox;
	private JLabel label;
	private JTextField textField;
	
	public JCheckBox getCheckBox()
	{
		return this.checkBox;
	}
	
	public JLabel getLabel()
	{
		return this.label;
	}
	
	public JTextField getTextField()
	{
		return this.textField;
	}
	
	public Exercise1Panel()
	{
		this.checkBox = new JCheckBox();
		checkBox.setBounds(7,10,25,25);
		this.add(checkBox);
		
		this.label = new JLabel("Enable Input");
		label.setBounds(35,10,100,25);
		this.add(label);
		
		this.textField = new JTextField("User Input");
		textField.setBounds(10,40,180,25);
		textField.setEnabled(false);
		this.add(textField);

		setSize(200,100);
		setLayout(null);
	}
}















