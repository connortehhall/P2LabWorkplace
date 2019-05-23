package exercise2;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Exercise2Panel extends JPanel {

	private Exercise2Database leftList;
	private Exercise2Database rightList;
	
	private JList<String> left;
	private JList<String> right;
	
	private JButton toRight;
	private JButton toLeft;
	
	private JScrollPane leftScroll;
	private JScrollPane rightScroll;

	public JList<String> getLeft() {
		return this.left;
	}

	public void setLeft(JList<String> left) {
		this.left = left;
	}

	public JList<String> getRight() {
		return this.right;
	}

	public void setRight(JList<String> right) {
		this.right = right;
	}

	public JButton getToRight() {
		return toRight;
	}

	public void setToRight(JButton toRight) {
		this.toRight = toRight;
	}

	public JButton getToLeft() {
		return toLeft;
	}

	public void setToLeft(JButton toLeft) {
		this.toLeft = toLeft;
	}
	
	public Exercise2Panel()
	{
		setSize(400,240);
		setLayout(null);
		
		this.left = new JList<String>(this.leftList);
		this.left.setBounds(10,10,150,200);
		this.add(left);
		
		this.right = new JList<String>();
		this.right.setBounds(240,10,150,200);
		this.add(right);
		
		this.toRight = new JButton("->");
		this.toRight.setBounds(170,80,60,25);
		this.add(toRight);
		
		this.toLeft = new JButton("<-");
		this.toLeft.setBounds(170,120,60,25);
		this.add(toLeft);
		
		this.leftScroll = new JScrollPane(this.left, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.leftScroll.setBounds(10,10,150,200);
		this.add(leftScroll);
		
		this.rightScroll = new JScrollPane(this.right, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.rightScroll.setBounds(240,10,150,200);
		this.add(rightScroll);
		
	}
}










