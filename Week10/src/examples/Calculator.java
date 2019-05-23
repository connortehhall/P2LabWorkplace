package examples;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class Calculator extends JFrame {

	public Calculator(String title)
	{
		super(title);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(405,275);
		this.getContentPane().setLayout(null);
		//this.getContentPane().setBackground(Color.DARK_GRAY);
		
		JTextField textField = new JTextField(10);
		textField.setBounds(10,10,255,30);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		this.getContentPane().add(textField);
		
		DefaultListModel<String> model = new DefaultListModel<>();
		JList<String> equations = new JList<String>( model );
		equations.setBounds(275,13,115,183);
		this.getContentPane().add(equations);
		
		JScrollPane scroll = new JScrollPane(equations,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(275,13,115,183);
		this.getContentPane().add(scroll);
		
		// first row
		JButton ac = new JButton("AC");
		ac.setBounds(7,50,60,30);
		this.getContentPane().add(ac);
		
		ac.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		
		JButton plus_minus = new JButton("+\\-");
		plus_minus.setBounds(74,50,60,30);
		this.getContentPane().add(plus_minus);
		
		plus_minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() != 0) {
					if (textField.getText().substring(textField.getText().length()-1,textField.getText().length()).equals("-")) {
						textField.setText(textField.getText().substring(0,textField.getText().length()-1));
					}
					else {
						textField.setText(textField.getText() + "-");
					}
				}
				else {
					textField.setText("-");
				}
			}
		});
		
		JButton percentage = new JButton("%");
		percentage.setBounds(141,50,60,30);
		this.getContentPane().add(percentage);
		
		// TODO: percentage calculation
		
		JButton plus = new JButton("+");
		plus.setBounds(208,50,60,30);
		this.getContentPane().add(plus);
		
		plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() != 0) {
					try
					{
						if (Integer.valueOf(textField.getText().substring(textField.getText().length()-1,textField.getText().length())) != null);
						{
							textField.setText(textField.getText() + "+");
						}
					}
					catch(NumberFormatException f){
					}
				}
			}
		});
		
		// second row
		JButton seven = new JButton("7");
		seven.setBounds(7,90,60,30);
		this.getContentPane().add(seven);
		
		seven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + 7);
			}
		});
		
		JButton eight = new JButton("8");
		eight.setBounds(74,90,60,30);
		this.getContentPane().add(eight);
		
		eight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + 8);
			}
		});
		
		JButton nine = new JButton("9");
		nine.setBounds(141,90,60,30);
		this.getContentPane().add(nine);
		
		nine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + 9);
			}
		});
		
		JButton minus = new JButton("-");
		minus.setBounds(208,90,60,30);
		this.getContentPane().add(minus);
		
		minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() != 0) {
					try
					{
						if (Integer.valueOf(textField.getText().substring(textField.getText().length()-1,textField.getText().length())) != null);
						{
							textField.setText(textField.getText() + "-");
						}
					}
					catch(NumberFormatException f){
					}
				}
			}
		});
		
		// third row
		JButton four = new JButton("4");
		four.setBounds(7,130,60,30);
		this.getContentPane().add(four);
		
		four.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + 4);
			}
		});
		
		JButton five = new JButton("5");
		five.setBounds(74,130,60,30);
		this.getContentPane().add(five);
		
		five.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + 5);
			}
		});
		
		JButton six = new JButton("6");
		six.setBounds(141,130,60,30);
		this.getContentPane().add(six);
		
		six.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + 6);
			}
		});
		
		JButton multiply = new JButton("x");
		multiply.setBounds(208,130,60,30);
		this.getContentPane().add(multiply);
		
		multiply.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() != 0) {
					try
					{
						if (Integer.valueOf(textField.getText().substring(textField.getText().length()-1,textField.getText().length())) != null);
						{
							textField.setText(textField.getText() + "x");
						}
					}
					catch(NumberFormatException f){
					}
				}
			}
		});
		
		// fourth row
		JButton one = new JButton("1");
		one.setBounds(7,170,60,30);
		this.getContentPane().add(one);
		
		one.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + 1);
			}
		});
		
		JButton two = new JButton("2");
		two.setBounds(74,170,60,30);
		this.getContentPane().add(two);
		
		two.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + 2);
			}
		});
		
		JButton three = new JButton("3");
		three.setBounds(141,170,60,30);
		this.getContentPane().add(three);
		
		three.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + 3);
			}
		});
		
		JButton divide = new JButton("/");
		divide.setBounds(208,170,60,30);
		this.getContentPane().add(divide);
		
		divide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() != 0) {
					try
					{
						if (Integer.valueOf(textField.getText().substring(textField.getText().length()-1,textField.getText().length())) != null);
						{
							textField.setText(textField.getText() + "/");
						}
					}
					catch(NumberFormatException f){
					}
				}
			}
		});
		
		// fifth row
		JButton zero = new JButton("0");
		zero.setBounds(7,210,127,30);
		this.getContentPane().add(zero);
		
		zero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + 0);
			}
		});
		
		JButton point = new JButton(".");
		point.setBounds(141,210,60,30);
		this.getContentPane().add(point);
		
		point.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		
		JButton equal = new JButton("=");
		equal.setBounds(208,210,60,30);
		this.getContentPane().add(equal);
		
		JButton clear = new JButton("Clear Log");
		clear.setBounds(268,210,128,30);
		this.getContentPane().add(clear);
		
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.clear();
			}
		});
		
		equal.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<Integer> num = new ArrayList<Integer>();
				ArrayList<String> operations = new ArrayList<String>();
				
				char[] text = textField.getText().toCharArray();
				
				String number = "";
				
				for (int i = 0; i < text.length; i++) {
					if (Character.isDigit(text[i])) {
						number+=text[i];
						
						if (i == text.length - 1) {
							num.add(Integer.valueOf(number));
						}
					}
					else {
						num.add(Integer.valueOf(number));
						number = "";
						operations.add(Character.toString(text[i]));
					}
				}
				
				while (operations.size() != 0) {
					int index = 0;
					
					for (int j = 0; j < operations.size(); j++) {
						if (operations.get(j).equals("x") || operations.get(j).equals("/")) {
							index = j;
						}
					}
					
					if (operations.get(index).equals("x")) {
						int ans = num.get(index) * num.get(index+1);
						num.remove(index + 1);
						num.set(index, ans);
					}
					else if (operations.get(index).equals("/")) {
						int ans = num.get(index) / num.get(index+1);
						num.remove(index + 1);
						num.set(index, ans);
					}
					else if (operations.get(index).equals("+")) {
						int ans = num.get(index) + num.get(index+1);
						num.remove(index + 1);
						num.set(index, ans);
					}
					else {
						int ans = num.get(index) - num.get(index+1);
						num.remove(index + 1);
						num.set(index, ans);
					}

					operations.remove(index);
				}
				
				String equation = textField.getText() + "=" + num.get(0);
				model.addElement(equation);

				textField.setText("");
			}
		});
	}
	
	public static void main(String[] args) 
	{
		Calculator calculator = new Calculator("Calculator");
		calculator.setVisible(true);
	}
}
