package exercise2;

import javax.swing.JFrame;

public class Exercise2App extends JFrame {

	private Exercise2Panel view;
	private Exercise2Database left;
	private Exercise2Database right;
	
	public Exercise2App(String title)
	{
		super(title);
		
		this.view = new Exercise2Panel();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,240);
		this.getContentPane().setLayout(null);
		this.getContentPane().add(this.view);
	}
	
	public static void main(String[] args) 
	{
		Exercise2App window = new Exercise2App("Shopping Cart");
		window.setVisible(true);
	}

}
