import javax.swing.JOptionPane;

// Exercise3.java
// X If/Then/Else and nested If/Then/Else
// X Switch/Case
// And/Or operator && ||
// X while or do/while loop
// for loop and nested loop
// graphics object in a JFrame
// X using eGit
// X using the Debugger

public class Exercise3 { // declares a public class

	public static void main(String[] args) { 
		
// begin character creation sequence		
		
		int str;
		int intl; 
		int chm; 
		int remain1; 
		int remain2; 
		int remain = 20; 
		int agree; 
			
		//prompt user to enter name
		String name = 
				JOptionPane.showInputDialog("Welcome to Cafe Mord.\n What is your name? "); 
		
		//show message with JOptionPane, Information style
		JOptionPane.showMessageDialog(null, name + "! I thought you looked familiar! Let's get started.",name,JOptionPane.INFORMATION_MESSAGE);
		
		do {
		
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
		
		} while ( remain != 0 ); 
		
// end character creation sequence
// begin choice to play the game
		
		JOptionPane.showMessageDialog(null, "Recently, we've been having some... Issues. \n"
				+ "Guests have been going missing and turning up. Dead. Here. In the cafe.", name ,JOptionPane.INFORMATION_MESSAGE);
		do {
		String yeah = 
				JOptionPane.showInputDialog("Can you help? \n"
						+ "(Yes or No)"); 
		String play = yeah.toUpperCase();
	
		switch (play){ // switch case from Dave Marshall and Deitel textbook

			case "YES": 
	    	   String yes = 
				String.format("Thank you! Please, %s, come in! Come in.", name); 
	    	   JOptionPane.showMessageDialog(null, yes,"Thank you!",JOptionPane.INFORMATION_MESSAGE);
	    	   agree = 1; 
	    	   break; 
	    	   
	       case "NO":
	    	   JOptionPane.showMessageDialog(null, "Well, then. You best be going. \n"
	    	   		+ "Wouldn't want something happening to you.  ",name,JOptionPane.INFORMATION_MESSAGE);
	    	   agree = 1;
	    	   break;
	    	   
	       default: 
	    	   JOptionPane.showMessageDialog(null, "What was that? I didn't hear you...", name ,JOptionPane.INFORMATION_MESSAGE);
	    	 
	    	   agree = 0; 
					} 
		
	       } while ( agree == 0 ); 
	
// Begin actual game play 	
		
	}
}