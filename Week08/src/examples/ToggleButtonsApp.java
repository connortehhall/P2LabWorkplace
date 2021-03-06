package examples;

import java.awt.*; // Needed for Color
import java.awt.event.*; // Needed for ActionListener and ActionEvent
import javax.swing.*; // Needed for JFrame and JButton
/**
 * 
 * @author Mark Lanthier
 * @see <a href=
 *      "http://people.scs.carleton.ca/~lanthier/teaching/COMP1406/Notes/Code/Chapter5/">
 *      ToggleButtonsApp</a>
 *
 */
public class ToggleButtonsApp extends JFrame implements ActionListener {
	JButton[][] buttons; // This stores all buttons

	public ToggleButtonsApp(String title) {
		super(title);
		getContentPane().setLayout(null);

		buttons = new JButton[4][3];
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 3; col++) {
				buttons[row][col] = new JButton();
				buttons[row][col].setLocation(10 + col * 55, 10 + row * 55);
				buttons[row][col].setSize(50, 50);
				buttons[row][col].addActionListener(this);

				// Pick a random color for the button
				if (Math.random() < 0.5)
					buttons[row][col].setBackground(Color.black);
				else
					buttons[row][col].setBackground(Color.white);
				getContentPane().add(buttons[row][col]);
			}
		}
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(195, 275);
	}

	// This is the single event handler for all the buttons
	public void actionPerformed(ActionEvent e) {
		// Find the row and column of the pressed button
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 3; col++) {
				if (e.getSource() == buttons[row][col]) {
					System.out.println("You pressed the button at row: " + row + ", column: " + col + ".");
					// Now toggle the button's color
					if (buttons[row][col].getBackground() == Color.black)
						buttons[row][col].setBackground(Color.white);
					else
						buttons[row][col].setBackground(Color.black);
				}
			}
		}
	}

	public static void main(String args[]) {
		ToggleButtonsApp frame = new ToggleButtonsApp("Toggle");
		frame.setVisible(true);
	}
}