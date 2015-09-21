import javax.swing.JOptionPane;

// Exercise3.java
// X If/Then/Else and nested If/Then/Else
// Switch/Case
// And/Or operator && ||
// X while or do/while loop
// for loop and nested loop
// graphics object in a JFrame
// using eGit
// using the Debugger

public class Exercise3 { // declares a public class

	public static void main(String[] args) { 
		
		int str;
		int intl; 
		int chm; 
		int remain1; 
		int remain2; 
		int remain = 20; 
			
		//prompt user to enter name
		String name = 
				JOptionPane.showInputDialog("Welcome to Cafe Mord.\n What is your name? "); 
		
		//show message with JOptionPane, Information style
		JOptionPane.showMessageDialog(null, name + "! I thought you looked familiar! Let's get started.",name,JOptionPane.INFORMATION_MESSAGE);
		
		while ( remain != 0 ) {
		
		remain = 0; 
		
		JOptionPane.showMessageDialog(null, "You will have 20 points to assign to strength, intelligence, and charisma.\n"
				+ "Assign all of them! It will affect your gameplay.",name,JOptionPane.INFORMATION_MESSAGE);
		
		//prompt user to enter strength level
		String strength =
				JOptionPane.showInputDialog("How strong are you?\n"
						+ "Points Remaining: 20" );
		str = 0;
		str = Integer.parseInt(strength);
		
		remain1 = 20 - str;
		
		//prompt user to enter intelligence level
		String smarts =
				JOptionPane.showInputDialog("How intelligent are you?\n"
						+ "Points Remaining: " + remain1 );
		intl = 0;
		intl = Integer.parseInt(smarts);
		
		remain2 = remain1 - intl; 
		
		//prompt user to enter charisma level
		String charm =
				JOptionPane.showInputDialog("How charismatic are you?\n"
						+ "Points Remaining: "+remain2);
		chm = 0; 
		chm = Integer.parseInt(charm);
		
		remain = 20 - str - intl - chm; 
		if (remain == 0) {
			break;
		}
		
		}
		
	}
}