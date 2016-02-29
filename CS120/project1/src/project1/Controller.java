package project1;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Controller extends JFrame {
		private JLabel myFish01 = new JLabel();
		private JLabel myFish02 = new JLabel();
		private JLabel myFish03 = new JLabel();
		Color myColor = Color.decode("#63D1F4"); 
	
	public Controller() { // constructor

		setSize(575,400);
		Container myContentPane = getContentPane();
	    myContentPane.setLayout(null);
	    myContentPane.setBackground(myColor);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		ImageIcon myFish1 = new ImageIcon("black-g.png");
		ImageIcon myFish2 = new ImageIcon("gold-a-1.png"); 
		ImageIcon myFish3 = new ImageIcon("red-b.png");
		myFish01.setIcon(myFish1);
		myFish02.setIcon(myFish2);
		myFish03.setIcon(myFish3);
		myFish01.setLocation(0,0);
		myFish02.setLocation(100,100);
		myFish03.setLocation(200,200);
		myFish01.setSize(100, 100);
		myFish02.setSize(100,100);
		myFish03.setSize(100,100);
		add(myFish01);
		add(myFish02);
		add(myFish03);
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		
		Controller myTank = new Controller(); 
		
		String newFishTank[] = {"New", "Load", "Random", "Exit"}; 
		int create = JOptionPane.showOptionDialog(null,"Welcome to CEJ Aquarium. \n "
				+ "What would you like to do? ", 
				"Welcome to CEJ Aquarium", JOptionPane.INFORMATION_MESSAGE, 3, null,
				newFishTank, newFishTank[0]);
		
		switch(create) {
		case 0: newAquarium(); break;
		case 1: break; // try to read from a file for an old aquarium
		case 2: break; // generate a random aquarium
		case 3: System.exit(0);
		case JOptionPane.CLOSED_OPTION: System.exit(0); 
		} 

	}
	
	protected static void newAquarium() {
		int count = 0; 
		String newFishCount[] = {"1","2","3"}; 
		int fishCount = JOptionPane.showOptionDialog(null,"How many fish would you like? ", 
				"Welcome to CEJ Aquarium", JOptionPane.INFORMATION_MESSAGE, 3, null,
				newFishCount, newFishCount[0]);
		
		switch(fishCount) {
		case 0: count = 1; break; 
		case 1: count = 2; break; 
		case 2: count = 3; break; 
		case JOptionPane.CLOSED_OPTION: System.exit(0);
		}
		
		do {
			String newFishType[] = {"Angelfish","Betta Fish", "Goldfish"}; 
			int fishType = JOptionPane.showOptionDialog(null,"How many fish would you like? ", 
					"Welcome to CEJ Aquarium", JOptionPane.INFORMATION_MESSAGE, 3, null,
					newFishType, newFishType[0]);
			
			switch(fishType) {
			case 0: 
				AngelFish.newAngel(); 
				count--; break; // pass back the ImageIcon from the fish
			case 1: 
				BettaFish.newBetta(); 
				count--; break; // pass back the ImageIcon from the fish
			case 2: 
				GoldFish.newGold(); 
				count--; break; // pass back the ImageIcon from the fish
			case JOptionPane.CLOSED_OPTION: System.exit(0);
			}
		} while(count > 0);
		
		
	}
	
	protected static void fishOne() {
		
	}

}
