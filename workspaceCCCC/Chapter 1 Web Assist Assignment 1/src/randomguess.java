// House 1/16 ch1 Web Assist Assignment 1

import javax.swing.JOptionPane;

public class randomguess {
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Pick a number 1 through 10");
		
		JOptionPane.showMessageDialog(null,"The number is "+

(1 + (int)(Math.random() * 10)));
		

	}

}
