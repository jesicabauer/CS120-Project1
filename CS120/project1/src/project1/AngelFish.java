package project1;

import javax.swing.JOptionPane;

public class AngelFish extends Fish {
	
	public AngelFish() { // constructor
		
	}
	
	public static int newAngel() {
		
		String newFishColor[] = {"Blue","Gold", "White"}; 
		int color = JOptionPane.showOptionDialog(null,"What color Angelfish do you want?", 
				"Welcome to CEJ Aquarium", JOptionPane.INFORMATION_MESSAGE, 3, null,
				newFishColor, newFishColor[0]);
		
		return color; 
	}
	
	

}
