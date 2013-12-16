
//*****************************************************
// Author: Melissa Coram
// Date: January 24, 2013
// Exercise 4, Chapter 2
// Converts the temperature from Celsius to Fahrenheit 
// or Fahrenheit to Celsius when the user enters a 
// temperature.
//*****************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversion extends JFrame {

	private JLabel labelF, labelC;
	private JTextField textF, textC; 
	private FarEventHandler fEventHandler; 
	private CelEventHandler cEventHandler;
	private Container pane;
	
	private static final int WIDTH = 300;
	private static final int HEIGHT = 100;
	
	public TempConversion() {
	
	//set title
	setTitle("Temperature Conversion");
	
	//create labels
	labelF = new JLabel("Fahrenheit: ", SwingConstants.RIGHT);
	labelC = new JLabel("Celsius: ", SwingConstants.RIGHT);
		
	//create text fields
	textF = new JTextField(50);
	textF.setHorizontalAlignment(JTextField.RIGHT);
	fEventHandler = new FarEventHandler();
	textF.addActionListener(fEventHandler);
	
	textC = new JTextField("", 50);
	textC.setHorizontalAlignment(JTextField.RIGHT);
	cEventHandler = new CelEventHandler();
	textC.addActionListener(cEventHandler);
	
	//get container
	pane = getContentPane();
	pane.setLayout(new GridLayout(2,2));
	
	//add labels and text fields
	pane.add(labelF);
	pane.add(textF);
	pane.add(labelC);
	pane.add(textC);
	
	//set width and height of the window and display
	setSize(WIDTH, HEIGHT);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}
	
	//event handler for Fahrenheit to Celsius
	private class FarEventHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
		
			double fahrenheit, celsius;
			
			//get Fahrenheit input
			fahrenheit = Double.parseDouble(textF.getText());
			
			//calculate and display Celsius temperature
			celsius = (fahrenheit - 32) * 5 / 9;
			
			textC.setText("" + String.format("%.2f%n", celsius));
		}
	}
	
	//event handler for Celsius to Fahrenheit
	private class CelEventHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			double fahrenheit, celsius;
			
			//get Celsius input
			celsius = Double.parseDouble(textC.getText());
			
			//calculate and display Fahrenheit temperature
			fahrenheit = ((celsius * 9) / 5) + 32;
			
			textF.setText("" + String.format("%.2f%n", fahrenheit));
			}
	}

	public static void main(String[] args) {

		TempConversion tempObject = new TempConversion();
	}

}
