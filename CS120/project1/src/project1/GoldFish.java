package project1;

import javax.swing.JOptionPane;

public class GoldFish extends Fish {
	
	public GoldFish() { // constructor
		
	}
	
	public static int newGold() {
		
		String newFishColor[] = {"Black","Gold", "Orange"}; 
		int color = JOptionPane.showOptionDialog(null,"What color Goldfish do you want?", 
				"Welcome to CEJ Aquarium", JOptionPane.INFORMATION_MESSAGE, 3, null,
				newFishColor, newFishColor[0]);
		
		return color; 
		
	}

}
