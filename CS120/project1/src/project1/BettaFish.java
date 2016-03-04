package project1;

import javax.swing.JOptionPane;

public class BettaFish extends Fish {
	
	public BettaFish() { // constructor

	}
	
	public static int newBetta() {
		
		String newFishColor[] = {"Blue","Green", "Red"}; 
		int color = JOptionPane.showOptionDialog(null,"What color Bettafish do you want?", 
				"Welcome to CEJ Aquarium", JOptionPane.INFORMATION_MESSAGE, 3, null,
				newFishColor, newFishColor[0]);
		
		return color; 
	}

}


