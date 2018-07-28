
import java.awt.Component;

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
for(int i =0; i<87235; i++) {
		// 1. Get 2 numbers from the user and convert them to integer.
		String num1 = JOptionPane.showInputDialog("1st number!");
		String num2 = JOptionPane.showInputDialog("2st number!");

		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "what would you like to do with your number?", "Calculator",
				0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Subtract", "Add", "Multiply", "Divide" },
				null);
int nume1 = Integer.parseInt(num1);
int nume2 = Integer.parseInt(num2);
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate
		// operation.
		System.out.println(operation);
		if (operation == 0) {
			sub(nume1,nume2);
		}
		System.out.println(operation);
		if (operation == 1) {
			add(nume1,nume2);
		}
		System.out.println(operation);
		if (operation == 2) {
			mul(nume1,nume2);
		}
		System.out.println(operation);
		if (operation == 3) {
			div(nume1,nume2);
		}
}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }
	static void add(int num1, int num2) {

		int num3 = num1 + num2;

		JOptionPane.showMessageDialog(null, num3);
	}

	static void sub(int num1, int num2) {

		int num3 = num1 - num2;

		JOptionPane.showMessageDialog(null, num3);
	}

	static void div(int num1, int num2) {

		int num3 = num1 / num2;

		JOptionPane.showMessageDialog(null, num3);
	}

	static void mul(int num1, int num2) {

		int num3 = num1 * num2;

		JOptionPane.showMessageDialog(null, num3);
	}

}
// 4. Create similar methods for subtraction, multiplication and division.
