package project1;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Controller extends JFrame {
	
		private static final long serialVersionUID = 1L;
		public static ImageIcon[] fish1; 
		public static ImageIcon[] fish2; 
		public static ImageIcon[] fish3; 
		private JLabel myFish01 = new JLabel();
		private JLabel myFish02 = new JLabel();
		private JLabel myFish03 = new JLabel();
		private boolean isBackwards = false; 
		private boolean isRunning = true; 
		Color myColor = Color.decode("#63D1F4"); 
	
	public Controller() { // constructor

		setSize(575,400);
		Container myContentPane = getContentPane();
	    myContentPane.setLayout(null);
	    myContentPane.setBackground(myColor);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon myFish1 = fish1[0];
		ImageIcon myFish11 = fish1[1];
		
		ImageIcon myFish2 = fish2[1]; 
		ImageIcon myFish22 = fish2[0]; 
		
		ImageIcon myFish3 = fish3[0];
		ImageIcon myFish33 = fish3[1];
		
		myFish01.setLocation(300,0);
		myFish02.setLocation(250,100);
		myFish03.setLocation(200,200);
		
		myFish01.setSize(100,100);
		myFish02.setSize(100,100);
		myFish03.setSize(100,100);
		
		add(myFish01);
		add(myFish02);
		add(myFish03);

		setVisible(true);
		
		do {
			for (int i = 0; i < 1000 && !isBackwards; i++){
				
				myFish01.setIcon(myFish1);
				myFish02.setIcon(myFish2);
				myFish03.setIcon(myFish3);
				
				if (myFish01.getX() <= 460 && myFish02.getX() >= 0 && myFish03.getX() <= 460) {
				myFish01.setLocation(myFish01.getX()+ 4, myFish01.getY()); 
				myFish02.setLocation(myFish02.getX()- 3, myFish02.getY()); 
				myFish03.setLocation(myFish03.getX()+ 2, myFish03.getY()); 
				} else isBackwards = true;
				try {
					Thread.sleep(50);
		    	} catch (InterruptedException e) {
		    		e.printStackTrace();
		    	}
			}
			
			for (int i = 0; i < 1000 && isBackwards; i++){
				
				myFish01.setIcon(myFish11);
				myFish02.setIcon(myFish22);
				myFish03.setIcon(myFish33);
				
				if (myFish01.getX() >= 3 && myFish02.getX() <= 460 && myFish03.getX() >= 3) {
				myFish01.setLocation(myFish01.getX()-4,myFish01.getY());
				myFish02.setLocation(myFish02.getX()+3,myFish02.getY());
				myFish03.setLocation(myFish03.getX()-2,myFish03.getY());
				} else isBackwards = false; 
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace(); 
				}
			} 
		} while(isRunning);
		
	}

	public static void main(String[] args) throws NullPointerException{
		
		
		
		String newFishTank[] = {"New", "Load", "Random", "Exit"}; 
		int create = JOptionPane.showOptionDialog(null,"Welcome to CEJ Aquarium. \n "
				+ "What would you like to do? ", 
				"Welcome to CEJ Aquarium", JOptionPane.INFORMATION_MESSAGE, 3, null,
				newFishTank, newFishTank[0]);
		
		switch(create) {
		case 0: 
			fishOne();
			fishTwo();
			fishThree(); break;
		case 1: break; // try to read from a file for an old aquarium
		case 2: break; // generate a random aquarium
		case 3: System.exit(0);
		case JOptionPane.CLOSED_OPTION: System.exit(0); 
		} 

		@SuppressWarnings("unused")
		Controller myTank = new Controller(); 
		
	}
	
	public static void fishOne() {
		
		fish1 = new ImageIcon[2];
		int color; 
		
		String newFishType[] = {"Angelfish","Betta Fish", "Goldfish"}; 
		int fishType = JOptionPane.showOptionDialog(null,"What kind of fish would you like for your first fish?", 
				"Welcome to CEJ Aquarium", JOptionPane.INFORMATION_MESSAGE, 3, null,
				newFishType, newFishType[0]);
		
		switch(fishType) {
		case 0: 
			color = AngelFish.newAngel(); 
			
			switch(color) {
			case 0: 
				fish1[0] = new ImageIcon("blue-a.png"); 
				fish1[1] = new ImageIcon("blue-a-1.png"); break; 
			case 1: 
				fish1[0] = new ImageIcon("gold-a.png");
				fish1[1] = new ImageIcon("gold-a-1.png"); break; 
			case 2: 
				fish1[0] = new ImageIcon("white-a.png");
				fish1[1] = new ImageIcon("white-a-1.png");
			} break;
		case 1: 
			color = BettaFish.newBetta(); 
			
			switch(color) {
			case 0: 
				fish1[0] = new ImageIcon("blue-b-1.png"); 
				fish1[1] = new ImageIcon("blue-b.png"); break; 
			case 1: 
				fish1[0] = new ImageIcon("green-b-1.png");
				fish1[1] = new ImageIcon("green-b.png"); break; 
			case 2: 
				fish1[0] = new ImageIcon("red-b-1.png");
				fish1[1] = new ImageIcon("red-b.png");
			} break; 
		case 2:
			
			color = GoldFish.newGold(); 
			
			switch(color) {
			case 0: 
				fish1[0] = new ImageIcon("black-g.png");
				fish1[1] = new ImageIcon("black-g-1.png"); break; 
			case 1: 
				fish1[0] = new ImageIcon("gold-g.png");
				fish1[1] = new ImageIcon("gold-g-1.png"); break; 
			case 2: 
				fish1[0] = new ImageIcon("orange-g.png");
				fish1[1] = new ImageIcon("orange-g-1.png");
			} break; 
		case JOptionPane.CLOSED_OPTION: System.exit(0);
		}
	}
	
	protected static void fishTwo() {
		
		fish2 = new ImageIcon[2];
		int color; 
		
		String newFishType[] = {"Angelfish","Betta Fish", "Goldfish"}; 
		int fishType = JOptionPane.showOptionDialog(null,"What kind of fish would you like for your second fish?", 
				"Welcome to CEJ Aquarium", JOptionPane.INFORMATION_MESSAGE, 3, null,
				newFishType, newFishType[0]);
		
		switch(fishType) {
		case 0: 
			color = AngelFish.newAngel(); 
			
			switch(color) {
			case 0: 
				fish2[0] = new ImageIcon("blue-a.png"); 
				fish2[1] = new ImageIcon("blue-a-1.png"); break; 
			case 1: 
				fish2[0] = new ImageIcon("gold-a.png");
				fish2[1] = new ImageIcon("gold-a-1.png"); break; 
			case 2: 
				fish2[0] = new ImageIcon("white-a.png");
				fish2[1] = new ImageIcon("white-a-1.png");
			} break;
		case 1: 
			color = BettaFish.newBetta(); 
			
			switch(color) {
			case 0: 
				fish2[0] = new ImageIcon("blue-b-1.png"); 
				fish2[1] = new ImageIcon("blue-b.png"); break; 
			case 1: 
				fish2[0] = new ImageIcon("green-b-1.png");
				fish2[1] = new ImageIcon("green-b.png"); break; 
			case 2: 
				fish2[0] = new ImageIcon("red-b-1.png");
				fish2[1] = new ImageIcon("red-b.png");
			} break; 
		case 2:
			
			color = GoldFish.newGold(); 
			
			switch(color) {
			case 0: 
				fish2[0] = new ImageIcon("black-g.png");
				fish2[1] = new ImageIcon("black-g-1.png"); break; 
			case 1: 
				fish2[0] = new ImageIcon("gold-g.png");
				fish2[1] = new ImageIcon("gold-g-1.png"); break; 
			case 2: 
				fish2[0] = new ImageIcon("orange-g.png");
				fish2[1] = new ImageIcon("orange-g-1.png");
			} break; 
		case JOptionPane.CLOSED_OPTION: System.exit(0);
		}
		
	}
	
	protected static void fishThree() {
		
		fish3 = new ImageIcon[3];
		int color; 
		
		String newFishType[] = {"Angelfish","Betta Fish", "Goldfish"}; 
		int fishType = JOptionPane.showOptionDialog(null,"What kind of fish would you like for your third fish?", 
				"Welcome to CEJ Aquarium", JOptionPane.INFORMATION_MESSAGE, 3, null,
				newFishType, newFishType[0]);
		
		switch(fishType) {
		case 0: 
			color = AngelFish.newAngel(); 
			
			switch(color) {
			case 0: 
				fish3[0] = new ImageIcon("blue-a.png"); 
				fish3[1] = new ImageIcon("blue-a-1.png"); break; 
			case 1: 
				fish3[0] = new ImageIcon("gold-a.png");
				fish3[1] = new ImageIcon("gold-a-1.png"); break; 
			case 2: 
				fish3[0] = new ImageIcon("white-a.png");
				fish3[1] = new ImageIcon("white-a-1.png");
			} break;
		case 1: 
			color = BettaFish.newBetta(); 
			
			switch(color) {
			case 0: 
				fish3[0] = new ImageIcon("blue-b-1.png"); 
				fish3[1] = new ImageIcon("blue-b.png"); break; 
			case 1: 
				fish3[0] = new ImageIcon("green-b-1.png");
				fish3[1] = new ImageIcon("green-b.png"); break; 
			case 2: 
				fish3[0] = new ImageIcon("red-b-1.png");
				fish3[1] = new ImageIcon("red-b.png");
			} break; 
		case 2:
			
			color = GoldFish.newGold(); 
			
			switch(color) {
			case 0: 
				fish3[0] = new ImageIcon("black-g.png");
				fish3[1] = new ImageIcon("black-g-1.png"); break; 
			case 1: 
				fish3[0] = new ImageIcon("gold-g.png");
				fish3[1] = new ImageIcon("gold-g-1.png"); break; 
			case 2: 
				fish3[0] = new ImageIcon("orange-g.png");
				fish3[1] = new ImageIcon("orange-g-1.png");
			} break; 
		case JOptionPane.CLOSED_OPTION: System.exit(0);
		}
		
	}

}
