//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		
 String nickel = JOptionPane.showInputDialog("how many nickels u haves?");

int a = Integer.parseInt(nickel)*5;

String dime = JOptionPane.showInputDialog("what amount of dime lighjts do u hav?");

int b = Integer.parseInt(dime)*10;

String quarter = JOptionPane.showInputDialog("how many quarters does yOU posesss?");
		
int c = Integer.parseInt(quarter)*25;
	
double amount = a+b+c;

JOptionPane.showMessageDialog(null, "You Have " +amount/100 +" dollars!");


// Ask the user how many nickels they have
		// Convert their answer to an int using Integer.parseInt()
// Ask the user how many dimes they have, and convert their answer
// Ask the user how many quarters they have, and convert their answer




// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have

	}
}